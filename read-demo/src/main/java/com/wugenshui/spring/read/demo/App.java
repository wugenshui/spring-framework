package com.wugenshui.spring.read.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class App {
	public static void main(String[] args) throws IOException {
		ClassPathResource resource = new ClassPathResource("spring.xml");
		InputStream inputStream = resource.getInputStream();

		System.out.println(readInputStream(inputStream));

		System.out.println(resource.exists());
		System.out.println(resource.contentLength());
		System.out.println(resource.getFilename());
		System.out.println(resource.lastModified());
		System.out.println(resource.getDescription());
		System.out.println(resource.isOpen());
		System.out.println(resource.isReadable());
		System.out.println("输出中文");

		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring.xml"));
		MyTestBean bean = (MyTestBean) bf.getBean("MyTestBean");
		System.out.println("bean = " + bean.getTestStr());

		System.out.println("init");
	}

	public static String readInputStream(InputStream inputStream) throws IOException {
		byte[] buffer = new byte[1024];
		int len = 0;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		while ((len = inputStream.read(buffer)) != -1) {
			bos.write(buffer, 0, len);
		}
		bos.close();
		final byte[] bytes = bos.toByteArray();
		return new String(bytes);
	}
}
