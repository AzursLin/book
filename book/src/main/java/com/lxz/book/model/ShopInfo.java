package com.lxz.book.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Administrator on 2018/5/27 0027.
 */
@Entity
@Table(name = "shop_info")
public class ShopInfo {
    @Id
    @Column(name = "shop_id")
    private Long userId;
    @Column(name = "shop_name")
    private String userName;
    @Column(name = "shop_manager")
    private String shopManager;
    @Column(name = "shop_budget")
    private String shopBudget;
    @Column(name = "create_time")
    private String createTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getShopManager() {
        return shopManager;
    }

    public void setShopManager(String shopManager) {
        this.shopManager = shopManager;
    }

    public String getShopBudget() {
        return shopBudget;
    }

    public void setShopBudget(String shopBudget) {
        this.shopBudget = shopBudget;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
