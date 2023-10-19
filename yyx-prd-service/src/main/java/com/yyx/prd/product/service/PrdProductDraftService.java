package com.yyx.prd.product.service;

import com.yyx.prd.model.product.PrdProductDraft;
import com.yyx.prd.model.product.PrdProductDraftExample;
import com.yyx.prd.util.Result;

import java.util.List;

public interface PrdProductDraftService {

    List<PrdProductDraft> listAllProductDraft(String username);

    List<PrdProductDraft> listProductDraft(Integer status);

    int AddProductDraft(PrdProductDraft prdProductDraft);

    Result StatusProductDraft(PrdProductDraft prdProductDraft);

    PrdProductDraft SelectProductDraft(Long id);

    int DeletePrdProductDraft(Long id);

    Result nopass(PrdProductDraft prdProductDraft);

    Result pass(PrdProductDraft prdProductDraft);
}
