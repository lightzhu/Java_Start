import cn.demo.service.ShopCarService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
//    普通方式实现的类管理及依赖
    public static void main(String[] args) {
        new ShopCarService();
    }
}
