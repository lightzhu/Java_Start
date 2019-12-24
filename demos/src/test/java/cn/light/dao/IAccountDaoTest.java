package cn.light.dao;

import cn.light.beans.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class IAccountDaoTest {

    @Test
    public void findAll() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        SqlSession session = factory.openSession();
        IAccountDao acd = session.getMapper(IAccountDao.class);
        List<Account> lists = acd.findAll();
        for (Account item:lists){
            System.out.println(item);
        }
        IProductDao pd = session.getMapper(IProductDao.class);
        System.out.println(pd.findByName("苹果"));
        session.close();
        inputStream.close();
    }
}