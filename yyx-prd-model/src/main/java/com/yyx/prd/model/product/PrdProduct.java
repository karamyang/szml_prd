package com.yyx.prd.model.product;

import java.io.Serializable;
import java.util.Date;

public class PrdProduct implements Serializable {
    private Long id;

    private String productName;

    private String productPictrue;

    private Long typeId;

    private String prividerName;

    private String prividerPhone;

    private Long areaId;

    private String priceType;

    private String pricePoint;

    private String priceCash;

    private String exchangeLimit;

    private Long productStock;

    private Integer productState;

    private Date onlineTime;

    private Date downTime;

    private Long adminId;

    private Integer proxyAdminId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPictrue() {
        return productPictrue;
    }

    public void setProductPictrue(String productPictrue) {
        this.productPictrue = productPictrue;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getPrividerName() {
        return prividerName;
    }

    public void setPrividerName(String prividerName) {
        this.prividerName = prividerName;
    }

    public String getPrividerPhone() {
        return prividerPhone;
    }

    public void setPrividerPhone(String prividerPhone) {
        this.prividerPhone = prividerPhone;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public String getPricePoint() {
        return pricePoint;
    }

    public void setPricePoint(String pricePoint) {
        this.pricePoint = pricePoint;
    }

    public String getPriceCash() {
        return priceCash;
    }

    public void setPriceCash(String priceCash) {
        this.priceCash = priceCash;
    }

    public String getExchangeLimit() {
        return exchangeLimit;
    }

    public void setExchangeLimit(String exchangeLimit) {
        this.exchangeLimit = exchangeLimit;
    }

    public Long getProductStock() {
        return productStock;
    }

    public void setProductStock(Long productStock) {
        this.productStock = productStock;
    }

    public Integer getProductState() {
        return productState;
    }

    public void setProductState(Integer productState) {
        this.productState = productState;
    }

    public Date getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Date onlineTime) {
        this.onlineTime = onlineTime;
    }

    public Date getDownTime() {
        return downTime;
    }

    public void setDownTime(Date downTime) {
        this.downTime = downTime;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Integer getProxyAdminId() {
        return proxyAdminId;
    }

    public void setProxyAdminId(Integer proxyAdminId) {
        this.proxyAdminId = proxyAdminId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productName=").append(productName);
        sb.append(", productPictrue=").append(productPictrue);
        sb.append(", typeId=").append(typeId);
        sb.append(", prividerName=").append(prividerName);
        sb.append(", prividerPhone=").append(prividerPhone);
        sb.append(", areaId=").append(areaId);
        sb.append(", priceType=").append(priceType);
        sb.append(", pricePoint=").append(pricePoint);
        sb.append(", priceCash=").append(priceCash);
        sb.append(", exchangeLimit=").append(exchangeLimit);
        sb.append(", productStock=").append(productStock);
        sb.append(", productState=").append(productState);
        sb.append(", onlineTime=").append(onlineTime);
        sb.append(", downTime=").append(downTime);
        sb.append(", adminId=").append(adminId);
        sb.append(", proxyAdminId=").append(proxyAdminId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}