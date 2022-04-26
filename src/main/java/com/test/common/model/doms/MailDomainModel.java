package com.test.common.model.doms;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Data
@NoArgsConstructor
public class MailDomainModel {

    private Long mailDomainSeq;

    private String mailDomain;
    private String mailDomainName;
    private Long maxUserCount;
    private Long mailServices;

    private String passwordMethod;

    private String loginMode = "id";

    private Long currentUserCount;
    private Long capacityTotal;
    private List<String> virtualDomains;
    private List<String> userVirtualDomains;

    public List<String> getVirtualDomains() {
        return Optional.ofNullable(virtualDomains)
                .orElseGet(ArrayList::new);
    }
}