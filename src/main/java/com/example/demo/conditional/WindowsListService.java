/**
 * com.example.demo.conditional
 */
package com.example.demo.conditional;

/**
 * @author 1933
 * @date   2018年1月3日
 */
//Windows下需要创建的Bean
public class WindowsListService implements ListService {

	@Override
	public String showListCmd() {
		return "dir";
	}

}
