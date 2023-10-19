package com.yyx.prd;

import com.yyx.prd.model.product.PrdProduct;
import com.yyx.prd.model.product.PrdProductDraft;
import com.yyx.prd.product.service.PrdProductDraftService;
import com.yyx.prd.product.service.PrdProductService;
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
    private PrdProductDraftService prdProductDraftService;
    @Resource
    private PrdProductService prdProductService;
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

    @Test
    public void testsubmitProduct(){
        PrdProductDraft prdProductDraft = new PrdProductDraft();
        prdProductDraft.setProductName("手机");
        prdProductDraft.setTypeId(1L);
        prdProductDraft.setPrividerName("yy");
        prdProductDraft.setPrividerPhone("123456789");
        prdProductDraft.setAreaId(1L);
        prdProductDraft.setProductDraftState(1);
        prdProductDraft.setAdminId(1L);
        prdProductDraft.setCreateTime(new Date());
        prdProductDraftService.StatusProductDraft(prdProductDraft);
    }
    @Test
    public void testnopassProduct(){
        PrdProductDraft prdProductDraft = new PrdProductDraft();
        prdProductDraft.setProductName("手机");
        prdProductDraft.setTypeId(1L);
        prdProductDraft.setPrividerName("yy");
        prdProductDraft.setPrividerPhone("123456789");
        prdProductDraft.setAreaId(1L);
        prdProductDraft.setProductDraftState(2);
        prdProductDraft.setAdminId(1L);
        prdProductDraft.setCreateTime(new Date());
        prdProductDraftService.nopass(prdProductDraft);
    }
    @Test
    public void testpassProduct(){
        PrdProductDraft prdProductDraft = new PrdProductDraft();
        prdProductDraft.setProductName("手机");
        prdProductDraft.setTypeId(1L);
        prdProductDraft.setPrividerName("yy");
        prdProductDraft.setPrividerPhone("123456789");
        prdProductDraft.setAreaId(1L);
        prdProductDraft.setProductDraftState(2);
        prdProductDraft.setAdminId(1L);
        prdProductDraft.setCreateTime(new Date());
        prdProductDraftService.pass(prdProductDraft);
    }

    @Test
    public void testopenProduct(){
        PrdProduct PrdProduct = new PrdProduct();
        PrdProduct.setProductName("手机");
        PrdProduct.setTypeId(1L);
        PrdProduct.setPrividerName("yy");
        PrdProduct.setPrividerPhone("123456789");
        PrdProduct.setAreaId(1L);
        PrdProduct.setProductState(3);
        PrdProduct.setAdminId(1L);
        PrdProduct.setOnlineTime(new Date());
        prdProductService.open(PrdProduct);
    }
}
