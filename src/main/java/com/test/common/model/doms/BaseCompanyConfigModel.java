package com.test.common.model.doms;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BaseCompanyConfigModel {

    private Long totalAccountQuota = 0L;
    private Long companyQuota = 0L;
    private boolean sendWarningExceedCompanyQuota = true;
    private int companyQuotaWarningRate = 99;
    private boolean restrictCompanyQuota = true;
    private boolean restrictCompanyPeriod = true;
    private String restrictCompanyPeriodStart;
    private String restrictCompanyPeriodEnd;
    private Long userCount = 0L;

}
