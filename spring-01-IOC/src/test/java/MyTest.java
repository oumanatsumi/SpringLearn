import com.ouma.pojo.Master;
import com.ouma.pojo.Student;
import com.ouma.pojo.Teacher;
import com.ouma.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.name);

    }
}
