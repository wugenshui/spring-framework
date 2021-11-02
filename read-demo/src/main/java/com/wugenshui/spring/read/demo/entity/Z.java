package com.wugenshui.spring.read.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author : chenbo
 * @date : 2021-11-02
 */
@Component
public class Z implements ApplicationContextAware {
	// 注入X
	@Autowired
	X x;

	// 构造方法
	public Z() {
		System.out.println("Z create");
	}

	// ApplicationContextAware 回调方法
	@Override
	public void setApplicationContext(ApplicationContext ac) {
		System.out.println("call aware callback");
	}

	// 生命周期初始化回调方法
	@PostConstruct
	public void zinit() {
		System.out.println("call z lifecycle init callback");
	}

}
