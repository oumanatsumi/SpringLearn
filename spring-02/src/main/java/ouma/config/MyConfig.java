package ouma.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ouma.pojo.User;

@Configuration
public class MyConfig {
    @Bean //通过方法注册一个bean，这里的返回值就Bean的类型，方法名就是bean的id！
    public User getUser(){
        return new User();
    }
}
