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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.pojo.Item;
@Controller
@RequestMapping("/itemsController2")
public class ItemsController2 {
	/**
	 * 实现Controller构造方法 自定义方法，返回值为字符串
	 */
	@RequestMapping(value="/firstController2")
	public String handleRequest(HttpServletRequest request,HttpServletResponse response,Model model) throws Exception{
		List<Item> list = new ArrayList<Item>();
		Item item1 = new Item(2,"小米手环",150f);
		list.add(item1);
		model.addAttribute("itemsList",list);
		
		return "items/itemsList";
	}
}
