package com.example.ordermaker.dao;

import com.example.ordermaker.mapper.ItemMapper;
import com.example.ordermaker.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ItemDao {

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Value("${item.select.query}")
    private  String selectItem;

    public List<Item> getItemDetails(Integer item)
    {
        Map<String,Object> params = new HashMap<>();
        params.put("item",item);

        return namedParameterJdbcTemplate.query(selectItem,params,new ItemMapper());
    }
}
