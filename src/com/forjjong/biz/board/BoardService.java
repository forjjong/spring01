package com.forjjong.biz.board;

import java.util.List;

public interface BoardService {
    void insertBoard(BoardVO vo);

    void updateBoard(BoardVO vo);

    void updateBoard_hits(BoardVO vo);

    void deleteBoard(BoardVO vo);

    BoardVO getBoard(BoardVO vo);

    List<BoardVO> getBoardList(BoardVO vo);
}
