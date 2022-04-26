package com.test.common.model.doms;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Map;

/**
 * The type Mail domain config model.
 */
@SuppressWarnings("PMD.UnusedPrivateField")
@Getter
@Setter
@ToString
public class MailDomainConfigModel implements Serializable {
    private static final long serialVersionUID = -3388754742176362351L;
    private final int MEETING_ROOM_BASE_COUNT = 5;

    private int maxMailinglistLimit = 0;
    private String homeService = DomsConstant.STR_ON;
    private String contactService = DomsConstant.STR_ON;
    private String webfolderService = DomsConstant.STR_ON;
    private String calendarService = DomsConstant.STR_ON;
    private String boardService = DomsConstant.STR_ON;
    private String communityService = DomsConstant.STR_ON;
    private String assetService = DomsConstant.STR_ON;
    private String reportService = DomsConstant.STR_ON;
    private String taskService = DomsConstant.STR_OFF;
    private String worksService = DomsConstant.STR_ON;
    private String todoService = DomsConstant.STR_ON;
    private String surveyService = DomsConstant.STR_ON;
    private String approvalService = DomsConstant.STR_ON;
    private String docfolderService = DomsConstant.STR_ON;
    private String chatService = DomsConstant.STR_ON;
    private String pcappService = DomsConstant.STR_ON;
    private String noteService = DomsConstant.STR_OFF;
    private String mobileService = DomsConstant.STR_ON;
    private String mobileAppService = DomsConstant.STR_ON;
    private String orgService = DomsConstant.STR_ON;
    private String otpService = DomsConstant.STR_OFF;
    private String useAbbroadIpCheck = DomsConstant.STR_ON;
    private WebEditorConfigModel editorConfig;
    private String ehrService = DomsConstant.STR_ON;
    private String smsService = DomsConstant.STR_OFF;
    private String securityCenter = DomsConstant.STR_OFF;
    private String smartFilter = DomsConstant.STR_OFF;
    private String directedApprover = DomsConstant.STR_OFF;
    private String docsService = DomsConstant.STR_ON;
    private String ksystemService = DomsConstant.STR_OFF;
    private String allianceSystemService = DomsConstant.STR_OFF;
    private String messengerType = null;
    private String channelService = DomsConstant.STR_OFF;
    private String storeService = DomsConstant.STR_ON;
    private long meetingRoomCount = 0L;
    private String otpInAdmin = DomsConstant.STR_ON;

    private Map<String, Boolean> profileVisibleInfos;

    /**
     * Instantiates a new Mail domain config model.
     */
    public MailDomainConfigModel() {
        super();
    }

    /**
     * Sets default service.
     */
    public void setDefaultService() {

        this.maxMailinglistLimit = 0;
        this.homeService = DomsConstant.STR_ON;
        this.contactService = DomsConstant.STR_ON;
        this.webfolderService = DomsConstant.STR_ON;
        this.calendarService = DomsConstant.STR_ON;
        this.boardService = DomsConstant.STR_ON;
        this.communityService = DomsConstant.STR_ON;
        this.assetService = DomsConstant.STR_ON;
        this.reportService = DomsConstant.STR_ON;
        this.taskService = DomsConstant.STR_OFF;
        this.worksService = DomsConstant.STR_ON;
        this.todoService = DomsConstant.STR_ON;
        this.surveyService = DomsConstant.STR_ON;
        this.approvalService = DomsConstant.STR_ON;
        this.docfolderService = DomsConstant.STR_ON;
        this.chatService = DomsConstant.STR_ON;
        this.pcappService = DomsConstant.STR_ON;
        this.noteService = DomsConstant.STR_OFF;
        this.mobileService = DomsConstant.STR_ON;
        this.mobileAppService = DomsConstant.STR_ON;
        this.orgService = DomsConstant.STR_ON;
        this.otpService = DomsConstant.STR_OFF;
        this.useAbbroadIpCheck = DomsConstant.STR_ON;
        this.ehrService = DomsConstant.STR_ON;
        this.smsService = DomsConstant.STR_OFF;
        this.securityCenter = DomsConstant.STR_OFF;
        this.smartFilter = DomsConstant.STR_OFF;
        this.directedApprover = DomsConstant.STR_OFF;
        this.docsService = DomsConstant.STR_ON;
        this.ksystemService = DomsConstant.STR_OFF;
        this.allianceSystemService = DomsConstant.STR_OFF;
        this.messengerType = null;
        this.channelService = DomsConstant.STR_OFF;
        this.storeService = DomsConstant.STR_ON;
        this.meetingRoomCount = 0L;
    }

    /**
     * Sets only mail service.
     */
    public void setOnlyMailService() {

        this.approvalService = DomsConstant.STR_OFF;
        this.assetService = DomsConstant.STR_OFF;
        this.boardService = DomsConstant.STR_ON;
        this.calendarService = DomsConstant.STR_ON;
        this.chatService = DomsConstant.STR_ON;
        this.communityService = DomsConstant.STR_OFF;
        this.contactService = DomsConstant.STR_ON;
        this.directedApprover = DomsConstant.STR_OFF;
        this.docfolderService = DomsConstant.STR_OFF;
        this.docsService = DomsConstant.STR_OFF;
        this.ehrService = DomsConstant.STR_OFF;
        this.webfolderService = DomsConstant.STR_ON;
        this.homeService = DomsConstant.STR_ON;
        this.maxMailinglistLimit = 0;
        this.mobileAppService = DomsConstant.STR_ON;
        this.mobileService = DomsConstant.STR_ON;
        this.orgService = DomsConstant.STR_ON;
        this.otpService = DomsConstant.STR_OFF;
        this.pcappService = DomsConstant.STR_ON;
        this.reportService = DomsConstant.STR_OFF;
        this.securityCenter = DomsConstant.STR_OFF;
        this.smartFilter = DomsConstant.STR_OFF;
        this.smsService = DomsConstant.STR_OFF;
        this.surveyService = DomsConstant.STR_OFF;
        this.taskService = DomsConstant.STR_OFF;
        this.todoService = DomsConstant.STR_OFF;
        this.useAbbroadIpCheck = DomsConstant.STR_ON;
        this.worksService = DomsConstant.STR_OFF;
        this.ksystemService = DomsConstant.STR_OFF;
        this.allianceSystemService = DomsConstant.STR_OFF;
        this.channelService = DomsConstant.STR_OFF;
        this.storeService = DomsConstant.STR_ON;
        this.meetingRoomCount = 0L;
    }
}


