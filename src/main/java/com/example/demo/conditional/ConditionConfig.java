/**
 * com.example.demo.conditional
 */
package com.example.demo.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author 1933
 * @date   2018年1月3日
 */
@Configuration
public class ConditionConfig {
	@Bean
	@Conditional(WindowsCondition.class)
	public ListService windowsListService(){
		return new WindowsListService();
	}
	
	@Bean
	@Conditional(LinuxCondition.class)
	public ListService linuxListService(){
		return new LinuxListService();
	}
}
