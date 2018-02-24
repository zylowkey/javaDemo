/**
 * com.example.demo.repository.impl
 */
package com.example.demo.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;

import com.example.demo.bean.User;
import com.example.demo.repository.UserRepository;

/**
 * @author 1933
 * @date   2017年12月2日
 */
@Repository
public class UserRepositoryImpl implements UserRepository {
	private static AtomicLong counter = new AtomicLong();
	private final ConcurrentMap<Long, User> userMap = new ConcurrentHashMap<>();
	/* (non-Javadoc)
	 * @see com.example.demo.repository.UserRepository#saveOrUpdate(com.example.demo.bean.User)
	 */
	@Override
	public User saveOrUpdate(User user) {
		Long id = user.getId();
		if(null == id){
			id = counter.incrementAndGet();
			user.setId(id);
		}
		this.userMap.put(id,user);
		return user;
	}

	/* (non-Javadoc)
	 * @see com.example.demo.repository.UserRepository#deleteUser(java.lang.Long)
	 */
	@Override
	public void deleteUser(Long id) {
		userMap.remove(id);
	}

	/* (non-Javadoc)
	 * @see com.example.demo.repository.UserRepository#getUserById(java.lang.Long)
	 */
	@Override
	public User getUserById(Long id) {
		return this.userMap.get(id);
	}

	/* (non-Javadoc)
	 * @see com.example.demo.repository.UserRepository#listUser()
	 */
	@Override
	public List<User> listUser() {
		// TODO Auto-generated method stub
		return new ArrayList<>(userMap.values());
	}

}
