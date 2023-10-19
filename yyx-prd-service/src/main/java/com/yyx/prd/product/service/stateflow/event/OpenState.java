package com.yyx.prd.product.service.stateflow.event;

import com.yyx.prd.model.product.PrdProduct;
import com.yyx.prd.model.product.PrdProductDraft;
import com.yyx.prd.product.service.stateflow.AbstractState;
import com.yyx.prd.util.Constants;
import com.yyx.prd.util.Result;
import org.springframework.stereotype.Component;

/**
 * @description: 上线状态
 * @author: 小傅哥，微信：fustack
 * @date: 2021/9/12
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@Component
public class OpenState extends AbstractState {


    @Override
    public Result submit(PrdProductDraft prdProductDraft, Integer currentStatus) {
        return Result.buildResult(Constants.ResponseCode.UN_ERROR, "商品已上线");
    }

    @Override
    public Result take(Long activityId, Integer currentStatus) {
        return Result.buildResult(Constants.ResponseCode.UN_ERROR, "商品已上线");
    }

    @Override
    public Result close(Long activityId, Integer currentStatus) {
        return Result.buildResult(Constants.ResponseCode.UN_ERROR, "可下线");
    }

    @Override
    public Result open(PrdProduct prdProduct, Integer currentState) {
        return Result.buildResult(Constants.ResponseCode.UN_ERROR, "商品已上线");
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
