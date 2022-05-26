package com.example.ordermaker.dao;

import com.example.ordermaker.funcs.Funcs;
import com.example.ordermaker.mapper.StoreMapper;
import com.example.ordermaker.model.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StoreDao {

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Value("${store.select.query}")
    private String selectStores;

    public List<Store> findStoreToShop()
    {
        Integer randomStore = Funcs.getRandomNumber(1,90);
        Map<String,Object> params = new HashMap<>();
        params.put("store",randomStore);

        return namedParameterJdbcTemplate.query(selectStores,params,new StoreMapper());
    }
}
