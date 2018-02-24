/**
 * com.example.demo.taskexecutor
 */
package com.example.demo.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 任务执行类
 * @author 1933
 * @date   2017年11月22日
 */
@Service
public class AsyncTaskService {
	@Async  //表明该方法是异步方法，如果注解在类级别，则表明该类所有的方法都是异步方法。这里的方法会被自动注入使用ThreadPoolTaskExecutor作为taskExecutor
	public void executeAsyncTask(Integer i){
		System.out.println("执行异步任务 "+i);
	}
	
	@Async
	public void executeAsyncTaskPlus(Integer i){
		System.out.println("执行异步任务+1 "+i);
	}
}
