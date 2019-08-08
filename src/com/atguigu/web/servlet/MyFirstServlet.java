package com.atguigu.web.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 *  Servlet�ǵ����ģ�
 *    ������----Init(ִֻ��һ��)---service(����һ�����󣬵���һ��)---destroy(ִֻ��һ��)
 *    
 *    ԭ����servlet�������ӣ��ܶ෽������ʵ�֡�
 *    	�Ƽ��̳�HttpServlet����д���е�doGet()��doPost()������ɶ�get��post���� �Ĵ���
 */
public class MyFirstServlet implements Servlet{

	// destroy�ڵ�ǰMyFirstServlet��������ʱִ��
	@Override
	public void destroy() {
		System.out.println("MyFirstServlet been destroyed!");
	}

	// ��ȡ��ǰMyFirstServlet�����ö���
	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	// ��ȡ��ǰMyFirstServlet��˵����Ϣ
	@Override
	public String getServletInfo() {
		return null;
	}

	// init�ڵ�ǰMyFirstServlet���󴴽���ִ��
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("MyFirstServlet been inited!");
	}

	
	// ��������
	// ServletRequest����������󣬰������������е��������ݣ���������ͷ������ʽ���������
	// ServletResponse������Ӧ���󣬰�������Ӧ�����е��������ݣ�������Ӧͷ����Ӧ���
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("MyFirstServlet ��������!");
	}
	
	public MyFirstServlet() {
		System.out.println("MyFirstServlet been created!");
	}

}
