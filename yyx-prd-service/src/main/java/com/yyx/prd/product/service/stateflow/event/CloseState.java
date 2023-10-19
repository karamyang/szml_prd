package com.yyx.prd.product.service.stateflow.event;

import com.yyx.prd.mapper.PrdProductMapper;
import com.yyx.prd.model.product.PrdProduct;
import com.yyx.prd.model.product.PrdProductDraft;
import com.yyx.prd.model.product.PrdProductDraftExample;
import com.yyx.prd.model.product.PrdProductExample;
import com.yyx.prd.product.service.stateflow.AbstractState;
import com.yyx.prd.util.Constants;
import com.yyx.prd.util.Result;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @description: 下线状态
 * @author: 小傅哥，微信：fustack
 * @date: 2021/9/12
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@Component
public class CloseState extends AbstractState {

    @Resource
    private PrdProductMapper prdProductMapper;
    @Override
    public Result submit(PrdProductDraft prdProductDraft, Integer currentStatus) {
        return Result.buildResult(Constants.ResponseCode.UN_ERROR, "不可提审");
    }

    @Override
    public Result take(Long activityId, Integer currentStatus) {
        return Result.buildResult(Constants.ResponseCode.UN_ERROR, "可以编辑");
    }

    @Override
    public Result close(Long activityId, Integer currentStatus) {
        return Result.buildResult(Constants.ResponseCode.UN_ERROR, "不可下线");
    }

    @Override
    public Result open(PrdProduct prdProduct, Integer currentState) {
        prdProduct.setProductState(4);
        prdProductMapper.updateByExampleSelective(prdProduct,new PrdProductExample());
        return Result.buildResult(Constants.ResponseCode.SUCCESS, "可以上线");
    }

    @Override
    public Result pass(PrdProductDraft prdProductDraft, Integer currentStatus) {
        return Result.buildResult(Constants.ResponseCode.UN_ERROR, "不在审核状态");
    }

    @Override
    public Result nopass(PrdProductDraft prdProductDraft, Integer currentStatus) {
        return Result.buildResult(Constants.ResponseCode.UN_ERROR, "不在审核状态");
    }

}
