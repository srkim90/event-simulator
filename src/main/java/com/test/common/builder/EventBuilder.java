package com.test.common.builder;

import com.daou.amqp.type.AmqEventType;

public class EventBuilder {
    public static AmqEventType disManualSyncRequest() {
        return AmqEventType.buildEvent("DIS_MANUAL_SYNC_REQUEST", "dis.manual.sync.request");
    }

    public static AmqEventType disManualSyncApiRequest() {
        return AmqEventType.buildEvent("DIS_MANUAL_SYNC_API_REQUEST", "dis.manual.sync.api.request");
    }

    public static AmqEventType disManualSyncAnswer() {
        return AmqEventType.buildEvent("DIS_MANUAL_SYNC_ANSWER", "dis.manual.sync.answer");
    }

    public static AmqEventType disManualSyncApiAnswer() {
        return AmqEventType.buildEvent("DIS_MANUAL_SYNC_API_ANSWER", "dis.manual.sync.api.answer");
    }

    public static AmqEventType disBatchSync() {
        return AmqEventType.buildEvent("DIS_BATCH_SYNC", "dis.batch.sync");
    }

    public static AmqEventType arecordDnsRegistration() {
        return AmqEventType.buildEvent("ARECORD_DNS_REGISTRATION", "dns.registration");
    }

    public static AmqEventType doCreateCompany() {
        return AmqEventType.buildEvent("DO_CREATE_COMPANY", "do.create.company");
    }

    public static AmqEventType tmseCompanyRegistration() {
        return AmqEventType.buildEvent("TMSE_COMPANY_REGISTRATION", "tmse.registration");
    }

    public static AmqEventType disCompanyRegistration() {
        return AmqEventType.buildEvent("DIS_COMPANY_REGISTRATION", "dis.company.registration");
    }

    public static AmqEventType disCompanySync() {
        return AmqEventType.buildEvent("DIS_COMPANY_SYNC", "dis.company.sync");
    }

    public static AmqEventType doasCompanyRegistration() {
        return AmqEventType.buildEvent("DOAS_COMPANY_REGISTRATION", "doas.company.registration");
    }

    public static AmqEventType doChannelSync() {
        return AmqEventType.buildEvent("DO_CHANNEL_SYNC", "do.channel.sync");
    }

    public static AmqEventType doaccCompanyRegistration() {
        return AmqEventType.buildEvent("DOACC_COMPANY_REGISTRATION", "doacc.company.registration");
    }

    public static AmqEventType doaccDisSync() {
        return AmqEventType.buildEvent("DOACC_DIS_SYNC", "doacc.dis.sync");
    }

    public static AmqEventType doLicenceUpdate() {
        return AmqEventType.buildEvent("DO_LICENCE_UPDATE", "do.licence.update");
    }

    public static AmqEventType domsPaymentApplyTimeout() {
        return AmqEventType.buildEvent("DOMS_PAYMENT_APPLY_TIMEOUT", "doms.payment.apply.timeout");
    }

    public static AmqEventType domsPaymentApplyFail() {
        return AmqEventType.buildEvent("DOMS_PAYMENT_APPLY_FAIL", "doms.payment.apply.fail");
    }

    public static AmqEventType arecordDnsDelete() {
        return AmqEventType.buildEvent("ARECORD_DNS_DELETE", "arecord.dns.delete");
    }

    public static AmqEventType tmseCompanyDelete() {
        return AmqEventType.buildEvent("TMSE_COMPANY_DELETE", "tmse.company.delete");
    }

    public static AmqEventType doCompanyDelete() {
        return AmqEventType.buildEvent("DO_COMPANY_DELETE", "dns.do.company.delete");
    }


}
