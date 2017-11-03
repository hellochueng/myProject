package groupthree.myspace.lzz.controller;

import groupthree.myspace.bean.chatLog;
import groupthree.myspace.bean.friendApply;
import groupthree.myspace.bean.person;
import groupthree.myspace.lzz.service.LzzFriendService;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;


@Controller(value="LzzFriendController")
@RequestMapping(value="/friendAction",produces="text/plain;charset=utf-8")
public class LzzFriendController {
	@Resource(name="LzzFriendService")LzzFriendService lzzFriendService;
	Gson gson = new Gson();
	@Autowired
	friendApply friendApply;
	
	@RequestMapping(value="/setFriendList.do")
	@ResponseBody
	public String setFriendList(HttpServletRequest request){
		person person = (person)request.getSession().getAttribute("user");
		if(person!=null)
			return gson.toJson(lzzFriendService.getFriendAll(person.getId()));
		else return "";
	}

	@RequestMapping(value="/setChatLog.do")
	@ResponseBody
	public String setChatLog(String friend_id,HttpServletRequest request){
		person person = (person)request.getSession().getAttribute("user");
		List<chatLog> chatLog = lzzFriendService.getChatLog(person.getId(), Integer.parseInt(friend_id));
		return gson.toJson(chatLog);
	}
	
	@RequestMapping(value="/sendMessage.do")
	@ResponseBody
	public void sendMessage(chatLog cl,HttpServletRequest request){
		person p = (person) request.getSession().getAttribute("user");
		cl.setSender_id(p.getId());
		lzzFriendService.sendMessage(cl);
	}
	
	@RequestMapping(value="/getApply.do")
	@ResponseBody
	public String getApply(HttpServletRequest request){
		return gson.toJson(lzzFriendService.hasApply(((person)request.getSession().getAttribute("user")).getId()));
	}
	
	
	@RequestMapping(value="/refusefriend.do")
	@ResponseBody
	public void refusefriend(@RequestParam("friend_id")Integer friend_id,@RequestParam("person_id")Integer person_id,HttpServletRequest request){
		System.out.println(friend_id+person_id);
		friendApply.setApply_id(friend_id);
		friendApply.setPerson_id(person_id);
		lzzFriendService.refuseFriend(friendApply);
	}

	@RequestMapping(value="/doFriend.do")
	@ResponseBody
	public String befriend(@RequestParam("remark")String remark,
			@RequestParam("friend_id")Integer friend_id,
			@RequestParam("person_id")Integer person_id,
			HttpServletRequest request){
		friendApply.setApply_id(friend_id);
		friendApply.setPerson_id(person_id);
		String name=((person)request.getSession().getAttribute("user")).getName();
		if(lzzFriendService.beFriend(friendApply, remark,name))
			return "ok";
		else return "al";
	}
}
