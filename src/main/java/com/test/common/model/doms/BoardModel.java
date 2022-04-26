package com.test.common.model.doms;

import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class BoardModel extends BaseModel {


    // 게시판타입 BBS : 일반형 STREAM : 피드형
    private String type = "CLASSIC";
    // 게시판 이름
    private String name = "다우오피스 오리엔테이션";
    // 게시판 설명
    private String description = "다우오피스 오리엔테이션";
    // 익명 설정 여부
    private boolean anonymFlag = false;
    // 공개 설정 여부
    private boolean sharedFlag = false;
    // 메일발송유무
    private boolean sendMailFlag = true;
    // 댓글 사용 여부
    private boolean commentFlag = true;
    // 전사알림 사용 여부
    private boolean notificationFlag = false;
    // 관리자 추가 정보
    private List<Long> managerIds;

    public BoardModel(String name) {
        this.name = name;
        this.description = name;
    }
}