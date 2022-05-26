package com.test.common.model.doms;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class LicenseInfo {
    private String licenseCode;
    private String licenseName;
    private String expireDate;
    private Long userCount;
    //private AddonOptions option;
    private String option;

}
