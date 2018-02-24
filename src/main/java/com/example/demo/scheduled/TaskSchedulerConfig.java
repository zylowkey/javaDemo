/**
 * com.example.demo.scheduled
 */
package com.example.demo.scheduled;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author 1933
 * @date   2018年1月3日
 */
@Configuration
@ComponentScan("com.example.demo.scheduled")
@EnableScheduling //注解开启对计划任务的支持
public class TaskSchedulerConfig {

}
