package groupthree.myspace.hjn.controller;

import groupthree.myspace.bean.person;
import groupthree.myspace.hjn.service.HPersonService;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller(value="HjnPersonController")
@RequestMapping(value="/hjn",produces="text/plain;charset=utf-8")
public class HjnPersonController {
	
	@Resource(name="HPersonServiceImp")HPersonService hPersonService;
	//删除用户
	@RequestMapping(value="/deleteP/{id}")
	@ResponseBody
	public String updatePersonById(@PathVariable("id")Integer id){
		if(hPersonService.updatePersonById(id)==1)
			return "1";	
		else
			return "0";
	}
	//删除说说
	@RequestMapping(value="/deleteSS/{person_id}/{id}")
	@ResponseBody
	public String updateImgLogById(@PathVariable("person_id")Integer person_id,@PathVariable("id")Integer id){
		if(hPersonService.updateImgLogById(person_id,id)==1)
			return "1";
		else
			return "0";
	}
	//删除说说评论
	@RequestMapping(value="/deleteSSPL")
	@ResponseBody
	public String updateImgLogCmtById(@PathVariable("id")Integer id){
		hPersonService.updateImgLogCmtById(id);
		return "1";
	}
	//删除相册
	@RequestMapping(value="/deleteXC/{person_id}/{id}")
	@ResponseBody
	public String updateAldumById(@PathVariable("person_id")Integer person_id,@PathVariable("id")Integer id){
		if(hPersonService.updateAldumById(person_id,id)==1)
			return "1";
		else
			return "0";
	}
	//删除相片
	@RequestMapping(value="/deleteXP")
	@ResponseBody
	public String updatePictureById(@PathVariable("id")Integer id){
		hPersonService.updatePictureById(id);
		return "1";
	}
	//删除好友
	@RequestMapping(value="/deleteHY/{pid}/{fid}")
	@ResponseBody
	public String updateFriendById(@PathVariable("pid")Integer pid,@PathVariable("fid")Integer fid){
		if(hPersonService.updateFriendById(pid,fid)==1)
			return "1";
		else
			return "0";
	}
	@RequestMapping(value="/updatePersonInfo")
	@ResponseBody
	public String updatePersonInfomation(person person){
		System.out.println(person);
		int id=person.getId();
		String name=person.getName();
		String pwd=person.getPwd();
		String sex=person.getSex();
		String birthday=person.getBirthday();
		String signature=person.getSignature();
		if(hPersonService.updatePersonInfoById(id, name, pwd, sex, birthday,signature)>0)
			return "1";
		else
			return "0";		
	}
	//修改用户个人属性
	@RequestMapping(value="/updatePerson/{id}/{name}/{pwd}/{sex}/{birthday}/{signature}")
	@ResponseBody
	public String updatePersonInfo(@PathVariable("id")Integer id,@PathVariable("name")String name,@PathVariable("pwd")String pwd,@PathVariable("sex")String sex,@PathVariable("birthday")String birthday,@PathVariable("img")String img,@PathVariable("signature")String signature){
		if(hPersonService.updatePersonInfoById(id, name, pwd, sex, birthday,signature)==1)
			return "1";
		else
			return "0";
	}
	
	//添加用户信息
	@RequestMapping(value="/addPersonInfo/{id}/{space}/{name}/{pwd}/{sex}/{birthday}/{signature}")
	@ResponseBody
	public String addPersonInfo(@PathVariable("id")Integer id,@PathVariable("space")Integer space,@PathVariable("name")String name,@PathVariable("pwd")String pwd,@PathVariable("sex")String sex,@PathVariable("birthday")String birthday,@PathVariable("signature")String signature){
		if(hPersonService.addPersonInfo(id, space, name, pwd, sex, birthday, signature)==1)
			return "1";
		else
			return "0";
	}
}
