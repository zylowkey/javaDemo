package com.example.demo.event;

import org.springframework.context.ApplicationEvent;
/**	
 * 自定义事件
 * @author 1933
 * @date   2017年11月22日
 */
public class DemoEvent extends ApplicationEvent{
	private static final long serialVersionUID = 1L;
	private String msg;
	public DemoEvent(Object source,String msg) {
		super(source);
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
