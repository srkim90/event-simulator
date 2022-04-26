package com.test.common.model.doms;

import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
public class NoticeModel extends BaseModel {

    private String title = "[공지] 모바일앱, PC메신저 설치 방법 안내"; //제목


    private String startTime; //시작일
    private String endTime; //종료일
    private String state = "NORMAL"; //사용여부

    private String content = "공지등록"; //내용
    private String option = "none"; //옵션(로그인할때마다: always 하루동안: day 일주일: week 없음: none)
    private int width = 520; //팝업 사이즈(가로)
    private int height = 600 ; //팝업 사이즈(세로)
    private Boolean showWeb = true; //웹 공지
    private Boolean showMobile = false; //모바일 공지
    private Boolean targetAll = true; //공지 대상이 전체 사용자인지
    private String recurrence; //반복설정


    public NoticeModel(String content) {
        this.startTime = LocalDate.now().toString() + " 00:00";
        this.endTime = LocalDate.now().plusWeeks(2).toString() + " 23:59";
        this.content = content;
    }

}
