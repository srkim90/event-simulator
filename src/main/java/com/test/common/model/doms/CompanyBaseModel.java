package com.test.common.model.doms;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * The type Company base model.
 */
@Getter
@Setter
@ToString
public class CompanyBaseModel {

    private Long id;
    private BaseCompanyConfigModel baseCompanyConfig;
    private long mailDomainSeq;
    private String name;
    private String siteUrl = "biz.daouoffice.com";
    private String subUrl;
    private int stopUserCount;
    private int usedCount;
    private Integer userCount;
    private String domainName;
    private String oldDomainName;
    private String locale = "ko";
    private String algorithmName = "{SHA256}";
    private String managerName;
    private String managerId;
    private String managerPassword;
    private String managerPasswordConfirm;

    private MailCompanyInfoModel info;
    private MailDomainConfigModel config;
    private MailDomainServiceModel serviceModel;
    private List<String> indexFss;
    private List<String> dataFss;

    private Long totalAccountQuota = 0L;
    private Long companyQuota = 0L;
    private String uuid;

    /**
     * Instantiates a new Company base model.
     */
    public CompanyBaseModel() {
        this.baseCompanyConfig = new BaseCompanyConfigModel();
        this.info = new MailCompanyInfoModel();
        this.config = new MailDomainConfigModel();
        this.serviceModel = new MailDomainServiceModel();
    }


}
