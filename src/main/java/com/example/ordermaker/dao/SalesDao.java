package com.example.ordermaker.dao;

import com.example.ordermaker.funcs.Funcs;
import com.example.ordermaker.model.Item;
import com.example.ordermaker.model.Sales;
import com.example.ordermaker.model.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Repository
public class SalesDao {
//    (:customeroderno,:item,:store,:dept,:class,:sublass,:qty,:totalcost,:uuid)
    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Value("${sales.insert.query}")
    private String inserSalesData;

    public void makeSales(Store store, Item item,String customerOrderNo)
    {
        Integer qty = Funcs.getRandomNumber(1,10);
        Float totalCost = qty*store.getUnitCost();

        Map<String,Object> params = new HashMap<>();
        params.put("customeroderno",customerOrderNo);
        params.put("item",item.getItem());
        params.put("store",store.getStore());
        params.put("dept",item.getDept());
        params.put("class",item.getDeptClass());
        params.put("sublass",item.getSubclass());
        params.put("qty",qty);
        params.put("totalcost",totalCost);
        String uuid = String.valueOf(UUID.randomUUID());
        params.put("uuid",uuid);

        namedParameterJdbcTemplate.update(inserSalesData,params);
    }
}
