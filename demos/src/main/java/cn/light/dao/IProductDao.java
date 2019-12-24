package cn.light.dao;

import cn.light.beans.Product;

public interface IProductDao {
    Product findByName(String name);
}
