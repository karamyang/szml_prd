package com.yyx.prd.product.service;

import com.yyx.prd.model.product.PrdProduct;
import com.yyx.prd.util.Result;

import java.util.List;

public interface PrdProductService {
    List<PrdProduct> selectAllProduct();

    int updateProduct(PrdProduct product);

    int addProduct(PrdProduct product);

    Result open(PrdProduct product);
}
