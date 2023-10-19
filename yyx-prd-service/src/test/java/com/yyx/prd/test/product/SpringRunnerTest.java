package com.yyx.prd.test.product;

import com.yyx.prd.model.product.PrdProductDraft;
import com.yyx.prd.product.service.impl.PrdProductDraftServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @description: SpringBoot 单元测试
 * @author: 小傅哥，微信：fustack
 * @date: 2021/9/4
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTest {

    private Logger logger = LoggerFactory.getLogger(SpringRunnerTest.class);
    @Resource
    private PrdProductDraftServiceImpl prdProductDraftService;
    @Test
    public void testaddProduct(){
        PrdProductDraft prdProductDraft = new PrdProductDraft();
        prdProductDraft.setProductName("手机");
        prdProductDraft.setTypeId(1L);
        prdProductDraft.setPrividerName("yy");
        prdProductDraft.setPrividerPhone("123456789");
        prdProductDraft.setAreaId(1L);
        prdProductDraft.setProductDraftState(1);
        prdProductDraft.setAdminId(1L);
        prdProductDraft.setCreateTime(new Date());
        prdProductDraftService.AddProductDraft(prdProductDraft);
    }
}
