package com.wugenshui.spring.read.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : chenbo
 * @date : 2021-11-02
 */
@Component
public class Y {
	@Autowired
	X x;

	public Y(){
		System.out.println("Y create");
	}
}