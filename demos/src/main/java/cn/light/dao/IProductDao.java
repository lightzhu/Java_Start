package cn.light.dao;

import cn.light.beans.Product;
import org.apache.ibatis.annotations.Select;

public interface IProductDao {
    @Select("select * from product where name=#{name}")
    Product findByName(String name);
}
