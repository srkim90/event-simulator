package com.test.common.model.doms;

import lombok.Getter;

import java.util.List;

/**
 * The type Domain save model.
 */
@Getter
//CHECKSTYLE:OFF
//field names : DO api parameter name dependency
public class DomainSaveModel {

    private String domainId = "";
    private String domain = "";
    private String domainName = "";
    private String mailHost = "";
    private String mailPort = "25";
    private String virtualDomainList_email = "";
    private String representativeDomain = "";
    private String rcptAuthExist = "false";
    private String smtpActiveInRcpt = "true";
    private String rcptAuth = "smtp";
    private String rcptAuthPostMaster = "";
    private String rcptSmtpUse = "false";
    private String rcptAuthLdapServer = "";
    private String rcptAuthLdapPort = "389";
    private String rcptAuthLdapBind = "anonymous";
    private String rcptAuthLdapBindDN = "";
    private String rcptAuthLdapBindPass = "";
    private String rcptAuthLdapBaseDN = "";
    private String rcptAuthLdapPrimaryAttr = "";
    private String rcptAuthLdapAliasAttr = "";
    private String rcptLdapQueryFilter = "";
    private String testRcptLdapEmail = "";
    private String rcptHttpSslUse = "off";
    private String rcptHttpURL = "";
    private String rcptHttpDelegate = "off";
    private String testRcptHttpEmail = "";
    private boolean smtpAuthExist = true;
    private String smtpActive = "true";
    private String smtpAuth = "smtp";
    private String smtpAuthIDType = "email";
    private String smtpAuthServer = "";
    private String smtpAuthPort = "25";
    private String txtSmtpAuthID = "";
    private String txtSmtpAuthPasswd = "";
    private String smtpAuthLdapServer = "";
    private String smtpAuthLdapPort = "389";
    private String smtpAuthLdapBind = "anonymous";
    private String smtpAuthLdapBindDN = "";
    private String smtpAuthLdapBindPass = "";
    private String smtpAuthLdapBaseDN = "";
    private String smtpAuthLdapPrimaryAttr = "";
    private String smtpAuthLdapAliasAttr = "";
    private String txtSmtpAuthLdapID = "";
    private String txtSmtpAuthLdapPasswd = "";
    private String smtpHttpSslUse = "off";
    private String smtpHttpURL = "";
    private String smtpEncryptKey = "";
    private String txtSmtpAuthHttpID = "";
    private String txtSmtpAuthHttpPasswd = "";
    private String smtpPopSslUse = "off";
    private String smtpAuthPopIDType = "email";
    private String smtpPopEncrypt = "";
    private String smtpAuthPopServer = "";
    private String smtpAuthPopPort = "110";
    private String txtSmtpAuthPopID = "";
    private String txtSmtpAuthPopPasswd = "";
    private String smtpImapSslUse = "off";
    private String smtpAuthImapIDType = "email";
    private String smtpImapEncrypt = "";
    private String smtpAuthImapServer = "";
    private String smtpAuthImapPort = "143";
    private String txtSmtpAuthImapID = "";
    private String txtSmtpAuthImapPasswd = "";
    private String secureFolder = "on";
    private String prevFilterActive = "on";
    private String defaultFilterActive = "on";
    private String defaultFilterAction = "off";
    private String userFilterActive = "on";
    private String allAction = "on";
    private String spamExpireDays = "10";
    private String spamExpireDaysTerm = "";
    private String virusExpireDays = "10";
    private String virusExpireDaysTerm = "";
    private String aptExpireDays = "10";
    private String aptExpireDaysTerm = "";
    private String todoExpireDays = "30";
    private String todoExpireDaysTerm = "";
    private String holdExpireDays = "30";
    private String holdExpireDaysTerm = "";
    private String historyExpireDays = "30";
    private String historyExpireDaysTerm = "";
    private String historyOriginalExpireDays = "30";
    private String historyOriginalExpireDaysTerm = "";
    private String inboxExpireDays = "30";
    private String inboxExpireDaysTerm = "";
    private String completeExpireDays = "30";
    private String completeExpireDaysTerm = "";
    private String securityCenterTimeout = "10";
    private String webTitle = "";
    private boolean notifyActive = false;
    private boolean notifyLink = true;
    private String notifyTitle = "[Querantine Report] Spam Report";
    private String notifySenderName = "tmseadmin";
    private String notifySenderAddr = "";
    private String notifyLang = "korean";
    private String qrEncoding = "utf-8";
    private String notifyTime = "01:00";
    private String notifyTerm = "24";
    private String notifyContType = "html";
    private String qrSendControl = "60";
    private boolean qrSendOption = false;
    private boolean qrReturnOption = false;
    private String sendCheckApply = "off";
    private boolean approvalReturnReasonApply = true;
    private String approvalReturnMessage = "";

    private List<String> virtualDomainList;
    //private List<String> gatewayList;

    private List<String> mailServerList;

    /**
     * Sets domain name.
     *
     * @param pdomainName the pdomain name
     */
    public void setDomainName(String pdomainName) {
        this.domainName = pdomainName;
    }

    /**
     * Sets mail server list.
     *
     * @param pmailServerList the pmail server list
     */
    public void setMailServerList(List<String> pmailServerList) {
        this.mailServerList = pmailServerList;
    }

    /**
     * Sets virtual domain list.
     *
     * @param pvirtualDomainList the pvirtual domain list
     */
    public void setVirtualDomainList(List<String> pvirtualDomainList) {
        this.virtualDomainList = pvirtualDomainList;
    }

    /**
     * Sets domain id.
     *
     * @param pdomainId the pdomain id
     */
    public void setDomainId(String pdomainId) {
        this.domainId = pdomainId;
    }

    /**
     * Sets domain.
     *
     * @param pdomain the pdomain
     */
    public void setDomain(String pdomain) {
        this.domain = pdomain;
    }

    /**
     * Sets smtp auth server.
     *
     * @param url the url
     */
    public void setSmtpAuthServer(String url) {
        this.smtpAuthServer = url;
    }

    public void setSmtpAuthExist(boolean exist) {
        this.smtpAuthExist = exist;
    }
}
