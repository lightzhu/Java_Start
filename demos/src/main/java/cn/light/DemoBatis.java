package cn.light;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class DemoBatis {
    private static SqlSessionFactory aqlSessionFactory;
    private static Reader reader;
    static {
        String resource = "dbconfig.xml";
        try {
            reader = Resources.getResourceAsReader(resource);
            aqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSession(){
        return aqlSessionFactory.openSession();
    }
}
