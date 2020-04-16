package com.jjk.Provider.config;

import com.jjk.Provider.Service.UserService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration // 配置注解
@ConditionalOnClass(UserService.class)
public class UserServiceAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(UserService.class)// 当容器中没有指定Bean的情况下，自动配置PersonService类
    public UserService GetUserService(){
        UserService personService = new UserService();
        return personService;
    }

}
