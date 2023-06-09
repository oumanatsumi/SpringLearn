import com.ouma.service.UserService;
import com.ouma.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = context.getBean("userService", UserService.class);

        userService.delete();
    }
}
