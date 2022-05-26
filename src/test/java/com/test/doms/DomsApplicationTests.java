package com.test.doms;

import com.test.common.model.doms.ArecordModel;
import com.test.common.model.individual.neworder.ARecordRegisterModel;
import com.test.doms.amq.producer.DomsCreateCompanyProducer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DomsApplicationTests {
	@Autowired
	private DomsCreateCompanyProducer domsCreateCompanyProducer;

	@Test
	void contextLoads() {
		ARecordRegisterModel model = new ARecordRegisterModel();
		model.setModel(new ArecordModel("srkim.kr", "222.99.178.9"));
		domsCreateCompanyProducer.sendArecordDnsRegistrationMessage(model);
	}

}