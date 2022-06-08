package com.test.doms.controller;

import com.test.doms.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;

    @PostMapping("/api/test/create-company")
    public void createCompanyTest() {
        testService.createCompanyTest();
    }

    @GetMapping("/api/test/dis-sync")
    public void disSync2Test() {
        testService.disManualSyncRequest();
    }


    @GetMapping("/api/test/doacc")
    public String doacctest() {
        testService.sendDoaccCompanyRegistrationRequest();
        return "회사생성 : 경리회계 테스트 이벤트 발행 완료";
    }

    @GetMapping("/api/test/dis-regi")
    public void disRegiTest() {
        testService.disRegistrationRequest();
    }
}
