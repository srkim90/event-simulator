package com.test.common.model.dis;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Slf4j
@Getter
@Setter
@Builder
public class DisSyncHistoryModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private String uuid;

    private String version;

    private String jsonData;

    private String reason;

    private String state;

    public DisSyncHistoryModel(String uuid, String version, String jsonData, String reason, String state) {
        this.uuid = uuid;
        this.version = version;
        this.jsonData = jsonData;
        this.reason = reason;
        this.state = state;
    }
}
