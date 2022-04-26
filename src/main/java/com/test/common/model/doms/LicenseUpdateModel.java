package com.test.common.model.doms;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class LicenseUpdateModel {
    private String uuid;
    private List<String> licenseCodes = new ArrayList<>();
}
