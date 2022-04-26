package com.test.common.model.doms;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CompanyCreatorModel {

    private String domain;
    private String excludeDomain;
    private MailDomainModel mailDomainModel;
    private CompanyBaseModel companyBaseModel;
    private List<NoticeModel> noticeModels;
    private List<CompanyCreateBoardModel> boardModels;
    private List<String> licenseCodes = new ArrayList<>();

    public CompanyCreatorModel(String uuid, String companyName, List<NoticeModel> noticeModels,
                               List<CompanyCreateBoardModel> boardModels, boolean enableAllianceService){
        this.domain = null;
        this.mailDomainModel = new MailDomainModel();
        this.companyBaseModel = new CompanyBaseModel();
        this.noticeModels = noticeModels;
        this.boardModels = boardModels;
        licenseCodes.add(null);
    }
}

