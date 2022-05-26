package com.example.ordermaker.mapper;

import com.example.ordermaker.model.Item;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemMapper  implements RowMapper<Item> {
    @Override
    public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
        Integer item = rs.getInt("item");
        Integer dept = rs.getInt("dept");
        Integer deptClass = rs.getInt("class");
        Integer subclass = rs.getInt("subclass");

        Item item1 = new Item();
        item1.setItem(item);
        item1.setDept(dept);
        item1.setDeptClass(deptClass);
        item1.setSubclass(subclass);
        return item1;
    }
}
