package com.test.common.model.dis;

import java.io.Serializable;
import java.util.Date;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DisCompanyModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private String uuid;
    private String companyName;
    private String siteUrl;     // 사이트 URL
    private String serviceUrl;  // 서비스 접속 URL
    private String adminServiceUrl;     // 어드민 서비스 접속 URL
    private String domainName;
    private Date restrictStart;
    private Date restrictEnd;
    private String defaultSiteUrl;
    private String defaultSiteUuid;
    private String publicKey;

    private String version;
    private Long doCompanyKey;
    private Long doSystemId;

}
