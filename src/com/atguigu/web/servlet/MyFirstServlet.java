package com.atguigu.web.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 *  Servlet是单例的！
 *    构造器----Init(只执行一次)---service(处理一次请求，调用一次)---destroy(只执行一次)
 *    
 *    原生的servlet创建复杂，很多方法无需实现。
 *    	推荐继承HttpServlet，重写其中的doGet()和doPost()即可完成对get和post请求 的处理
 */
public class MyFirstServlet implements Servlet{

	// destroy在当前MyFirstServlet对象销毁时执行
	@Override
	public void destroy() {
		System.out.println("MyFirstServlet been destroyed!");
	}

	// 获取当前MyFirstServlet的配置对象
	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	// 获取当前MyFirstServlet的说明信息
	@Override
	public String getServletInfo() {
		return null;
	}

	// init在当前MyFirstServlet对象创建后执行
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("MyFirstServlet been inited!");
	}

	
	// 处理请求
	// ServletRequest代表请求对象，包含了请求报文中的所有内容，例如请求头，请求方式，请求体等
	// ServletResponse代表响应对象，包含了响应报文中的所有内容，例如响应头，响应体等
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("MyFirstServlet 处理请求!");
	}
	
	public MyFirstServlet() {
		System.out.println("MyFirstServlet been created!");
	}

}
