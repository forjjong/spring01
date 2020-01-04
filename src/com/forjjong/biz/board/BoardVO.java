package com.forjjong.biz.board;

import java.util.Date;

public class BoardVO {

    private int boardId;
    private int boardPid;
    private int userIdx;
    private String userName;
    private String title;
    private String content;
    private Date regDate;
    private Date updateDate;
    private String boardPassword;
    private int hits;
    private int reCnt;
    private String searchCondition;
    private String searchKeyword;

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public int getBoardPid() {
        return boardPid;
    }

    public void setBoardPid(int boardPid) {
        this.boardPid = boardPid;
    }

    public int getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(int userIdx) {
        this.userIdx = userIdx;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getBoardPassword() {
        return boardPassword;
    }

    public void setBoardPassword(String boardPassword) {
        this.boardPassword = boardPassword;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getReCnt() {
        return reCnt;
    }

    public void setReCnt(int reCnt) {
        this.reCnt = reCnt;
    }

    public String getSearchCondition() {
        return searchCondition;
    }

    public void setSearchCondition(String searchCondition) {
        this.searchCondition = searchCondition;
    }

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    @Override
    public String toString() {
        return "BoardVO [boardId=" + boardId + ", boardPid=" + boardPid + ", userIdx=" + userIdx + ", userName=" + userName
                + ", title=" + title + ", content=" + content + ", regDate=" + regDate + ", updateDate=" + updateDate
                + ", hits=" + hits + ", reCnt=" + reCnt + ", searchCondition=" + searchCondition + ", searchKeyword=" + searchKeyword + "]";
    }
}
