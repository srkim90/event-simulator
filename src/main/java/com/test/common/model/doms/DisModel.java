package com.test.common.model.doms;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class DisModel {
    private String uuid;
    private String companyName;
    private String siteUrl;
    private String domain;
    private Long doCompanyKey;
    private String clusterName;
    private String restrictStart;
    private String restrictEnd;
    private Long domsCustomerKey;
    private List<LicenseInfo> licenseInfos = new ArrayList<>();
}
