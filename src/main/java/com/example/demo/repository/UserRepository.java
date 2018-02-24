/**
 * com.example.demo.repository
 */
package com.example.demo.repository;

import java.util.List;

import com.example.demo.bean.User;

/**
 * User Repository接口.
 * @author 1933
 * @date   2017年12月2日
 */
public interface UserRepository {
	/**
	 * 创建或者修改用户
	 * @param user
	 * @return
	 */
	User saveOrUpdate(User user);
	/**
	 * 删除用户
	 * @param id
	 */
	void deleteUser(Long id);
	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	User getUserById(Long id);
	/**
	 * 获取用户列表
	 * @return
	 */
	List<User> listUser();
}
