/** 

 * @author LI 
 * @version 创建时间：2021年7月13日 下午4:57:33 
 * package:com.etc.controller
 * 处理器（自定义）注解实现控制业务

 */ 
package com.etc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.etc.pojo.Item;
@Controller
@RequestMapping("/itemsController")
public class ItemsController {
	/**
	 * 实现Controller构造方法
	 */
	@RequestMapping(value="/firstController")
	public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws Exception{
		List<Item> list = new ArrayList<Item>();
		Item item = new Item(1,"联想笔记本",6000f);
		Item item1 = new Item(2,"小米手环",150f);
		Item item2 = new Item(3,"王者荣耀阿珂",2888f);
		list.add(item);
		list.add(item1);
		list.add(item2);
		//返回ModelAndView对象
		ModelAndView mav = new ModelAndView();
		mav.addObject("itemsList",list);
		//指定视图
		mav.setViewName("items/itemsList");
		
		return mav;
	}
	/**
	 * 实现Controller构造方法 第二方法开发功能
	 */
	@RequestMapping(value="/secondController")
	public ModelAndView secondMethod(HttpServletRequest request,HttpServletResponse response) throws Exception{
		List<Item> list = new ArrayList<Item>();
		Item item = new Item(1,"联想笔记本",6000f);
		list.add(item);
		//返回ModelAndView对象
		ModelAndView mav = new ModelAndView();
		mav.addObject("itemsList",list);
		//指定视图
		mav.setViewName("items/itemsList");
		
		return mav;
	}
}
