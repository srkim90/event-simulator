package com.test.doms.service;

import com.daou.amqp.component.AmqMessageFactory;
import com.daou.amqp.model.AmqRoutingInfo;
import com.test.common.model.dis.DisManualSyncRequestModel;
import com.test.common.model.doms.*;
import com.test.common.model.individual.neworder.*;
import com.test.doms.amq.producer.DomsCreateCompanyProducer;
import com.test.doms.amq.producer.DomsManualCompanySyncProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
@RequiredArgsConstructor
public class TestService {
    private final DomsCreateCompanyProducer domsCreateCompanyProducer;
    private final DomsManualCompanySyncProducer domsManualCompanySyncProducer;
    private final AmqMessageFactory amqMessageFactory;

    public void sendDoaccCompanyRegistrationRequest() {
        AddonModel model = new AddonModel(null, null);
        domsCreateCompanyProducer.sendDoaccCompanyRegistrationRequest(model);
    }

    public void disManualSyncRequest() {
        DisManualSyncRequestModel model = new DisManualSyncRequestModel();
        model.setUuid("A");//TMUzAwMDAwMEEtMDA3

        domsManualCompanySyncProducer.sendDisManualSyncRequestMessage(model);
    }

    public void disRegistrationRequest() {
        domsCreateCompanyProducer.sendDisCompanyRegistrationMessage(new DisModel());
    }

    public void createCompanyTest() {
        CompanyCreatorModel companyCreator = new CompanyCreatorModel("123e4567-e89b-12d3-a456-426614174000", "eluon", new ArrayList<>(), new ArrayList<>(), false);

        /* 1. DNS 등록 */
        ARecordRegisterModel model = new ARecordRegisterModel();
        model.setModel(new ArecordModel("srkim.kr", "222.99.178.9"));
        domsCreateCompanyProducer.sendArecordDnsRegistrationMessage(model);
    }

    private AmqRoutingInfo generateTestRoutingInfo() {
        String hostIpaddr = "127.0.0.1";
        int hostPort = 8000;
        return new AmqRoutingInfo(hostIpaddr, new HashMap<>(), new HashMap<>(), new HashMap<>());
    }

    private List<DoasLicenseModel> generateTestDoasLicenseModels() {
        List<DoasLicenseModel> resultList = new ArrayList<>();

        for (int i = 0; 4 > i; i++) {
            DoasLicenseModel model = new DoasLicenseModel();
            model.setCompanyId((long) i);
            resultList.add(model);
        }

        return resultList;
    }
}