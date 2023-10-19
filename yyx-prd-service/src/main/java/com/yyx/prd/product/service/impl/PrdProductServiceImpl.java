package com.yyx.prd.product.service.impl;

import com.yyx.prd.model.product.PrdProduct;
import com.yyx.prd.product.service.PrdProductService;
import com.yyx.prd.product.service.stateflow.impl.StateHandlerImpl;
import com.yyx.prd.util.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author：karma
 * @date: 2023/10/19
 */
@Service
public class PrdProductServiceImpl implements PrdProductService {
    @Resource
    private StateHandlerImpl stateHandler;
    @Override
    public List<PrdProduct> selectAllProduct() {
        return null;
    }

    @Override
    public int updateProduct(PrdProduct product) {
        return 0;
    }

    @Override
    public int addProduct(PrdProduct product) {
        return 0;
    }

    @Override
    public Result open(PrdProduct product) {
        Integer productState = product.getProductState();
        return stateHandler.open(product,productState);
    }
}
