/**
 * com.example.demo.scheduled
 */
package com.example.demo.scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author 1933
 * @date   2018年1月3日
 */
@Service
public class ScheduledTaskService {
	private static final SimpleDateFormat sf = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate=5000)
	//@Scheduled 声明计划任务  fixedRate每隔固定时间执行
	public void reportCurrentTime(){
		System.out.println("每隔5秒执行一次 "+sf.format(new Date()));
	}
	
	@Scheduled(cron="0 42 16 ? * *")
	public void fixTimeExecution(){
		System.out.println("在指定时间 "+sf.format(new Date())+"执行");
	}
}
