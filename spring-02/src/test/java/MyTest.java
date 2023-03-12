import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ouma.config.MyConfig;
import ouma.pojo.User;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = (User)applicationContext.getBean("getUser");
        System.out.println(user.name);
    }
}
