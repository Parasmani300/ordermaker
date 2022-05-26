package com.example.ordermaker.scheduler;

import com.example.ordermaker.dao.ItemDao;
import com.example.ordermaker.dao.SalesDao;
import com.example.ordermaker.dao.StoreDao;
import com.example.ordermaker.funcs.Funcs;
import com.example.ordermaker.model.Item;
import com.example.ordermaker.model.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@EnableScheduling
@Component
public class SalesScheduler {

    @Autowired
    StoreDao storeDao;

    @Autowired
    ItemDao itemDao;

    @Autowired
    SalesDao salesDao;

    @Scheduled(fixedDelay = 15000)
    public void startSales()
    {
        List<Store> stores = storeDao.findStoreToShop();
        Integer upperLimit = stores.size();
        String customerOrderNO = String.valueOf(UUID.randomUUID());
        for(int i = 0;i < 6;i++)
        {
            try {
                Store store = stores.get(Funcs.getRandomNumber(0, upperLimit - 1));
                Item item = itemDao.getItemDetails(store.getItem()).get(0);
                salesDao.makeSales(store,item,customerOrderNO);
                System.out.println("Inserting record" + item);
            }catch (Exception e){
                System.out.println("Failed in sechulder");
                e.printStackTrace();
            }

        }
    }
}
