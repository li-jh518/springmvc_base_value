/** 

 * @author LI 
 * @version 创建时间：2021年7月13日 下午4:57:33 
 * package:com.etc.controller
 * 处理器（自定义）注解实现控制业务

 */ 
package com.etc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/itemsController3")
public class ItemsController3 {
	/**
	 * 实现Controller构造方法 自定义方法，获取页面传过来的值 request对象获取客户端数据
	 */
	@RequestMapping(value="/firstController3")
	public String userRequestParam(HttpServletRequest request) throws Exception{
		String str = request.getParameter("id");
		System.out.println("从页面得到的值：" + str);
		return "success";
	}
}
