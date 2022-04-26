package com.test.common.model.doms;

import lombok.Data;

import java.util.List;

@Data
public class CompanyCreateBoardModel {
    private BoardModel boardModel;
    private List<DetailPostModel> postModels;
}
