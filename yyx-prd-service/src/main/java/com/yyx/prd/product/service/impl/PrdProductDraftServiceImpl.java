package com.yyx.prd.product.service.impl;

import com.yyx.prd.mapper.PrdProductDraftMapper;
import com.yyx.prd.model.product.PrdProductDraft;
import com.yyx.prd.product.service.PrdProductDraftService;
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
public class PrdProductDraftServiceImpl implements PrdProductDraftService {
    @Resource
    private PrdProductDraftMapper prdProductDraftMapper;
    @Resource
    private StateHandlerImpl stateHandler;
    @Override
    public List<PrdProductDraft> listAllProductDraft(String username) {
        return prdProductDraftMapper.selectAdminProduct(username);
    }

    @Override
    public List<PrdProductDraft> listProductDraft(Integer status) {
        return null;
    }

    @Override
    public int AddProductDraft(PrdProductDraft prdProductDraft) {
        return prdProductDraftMapper.insert(prdProductDraft);
    }

    @Override
    public Result StatusProductDraft(PrdProductDraft prdProductDraft) {
        Integer productDraftState = prdProductDraft.getProductDraftState();
        return stateHandler.submit(prdProductDraft,productDraftState);
    }

    @Override
    public PrdProductDraft SelectProductDraft(Long id) {
        return prdProductDraftMapper.selectByPrimaryKey(id);
    }

    @Override
    public int DeletePrdProductDraft(Long id) {
        return prdProductDraftMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Result nopass(PrdProductDraft prdProductDraft) {
        Integer productDraftState = prdProductDraft.getProductDraftState();
        return stateHandler.nopass(prdProductDraft,productDraftState);
    }

    @Override
    public Result pass(PrdProductDraft prdProductDraft) {
        Integer productDraftState = prdProductDraft.getProductDraftState();
        return stateHandler.pass(prdProductDraft,productDraftState);
    }
}
