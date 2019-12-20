package cn.demo.service;

import cn.demo.dao.ShopCarDao;

public class ShopCarService {
    private ShopCarDao scd ;

    public ShopCarService() {
        this.scd = new ShopCarDao();
        System.out.println("090");
        scd.addToCar();
    }
    public static void ActionServiceXml(){

    }
}
