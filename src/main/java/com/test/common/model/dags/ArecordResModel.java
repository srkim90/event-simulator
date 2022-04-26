package com.test.common.model.dags;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter(value = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ArecordResModel {
    public static final ArecordResModel defaultResModel = defaultModel();
    private String message;
    private String code;
    private Boolean success;

    public boolean isSuccess() {
        return Integer.parseInt(getCode()) / 100 == 2;
    }

    private static ArecordResModel defaultModel() {
        ArecordResModel resModel = new ArecordResModel();
        resModel.setCode(Integer.toString(HttpStatus.OK.value()));
        return resModel;
    }
}
