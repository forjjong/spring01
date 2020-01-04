package com.forjjong.controller.user;

import com.forjjong.biz.user.UserService;
import com.forjjong.biz.user.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/login.do", method= RequestMethod.GET)
    public String loginView(@ModelAttribute("user") UserVO vo) {
        System.out.println("loginView 호출");
        vo.setUserId("사용자 아이디");
        vo.setPassword("사용자 암호");
        return "forward:login.jsp";
    }

    @RequestMapping(value="/login.do", method= RequestMethod.POST)
    public String login( HttpServletRequest request, @ModelAttribute("user") UserVO vo) {
        System.out.println("login 호출");
        UserVO loginUser = userService.loginUser(vo);
        if(loginUser != null) {
            System.out.println("login 완료 : " + loginUser.toString());
            request.getSession().setAttribute("loginInfo",loginUser);
            return "forward:getBoardList.do";
        }
        else {
            System.out.println("login no user");
            return "forward:login.jsp";
        }
    }

    @RequestMapping(value="/create_account.do", method= RequestMethod.GET)
    public String createAccountView(UserVO vo) {
        System.out.println("createAccountView 호출");
        return "redirect:create_account.jsp";
    }

    @RequestMapping(value="/create_account.do", method= RequestMethod.POST)
    public String createAccount(UserVO vo) {
        System.out.println("createAccount 호출");
        userService.insertUser(vo);
        return "redirect:index.jsp";
    }

    @RequestMapping(value="/logout.do")
    //public String logout(HttpSession session) {
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:index.jsp";
    }
}

/*
1. public String function ( object(VO) )
: String이 지정한 View만 반환하고 Model의 반환은 없음.

2. public String function ( @ModelAttribute("object") object(VO) )
: String이 지정한 View를 반환하고 입력 파라미터인 object를 Model로 반환.

3. public String function ( Model model )
: String이 지정한 View을 반환하고 Model을 설정하여 반환.

4. public String function ( object(VO), Model model )
: String이 지정한 View을 반환하고 Model을 설정하여 반환. 입력 파라미터인 object는 내부처리용으로만 사용

5. public ModelAndView content()
: Model과 View를 동시에 설정하여 반환

(*) Model vs ModelMap
Model은 인터페이스, ModelMap은 실제 구현 객체
즉, public String function (Model model ) = public String function (ModelMap model )
 */