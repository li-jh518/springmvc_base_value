/** 

 * @author LI 
 * @version 创建时间：2021年7月13日 下午4:57:33 
 * package:com.etc.controller
 * 处理器（自定义）注解实现控制业务

 */ 
package com.etc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.etc.pojo.Orders;
import com.etc.pojo.User;

@Controller
@RequestMapping("/itemsController4")
public class ItemsController4 {
	/**
	 * 实现Controller构造方法 自定义方法，获取页面传过来的值 int对象获取客户端数据
	 */
	@RequestMapping(value="/firstController41")
	public String userRequestParam(Integer sid) throws Exception{
		System.out.println("从页面得到的值：" + sid);
		return "success";
	}
	
	@RequestMapping(value="/firstController42")
	public String userRequestParamSid(@RequestParam(value="xxxxid",defaultValue="2119",required=true)Integer sid) throws Exception{
		System.out.println("从页面得到的值：" + sid);
		return "success";
	}
	
	/**
	 * 实现Controller 	去注册页面
	 */
	@RequestMapping(value="/to43")
	public String register() throws Exception{
		return "register";
	}
	
	/**
	 * 实现Controller构造方法 传一个pojo对象 多个属性 注释
	 */
	@RequestMapping(value="/firstController43")
	public String register(User user) throws Exception{
		System.out.println("从页面得到的值：" + user.getUsername() + ":" + user.getPassword());
		return "success";
	}
	
	/**
	 * 实现Controller 	去订单页面
	 */
	@RequestMapping(value="/to44")
	public String toOrder() throws Exception{
		return "orders";
	}
	
	/**
	 * 实现Controller构造方法 传一个pojo对象 包含另一个User,一个对象stu
	 */
	@RequestMapping(value="/firstController44")
	public String findOrder(Orders orders) throws Exception{
		System.out.println("从页面得到的值：" + orders.getOrderId() + ":" + orders.getUser().getUsername() + ":" + orders.getUser().getPassword());
		return "success";
	}
	
	/**
	 * 实现Controller 	去批量删除用户页面
	 */
	@RequestMapping(value="/to45")
	public String toUserDelete() throws Exception{
		return "user";
	}
	
	/**
	 * 实现Controller构造方法 传一个pojo对象 包含另一个User,一个对象stu
	 */
	@RequestMapping(value="/firstController45")
	public String deleteUsers(Integer[] ids) throws Exception{
		if(ids != null){
			for(Integer id : ids){
				System.out.println("刪除用戶的id為：" + id);
			}
			return "success";
		}else{
			System.out.println("刪除用戶的id不存在。。。。。。");
		}
		return "user";
	}
}
