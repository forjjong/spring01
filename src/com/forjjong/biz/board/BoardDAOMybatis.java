package com.forjjong.biz.board;

import com.forjjong.biz.user.UserVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

public class BoardDAOMybatis {
    @Autowired
    private SqlSessionTemplate mybatis;

    public void insertBoard (BoardVO vo) {
        System.out.println("===> MyBATIS 기반으로 insertBoard() 기능 처리");
        mybatis.insert("BoardDAO.insertBoard", vo);
    }

    public void updateBoard (BoardVO vo) {
        System.out.println("===> MyBATIS 기반으로 updateBoard() 기능 처리");
        mybatis.insert("BoardDAO.updateBoard", vo);
    }

    public void updateBoard_hits (BoardVO vo) {
        System.out.println("===> MyBATIS 기반으로 updateBoard_hits() 기능 처리");
        mybatis.insert("BoardDAO.updateBoard_hits", vo);
    }

    public void deleteBoard (BoardVO vo) {
        System.out.println("===> MyBATIS 기반으로 deleteBoard() 기능 처리");
        mybatis.insert("BoardDAO.deleteBoard", vo);
    }

    public BoardVO getBoard (BoardVO vo) {
        System.out.println("===> MyBATIS 기반으로 getBoard() 기능 처리");
        return (BoardVO) mybatis.selectOne("BoardDAO.getBoard", vo);
    }

    public List<BoardVO> getBoardList (BoardVO vo) {
        System.out.println("===> MyBATIS 기반으로 getBoardList() 기능 처리");
        System.out.println(vo.toString());
        return (List<BoardVO>) (List) mybatis.selectList("BoardDAO.getBoardList", vo);
    }
}
