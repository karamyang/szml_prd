package com.yyx.prd.product.service.stateflow;


import com.yyx.prd.model.product.PrdProduct;
import com.yyx.prd.model.product.PrdProductDraft;
import com.yyx.prd.product.service.stateflow.impl.StateHandlerImpl;
import com.yyx.prd.util.Constants;
import com.yyx.prd.util.Result;

/**
 * @description: 状态处理接口
 * @author: 小傅哥，微信：fustack
 * @date: 2021/9/12
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface IStateHandler {

    /**
     * 提审
     * @param prdProductDraft    活动ID
     * @param currentStatus 当前状态
     * @return              审核结果
     */
    Result submit(PrdProductDraft prdProductDraft, Integer currentStatus);

    /**
     * 编辑
     * @param activityId    活动ID
     * @param currentStatus 当前状态
     * @return              审核结果
     */
    Result take(Long activityId, Integer currentStatus);

    /**
     * 下线
     * @param activityId    活动ID
     * @param currentStatus 当前状态
     * @return              审核结果
     */
    Result close(Long activityId, Integer currentStatus);



    /**
     * 上线
     * @param prdProduct    活动ID
     * @param currentStatus 当前状态
     * @return              审核结果
     */
    Result open(PrdProduct prdProduct, Integer currentStatus);
    /**
     * 通过
     * @param prdProductDraft    活动ID
     * @param currentStatus 当前状态
     * @return              审核结果
     * */

    Result pass(PrdProductDraft prdProductDraft, Integer currentStatus);
    /**
     * 通过
     * @param prdProductDraft    活动ID
     * @param currentStatus 当前状态
     * @return              审核结果
     */
    Result nopass(PrdProductDraft prdProductDraft, Integer currentStatus);

}
