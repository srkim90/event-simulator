package com.test.common.model.daouoffice;

import com.test.common.model.doms.CompanyBaseModel;
import com.test.common.model.doms.MailDomainModel;
import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyCreatedInfo {
    private MailDomainModel mailDomain;
    private CompanyBaseModel company;
}