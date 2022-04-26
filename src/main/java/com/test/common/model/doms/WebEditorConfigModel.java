package com.test.common.model.doms;

import lombok.Data;

import java.util.Map;

@Data
public class WebEditorConfigModel {

    private String editorName;
    private Map<String, String> options;
}
