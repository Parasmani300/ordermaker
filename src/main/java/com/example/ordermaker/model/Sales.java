package com.example.ordermaker.model;

public class Sales {
    String customerOrderNo;
    Integer item;
    Integer dept;
    Integer deptClass;
    Integer subclass;
    Integer store;
    Integer qty;
    Float totalCost;

    public String getCustomerOrderNo() {
        return customerOrderNo;
    }

    public void setCustomerOrderNo(String customerOrderNo) {
        this.customerOrderNo = customerOrderNo;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public Integer getDept() {
        return dept;
    }

    public void setDept(Integer dept) {
        this.dept = dept;
    }

    public Integer getDeptClass() {
        return deptClass;
    }

    public void setDeptClass(Integer deptClass) {
        this.deptClass = deptClass;
    }

    public Integer getSubclass() {
        return subclass;
    }

    public void setSubclass(Integer subclass) {
        this.subclass = subclass;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Float totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "customerOrderNo='" + customerOrderNo + '\'' +
                ", item=" + item +
                ", dept=" + dept +
                ", deptClass=" + deptClass +
                ", subclass=" + subclass +
                ", store=" + store +
                ", qty=" + qty +
                ", totalCost=" + totalCost +
                '}';
    }
}
