package com.test.common.model.doms;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AddonModel {
    private CompanyInfo companyInfo;
    private LicenseInfo licenseInfo;

    public AddonModel(CompanyInfo companyInfo, LicenseInfo licenseInfo) {
        this.companyInfo = companyInfo;
        this.licenseInfo = licenseInfo;
    }
}
