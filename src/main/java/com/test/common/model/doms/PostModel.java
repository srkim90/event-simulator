package com.test.common.model.doms;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Post model.
 */
@Getter
@Setter
public class PostModel extends BaseModel {

    // 게시판 아이디
    private Long boardId;
    // 게시판 이름
    private String boardName;
    // 포스트 타입
    private String type;
    // 선택된 머릿말ID
    private Long headerId;
    // 포스트 상태
    private String status = "OPEN";
    // 내용 요약
    private String summary;
    // 내용
    private String content;
    // 내용 타입 - TEXT / HTML
    private String contentType;
    // 세션 유저 추천 여부
    private boolean recommend;
    // 추천 카운트
    private int recommendCount;
    // 댓글 카운트
    private int commentsCount;
    // 답글 카운트
    private int repliesCount;
    // 첨부파일 존재 여부
    private boolean hasAttach;
    // 작성자 정보
    private Long postWriterId;

    private transient boolean replyForMe;

    /**
     * Sets reply for me.
     *
     * @param value the value
     */
    public void setReplyForMe(boolean value) {
        this.replyForMe = value;
    }


}