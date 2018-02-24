package com.example.demo.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //申明当前类是一个配置类
@ComponentScan("com.example.demo.di") //自动扫描包名下的所有使用@Service、@Component、@Repository和@Controller的类，并注册为bean
public class DiConfig {

}
