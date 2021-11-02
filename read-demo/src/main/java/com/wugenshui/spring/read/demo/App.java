package com.wugenshui.spring.read.demo;

import com.wugenshui.spring.read.demo.entity.X;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

@Configurable
@ComponentScan("com.wugenshui.spring.read.demo")
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		System.out.println(context.getBean(X.class));
	}

	private void print() throws IOException {
//		ClassPathResource resource = new ClassPathResource("spring.xml");
//		System.out.println(resource.getURL());
//		System.out.println(resource.getURI());
//		InputStream inputStream = resource.getInputStream();
//		System.out.println(readInputStream(inputStream));
//
//		System.out.println(resource.exists());
//		System.out.println(resource.contentLength());
//		System.out.println(resource.getFilename());
//		System.out.println(resource.lastModified());
//		System.out.println(resource.getDescription());
//		System.out.println(resource.isOpen());
//		System.out.println(resource.isReadable());
//		System.out.println("输出中文");
//
//		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring.xml"));
//		MyTestBean bean = (MyTestBean) bf.getBean("MyTestBean");
//		System.out.println("bean = " + bean.getTestStr());
//
//		final ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
//		System.out.println("systemClassLoader = " + systemClassLoader);
//
//		System.out.println("init");
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
