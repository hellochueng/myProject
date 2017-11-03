package groupthree.myspace.zfl.controller;

import java.util.List;
import javax.annotation.Resource;

import groupthree.myspace.bean.friend;
import groupthree.myspace.bean.imgLog;
import groupthree.myspace.bean.person;
import groupthree.myspace.zfl.service.IPersonService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

@RequestMapping(value = "/zfl",produces="text/plain;charset=utf-8")
@Controller("MyController1")
public class MyController {

	Gson gson=new Gson();
	@Resource(name="zflPersonServiceImp")
	IPersonService service;

	@ModelAttribute("person")
	public person getPerson(person per) {
		return per;
	}

	@RequestMapping(value = "/login/{name}/{pwd}")
	public String login(@PathVariable("name") String name,@PathVariable("pwd") String pwd) {
		return "zfl/index";
	}
	
	@RequestMapping(value = "/selectperson/{pagesize}/{pageindex}")
	@ResponseBody
	public String selectPerson(@PathVariable("pagesize")int pagesize,@PathVariable("pageindex")int pageindex) {
		List<person> list=service.selectPerson(pagesize,pageindex);
		String mes=gson.toJson(list);
		return mes;
	}
	@RequestMapping(value = "/selectfriend/{id}")
	@ResponseBody
	public String selectFriend(@PathVariable("id")int id) {
		List<friend> list=service.selectFriend(id);
		String mes=gson.toJson(list);
		return mes;
	}
	
	@RequestMapping(value = "/selectlog/{pagesize}/{pageindex}")
	@ResponseBody
	public String selectLog(@PathVariable("pagesize")int pagesize,@PathVariable("pageindex")int pageindex) {
		List<imgLog> list=service.selectImgLog(pagesize,pageindex);
		for(int i=0;i<list.size();i++){
			list.get(i).setLogLiker_list(service.selectLogLiker(list.get(i).getId()));
			list.get(i).setImgLogCmt_list(service.selectImgLogCmt(list.get(i).getId()));
		}
		String mes=gson.toJson(list);
		return mes;
	}
}
