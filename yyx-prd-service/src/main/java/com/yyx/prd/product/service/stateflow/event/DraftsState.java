package com.yyx.prd.product.service.stateflow.event;

import com.yyx.prd.mapper.PrdProductDraftMapper;
import com.yyx.prd.model.product.PrdProduct;
import com.yyx.prd.model.product.PrdProductDraft;
import com.yyx.prd.model.product.PrdProductDraftExample;
import com.yyx.prd.product.service.stateflow.AbstractState;
import com.yyx.prd.util.Constants;
import com.yyx.prd.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @description: 草稿状态
 * @author: 小傅哥，微信：fustack
 * @date: 2021/9/12
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@Component
public class DraftsState extends AbstractState {

    @Resource
    private PrdProductDraftMapper prdProductDraftMapper;
    private Logger logger = LoggerFactory.getLogger(DraftsState.class);
    @Override
    public Result submit(PrdProductDraft prdProductDraft, Integer currentStatus) {
        prdProductDraft.setProductDraftState(2);
        logger.info("ace");
        prdProductDraftMapper.updateByExampleSelective(prdProductDraft,new PrdProductDraftExample());
        return Result.buildResult(Constants.ResponseCode.SUCCESS, "提交审核");
    }

    @Override
    public Result take(Long activityId, Integer currentStatus) {
        return Result.buildResult(Constants.ResponseCode.UN_ERROR, "可编辑");
    }

    @Override
    public Result close(Long activityId, Integer currentStatus) {
        return Result.buildResult(Constants.ResponseCode.UN_ERROR, "不可下线");
    }

    @Override
    public Result open(PrdProduct prdProduct, Integer currentState) {
        return Result.buildResult(Constants.ResponseCode.UN_ERROR, "不可上线");
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
