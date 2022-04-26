package com.test.common.model.doms;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DoasLicenseModel {

    private Long clusterId;
    private Long companyId;
    private String partnercode;
    private String siteUrl;
    private boolean available;
    private String companyName;
}
