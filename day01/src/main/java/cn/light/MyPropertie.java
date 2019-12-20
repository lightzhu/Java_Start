package cn.light;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/*读取配置文件*/
public class MyPropertie {
    public static void main(String[] args) throws IOException {
        readProps();
    }
    public static Properties props;
    public static void readProps() throws IOException {
        props = new Properties();
        InputStream in = MyPropertie.class.getClassLoader().getResourceAsStream("props.properties");
        props.load(in);
        System.out.println(props.getProperty("name"));
    }
}
