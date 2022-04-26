package com.test.common.model.dis;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class ClientSyncCompanyModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private String uuid;

    private String version;

    private String jsonData;

    private String clusterName;

    @Builder
    public ClientSyncCompanyModel(String uuid, String version, String jsonData, String clusterName) {
        this.uuid = uuid;
        this.version = version;
        this.jsonData = jsonData;
        this.clusterName = clusterName;
    }
}
