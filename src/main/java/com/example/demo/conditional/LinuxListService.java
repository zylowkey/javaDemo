/**
 * com.example.demo.conditional
 */
package com.example.demo.conditional;

/**
 * @author 1933
 * @date   2018年1月3日
 */
//Linux系统下需要创建的Bean
public class LinuxListService implements ListService {

	@Override
	public String showListCmd() {
		return "ls";
	}

}
