package com.test.common.model.doms;

import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
public class DetailPostModel extends PostModel {

    // 공지사항 판별 여부
    private boolean stickable = false;
    // 공지사항 순서 지정 여부
    private boolean noticeSortable;
    // 공지포스트 시작일 설정 요청
    private Date fromDate;
    // 공지포스트 종료일 설정 요청
    private Date toDate;
    // 원글 아이디
    private Long thread;
    // 답글 깊이
    private int depth;
    // 조회 카운트
    private int readCount;
    // 최상위 원글 아이디
    private Long root;
    // 삭제된 원글의 자식 여부
    private boolean orphanFlag;
    // 제목
    private String title;
    // 내용
    private String content;
    // 내용 타입 _모바일앱에서는 클래식게시물도 TEXT/PLAIN형태
    private String contentType = "HTML";

    // 알림 여부(메일과 push)로 구분.
    private boolean notiMailFlag = false;
    private boolean notiPushFlag = false;

    private String dateType;

    private boolean summarizedFlag;

    //글 수정시 디바이스가 PC웹인지 여부 GO-26413
    private boolean modifyPCWebPlatform;

    public DetailPostModel(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
