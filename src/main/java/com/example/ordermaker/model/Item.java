package com.example.ordermaker.model;

public class Item {
    Integer item;
    Integer dept;
    Integer deptClass;
    Integer subclass;

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

    @Override
    public String toString() {
        return "Item{" +
                "item=" + item +
                ", dept=" + dept +
                ", deptClass=" + deptClass +
                ", subclass=" + subclass +
                '}';
    }
}
