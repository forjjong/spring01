package com.forjjong.controller.board;

import com.forjjong.biz.board.BoardService;
import com.forjjong.biz.board.BoardVO;
import com.forjjong.biz.user.UserService;
import com.forjjong.biz.user.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    @RequestMapping(value="/getBoardList.do")
    public String getBoardList(HttpServletRequest request, BoardVO vo, Model model) {
        System.out.println("BoardController : getBoardList 처리");
        UserVO loginUser = (UserVO)request.getSession().getAttribute("loginInfo");
        model.addAttribute("user", loginUser); // Model 정보 저장
        model.addAttribute("boardList", boardService.getBoardList(vo)); // Model 정보 저장
        return "getBoardList";  // View 이름 리턴
        //return "redirect:/WEB-INF/boards/getBoardList.jsp";  // View 이름 리턴
    }

    @RequestMapping(value="/insertBoard.do", method = RequestMethod.POST)
    //public String insertBoard(BoardVO vo, Model model) {
    public String insertBoard(HttpServletRequest request, BoardVO vo) {
        UserVO uservo = (UserVO) request.getSession().getAttribute("loginInfo");
        vo.setUserIdx(uservo.getUserIdx());
        vo.setUserName(uservo.getName());
        System.out.println("BoardController : insertBoard2 " + vo.toString());
        boardService.insertBoard(vo);
        return "forward:getBoardList.do";  // View 이름 리턴
    }

    @RequestMapping(value="/getBoard.do")
    public String getBoard(HttpServletRequest request, BoardVO vo, Model model) {
        System.out.println("BoardController : getBoard 처리");
        UserVO loginUser = (UserVO)request.getSession().getAttribute("loginInfo");
        model.addAttribute("user", loginUser); // Model 정보 저장
        boardService.updateBoard_hits(vo);
        BoardVO board = boardService.getBoard(vo);
        model.addAttribute("board", board); // Model 정보 저장
        return "getBoard";  // View 이름 리턴
    }
}
