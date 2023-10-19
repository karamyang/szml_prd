package com.yyx.prd.product.service.stateflow.impl;

import com.yyx.prd.model.product.PrdProduct;
import com.yyx.prd.model.product.PrdProductDraft;
import com.yyx.prd.product.service.stateflow.IStateHandler;
import com.yyx.prd.product.service.stateflow.StateConfig;
import com.yyx.prd.util.Constants;
import com.yyx.prd.util.Result;
import org.springframework.stereotype.Service;

/**
 * @description: 状态处理服务
 * @author: 小傅哥，微信：fustack
 * @date: 2021/9/12
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@Service
public class StateHandlerImpl extends StateConfig implements IStateHandler {


    @Override
    public Result submit(PrdProductDraft prdProductDraft, Integer currentStatus) {
        return stateGroup.get(currentStatus).submit(prdProductDraft,currentStatus);
    }

    @Override
    public Result take(Long activityId, Integer currentStatus) {
        return null;
    }

    @Override
    public Result close(Long activityId, Integer currentStatus) {
        return null;
    }

    @Override
    public Result open(PrdProduct prdProduct, Integer currentStatus) {
        return stateGroup.get(currentStatus).open(prdProduct, currentStatus);
    }

    @Override
    public Result pass(PrdProductDraft prdProductDraft,Integer currentStatus) {
        return stateGroup.get(currentStatus).pass(prdProductDraft,currentStatus);
    }

    @Override
    public Result nopass(PrdProductDraft prdProductDraft, Integer currentStatus) {
        return stateGroup.get(currentStatus).nopass(prdProductDraft,currentStatus);
    }


}
