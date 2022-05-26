package com.test.doms.amq.producer;


import com.daou.amqp.base.BaseProducer;
import com.daou.amqp.component.AmqMessageFactory;
import com.daou.amqp.model.AmqJsonPayloadMessage;
import com.daou.amqp.model.AmqMessage;
import com.daou.amqp.model.AmqRoutingInfo;
import com.daou.amqp.type.AmqNodeType;
import com.test.common.builder.NodeBuilder;
import com.test.common.model.dis.DisManualSyncRequestModel;
import com.test.common.model.doms.AmqDisModel;
import com.test.common.model.doms.CompanyCreatorModel;
import com.test.common.model.doms.DisModel;
import com.test.common.model.individual.neworder.*;
import com.test.common.builder.EventBuilder;
import com.test.common.builder.WorkflowBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.AsyncRabbitTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Slf4j
@Component
public class DomsCreateCompanyProducer extends BaseProducer {
    private final AmqNodeType nodeType = NodeBuilder.nodeDoms();
    public DomsCreateCompanyProducer(RabbitTemplate rabbitTemplate,
                                     AsyncRabbitTemplate asyncRabbitTemplate,
                                     AmqMessageFactory messageFactory) {
        super(rabbitTemplate, asyncRabbitTemplate, messageFactory, WorkflowBuilder.createCompany());
    }

    public void sendDisCompanyRegistrationMessage(DisModel model) {
        AmqDisModel amqDisModel = AmqDisModel.builder().model(model).build();
        sendMessage(EventBuilder.disCompanyRegistration(),
                amqDisModel,
                null,
                null);
    }

    /* 1. DNS 등록
        -> 트렌젝션 생성
        -> 응답 데이터 수신 방법 : 콜백 (비동기)
    **/
    public void sendArecordDnsRegistrationMessage(ARecordRegisterModel model) {
        this.sendMessage(EventBuilder.arecordDnsRegistration(), model, null, nodeType);
//        DomsCreateCompanyProducer producer = this;
//        this.sendMessageRegisterCallbacks(EventBuilder.arecordDnsRegistration(),
//                requestModel,
//                requestRoutingInfo,
//                new ListenableFutureCallback<>() {
//                    @Override
//                    public void onFailure(Throwable ex) {
//                        System.out.println("error : " + ex.getMessage());
//                    }
//
//                    @Override
//                    public void onSuccess(Message result) {
//                        return;
////                        messageFactory.printMessageLog(result, requestModel.getClass());
////                        ARecordRegisterModel answerModel = (ARecordRegisterModel) messageFactory.convertToObject(
////                                result, ARecordRegisterModel.class);
////                        DoCreateCompanyModel nextModel = new DoCreateCompanyModel();
////                        AmqRoutingInfo newRoutingInfo = new AmqRoutingInfo();
////                        producer.sendDoCreateCompanyMessage(answerModel, nextModel, newRoutingInfo);
//                    }
//                });
    }

    /* 2. DO 회사 생성
        -> 트렌젝션 진행
        -> 응답 데이터 수신 방법 : 콜백 (비동기)
    * */
    public void sendDoCreateCompanyMessage(AmqMessage prevMessage, CompanyCreatorModel model) {
        AmqRoutingInfo routingInfo = AmqRoutingInfo.builder()
                .hostUrl("172.22.1.138")
                .build();

        AmqJsonPayloadMessage requestMessage  = messageFactory.convertToJsonPayloadMessage(model);

        sendNextMessage(EventBuilder.doCreateCompany(), prevMessage, requestMessage, null, nodeType, null);
        //DomsCreateCompanyProducer producer = this;
//        sendNextMessageRegisterCallbacks(EventBuilder.doCreateCompany(),
//                prevMessage,
//                model,
//                routingInfo,
//                new ListenableFutureCallback<>() {
//                    @Override
//                    public void onFailure(Throwable ex) {
//                        System.out.println("error : " + ex.getMessage());
//                    }
//
//                    @Override
//                    public void onSuccess(Message result) {
//                        messageFactory.printMessageLog(result, model.getClass());
//                        DoCreateCompanyModel answerModel = (DoCreateCompanyModel) messageFactory.convertToObject(result, DoCreateCompanyModel.class);
//                        TmseCompanyRegisterModel nextTmseModel = new TmseCompanyRegisterModel();
//                        AmqRoutingInfo newRoutingInfo = new AmqRoutingInfo();
//
//                        // TODO : Callback 함수의 등록 없이 동기 방식으로 응답 메시지를 받을수도 있다.
//                        TmseCompanyRegisterModel tmseCompanyRegisterModel = producer.sendTmseCompanyRegisterMessage(answerModel, nextTmseModel, newRoutingInfo);
//
//                        // TODO : 동기 방식으로 받은 메시지를 가지고 다음 메시지를 만든다.
//                        DisCompanyRegisterModel nextDisModel = new DisCompanyRegisterModel();
//                        producer.sendDisCompanyRegisterMessage(tmseCompanyRegisterModel, nextDisModel);
//                    }
//                });

    }

    /* 3. TMSe 회사 등록
        -> 트렌젝션 진행
        -> 응답 데이터 수신 방법 : 함수 리턴 (동기)
    * */
//    public TmseCompanyRegisterModel sendTmseCompanyRegisterMessage(AmqMessage prevMessage,
//                                                                   TmseCompanyRegisterModel model,
//                                                                   AmqRoutingInfo routingInfo) {
//
//        return (TmseCompanyRegisterModel)sendNextMessageAndWaitResponse(EventBuilder.tmseCompanyRegistration(),
//                prevMessage,
//                model,
//                routingInfo);
//    }


    /* 4. DIS 회사 등록
    -> 트렌젝션 진행
    -> 응답 데이터 수신 방법 : 콜백 (비동기)
//    * */
//    public void sendDisCompanyRegisterMessage(AmqMessage prevMessage, DisCompanyRegisterModel model) {
//        DomsCreateCompanyProducer producer = this;
//        sendNextMessageRegisterCallbacks(EventBuilder.disCompanyRegistration(),
//                prevMessage,
//                model,
//                null,
//                new ListenableFutureCallback<>() {
//                    @Override
//                    public void onFailure(Throwable ex) {
//                        System.out.println("error : " + ex.getMessage());
//                    }
//
//                    @Override
//                    public void onSuccess(Message result) {
//                        messageFactory.printMessageLog(result, model.getClass());
//                        DisCompanyRegisterModel answerModel = (DisCompanyRegisterModel) messageFactory.convertToObject(result, DisCompanyRegisterModel.class);
//                        DoasCompanyRegisterModel nextModel = new DoasCompanyRegisterModel();
//                        AmqRoutingInfo newRoutingInfo = new AmqRoutingInfo();
//                        // TODO : Callback 함수의 등록 없이 동기 방식으로 응답 메시지를 받을수도 있다.
//                        producer.sendDoasCompanyRegisterMessage(answerModel, nextModel);
//                    }
//                });
//    }

    /* 5. DOAS 회사 등록
        -> 트렌젝션 진행
        -> 응답 데이터 수신 방법 : 응답 데이터 필요하지 않음
//    * */
//    public void sendDoasCompanyRegisterMessage(AmqMessage prevMessage, DoasCompanyRegisterModel model) {
//        sendNextMessage(EventBuilder.doasCompanyRegistration(),
//                prevMessage,
//                model,
//                null);
//    }



}
