package com.example.ordermaker.model;

public class Store {
    Integer store;
    Integer item;
    String storeName;
    Integer stockLeft;
    Integer nonSellableQty;
    Float unitCost;

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Integer getStockLeft() {
        return stockLeft;
    }

    public void setStockLeft(Integer stockLeft) {
        this.stockLeft = stockLeft;
    }

    public Integer getNonSellableQty() {
        return nonSellableQty;
    }

    public void setNonSellableQty(Integer nonSellableQty) {
        this.nonSellableQty = nonSellableQty;
    }

    public Float getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Float unitCost) {
        this.unitCost = unitCost;
    }

    @Override
    public String toString() {
        return "Store{" +
                "store=" + store +
                ", item=" + item +
                ", storeName='" + storeName + '\'' +
                ", stockLeft=" + stockLeft +
                ", nonSellableQty=" + nonSellableQty +
                ", unitCost=" + unitCost +
                '}';
    }
}
