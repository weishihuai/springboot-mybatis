package com.wsh.springboot.springbootmybatis.entity;

import java.util.List;

/**
 * @Description: 测评项实体类
 * @author: weishihuai
 * @Date: 2019/4/3 16:15
 */
public class Item {

    private Integer itemId;
    private String itemName;
    private Integer zt;
    private List<Item> children;

    public List<Item> getChildren() {
        return children;
    }

    public void setChildren(List<Item> children) {
        this.children = children;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getZt() {
        return zt;
    }

    public void setZt(Integer zt) {
        this.zt = zt;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", zt=" + zt +
                ", children=" + children +
                '}';
    }
}
