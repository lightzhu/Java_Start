package cn.demo.dao;

import cn.demo.beans.Product;

public class ShopCarDao {
    private static Product p=null;
    static {
        p = new Product();
        p.setName("手机");
        p.setPrice(1234.5);
    }
    public void addToCar(){
        System.out.println( p +"保存成功！");
    }
}
