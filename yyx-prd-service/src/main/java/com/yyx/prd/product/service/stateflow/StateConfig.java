package com.yyx.prd.product.service.stateflow;

import com.yyx.prd.product.service.stateflow.event.*;
import com.yyx.prd.util.Constants;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: 状态流转配置
 * @author: 小傅哥，微信：fustack
 * @date: 2021/9/12
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class StateConfig {


    @Resource
    private OpenState openState;
    @Resource
    private CloseState closeState;
    @Resource
    private DraftsState draftsState;
    @Resource
    private AuditState auditState;

    protected Map<Integer, AbstractState> stateGroup = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        stateGroup.put(1,draftsState);
        stateGroup.put(2,auditState);
        stateGroup.put(3,closeState);
        stateGroup.put(4,openState);
    }

}
