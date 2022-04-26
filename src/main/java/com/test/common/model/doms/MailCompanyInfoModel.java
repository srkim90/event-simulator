package com.test.common.model.doms;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;


@Data
@NoArgsConstructor
public class MailCompanyInfoModel {
    private String contactPerson;
    private String officeTel;

    // Do not user below fields.
    private Long mailDomainSeq;
    private String officeFax;
    private String officePostalCode;
    private String officeCountry;
    private String officeState;
    private String officeCity;
    private String officeStreet;
    private String officeExtAddress;
    private String officeBasicAddress;
    private String officeHomepage;
    private String adminId;
    private long webfolderUploadMaxSize = 52428800L;
    private String adminPassword;
    private String adminPasswordConfirm;

}