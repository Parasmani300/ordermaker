package com.example.ordermaker.mapper;

import com.example.ordermaker.model.Store;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StoreMapper implements RowMapper<Store> {
    @Override
    public Store mapRow(ResultSet rs, int rowNum) throws SQLException {
        Integer store = rs.getInt("store");
        Integer item = rs.getInt("item");
        Integer stockLeft = rs.getInt("stockLeft");
        Integer nonSellableQty = rs.getInt("nonSellableQty");
        String storeName = rs.getString("storeName");
        Float unitCost = rs.getFloat("unitCost");

        Store store1 = new Store();
        store1.setStore(store);
        store1.setStoreName(storeName);
        store1.setItem(item);
        store1.setStockLeft(stockLeft);
        store1.setNonSellableQty(nonSellableQty);
        store1.setUnitCost(unitCost);
        return store1;
    }
}
