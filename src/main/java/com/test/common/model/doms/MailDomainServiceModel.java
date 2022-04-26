package com.test.common.model.doms;

import lombok.Data;

@Data
public class MailDomainServiceModel {
    private boolean pop = true;
    private boolean imap = true;
    private boolean webMail = true;
    private boolean smtpauth = true;

}
