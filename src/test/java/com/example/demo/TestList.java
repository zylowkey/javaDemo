package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		Collections.addAll(list, "1","2","3","4","3");
		System.out.println("最初的list"+list);
		Set<String> set = new HashSet<String>();
		set.addAll(list);
		System.out.println("转换成set之后"+set);
		list.clear();
		System.out.println("list清空之后"+list);
		list.addAll(set);
		System.out.println("list用set装填之后"+list);
		
	}

}
