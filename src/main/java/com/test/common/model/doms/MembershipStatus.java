package com.test.common.model.doms;

import lombok.Getter;

@Getter
public enum MembershipStatus {
    USING("사용중"), END("해지"), IDLE("초과사용중"), NONE("없음");
    
    private String name;
    
    MembershipStatus(String name) {
        this.name = name;
    }
}


