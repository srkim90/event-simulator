package com.test.doms.service;

import com.daou.amqp.component.AmqMessageFactory;
import com.daou.amqp.model.AmqRoutingInfo;
import com.test.common.builder.EventBuilder;
import com.test.common.builder.WorkflowBuilder;
import com.test.common.model.dis.DisManualSyncRequestModel;
import com.test.common.model.doms.ArecordModel;
import com.test.common.model.doms.CompanyCreatorModel;
import com.test.common.model.doms.DoasLicenseModel;
import com.test.common.model.individual.neworder.*;
import com.daou.amqp.type.AmqEventType;
import com.daou.amqp.type.AmqWorkflowType;
import com.test.doas.amq.DoasCreateCompanyProducer;
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
    private final DoasCreateCompanyProducer doasCreateCompanyProducer;
    private final DomsManualCompanySyncProducer domsManualCompanySyncProducer;
    private final AmqMessageFactory amqMessageFactory;

    public void disSyncTest() {
        TmseCompanyRegisterModel prevMessage = new TmseCompanyRegisterModel();
        prevMessage.setHeader(amqMessageFactory.makeNewAmqMessageHeader(EventBuilder.tmseCompanyRegistration(), null, WorkflowBuilder.createCompany()));
        DoChannelSyncModel requestModel = new DoChannelSyncModel();
        AmqRoutingInfo requestRoutingInfo = null;
        doasCreateCompanyProducer.sendDoChannelSyncMessage(prevMessage, requestModel, requestRoutingInfo);
    }

    public void disManualSyncRequest() {
        DisManualSyncRequestModel model = new DisManualSyncRequestModel();
        model.setUuid("A");//TMUzAwMDAwMEEtMDA3

        domsManualCompanySyncProducer.sendDisManualSyncRequestMessage(model);
    }

    public void createCompanyTest() {
        CompanyCreatorModel companyCreator = new CompanyCreatorModel("123e4567-e89b-12d3-a456-426614174000", "eluon", new ArrayList<>(), new ArrayList<>(), false);


        /* 1. DNS 등록 */
        ARecordRegisterModel model1 = new ARecordRegisterModel();
        model1.setRequest(new ArecordModel("srkim.kr", "222.99.178.9"));
        domsCreateCompanyProducer.sendArecordDnsRegistrationMessage(model1, generateTestRoutingInfo());

//        /* 2. DO 생성 */
//        DoCreateCompanyModel model2 = new DoCreateCompanyModel();
//        model2.setRequest(companyCreator);
//        DoCreateCompanyModel doCreateCompanyModel = createCompanyProducer.sendDoCreateCompanyMessage(aRecordRegisterModel, model2, generateTestRoutingInfo());
//
//        /* 3. TMSe 등록 */
//        TmseCompanyRegisterModel model3 = new TmseCompanyRegisterModel();
//        model3.setRequest(new DomainSaveModel());
//        TmseCompanyRegisterModel tmseCompanyRegisterModel = createCompanyProducer.sendTmseCompanyRegisterMessage(doCreateCompanyModel, model3, generateTestRoutingInfo());
//
//        /* 4. DIS에 회사를 등록 */
//        DisCompanyRegisterModel model4 = new DisCompanyRegisterModel();
//        model4.setRequest(companyCreator);
//        DisCompanyRegisterModel disCompanyRegisterModel = createCompanyProducer.sendDisCompanyRegisterMessage(tmseCompanyRegisterModel, model4);
//
//        /* 5. DOAS에 회사를 등록 */
//        DoasCompanyRegisterModel model5 = new DoasCompanyRegisterModel();
//        model5.setRequest(generateTestDoasLicenseModels());
//        DoasCompanyRegisterModel doasCompanyRegisterModel  = createCompanyProducer.sendDoasCompanyRegisterMessage(disCompanyRegisterModel, model5);

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