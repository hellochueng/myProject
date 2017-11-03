package groupthree.myspace.zmh.controller;

import groupthree.myspace.bean.aldum;
import groupthree.myspace.bean.imgLog;
import groupthree.myspace.bean.person;
import groupthree.myspace.bean.picture;
import groupthree.myspace.zmh.service.impl.PsServiceImpl;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;
@Controller
@RequestMapping(value="/zmhperson",produces="text/plain;charset=utf-8")
public class PsController {

	 SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
	@Resource(name="zmhPsServiceImpl") PsServiceImpl service;
	

	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
    public String login(HttpServletRequest request,int space,int pwd,Model model){
		person user = service.login(space, pwd);
		if(user!=null){  
			request.getSession().setAttribute("user", user);
			return "ok";
		}else{
			return "buok";
		}
	}
	
	@RequestMapping(value="/show.do",produces="text/plain;charset=utf-8",method=RequestMethod.GET)
	@ResponseBody 
	public String show(HttpServletRequest request) throws IOException{
		
		//System.out.println(request.getSession().getAttribute("person"));
		return new Gson().toJson(request.getSession().getAttribute("user"));
	}
	
	@RequestMapping(value="/showImgLog.do",produces="text/plain;charset=utf-8",method=RequestMethod.GET)
	@ResponseBody 
	public String showImgLog(int id,HttpServletRequest request){
		List<imgLog> list=service.getImgLogByPersonId(id);
		//request.getSession().setAttribute("", arg1);
		return new Gson().toJson(list);
	}
	
	@RequestMapping(value="/showAldum.do",produces="text/plain;charset=utf-8",method=RequestMethod.GET)
	@ResponseBody 
	public String showAldum(HttpServletRequest request){
		person person = (person) request.getSession().getAttribute("user");
//		System.out.println(person.getId());
		List<aldum> list=service.getAldumAllByPersonId(person.getId());
		return new Gson().toJson(list);
	}
	
	
	@RequestMapping(value="/showPicture.do",produces="text/plain;charset=utf-8",method=RequestMethod.GET)
	@ResponseBody 
	public String showPicture(int id,HttpServletRequest request){
		List<picture> list=service.getPictureByAldumId(id);
		return new Gson().toJson(list);
	}
	
	@RequestMapping(value="/transfrom.do",method=RequestMethod.POST)
	
	public void transfrom(@RequestParam("file")MultipartFile file,HttpServletRequest request,HttpServletResponse response) throws IllegalStateException, IOException{
	    int aldum_id=Integer.parseInt(request.getParameter("aludumId"));
//		 System.out.println(aldum_id);
		String img=request.getSession().getId()+System.currentTimeMillis();
		String path=request.getServletContext().getRealPath("/lzz/all/aldum_images");
	    file.transferTo(new File(path+"//"+img+".jpg"));
	    service.addPictureInAldum(new picture(9,"/myspace/lzz/all/aldum_images/"+img+".jpg",0,sf.format(new Date()),0, aldum_id));
	    response.sendRedirect("/myspace/lzz/mainView.html");
	}

	
	@RequestMapping(value="/newAldum.do")
	@ResponseBody 
	public void newAldum(@RequestParam("aludmName")String aldumName,HttpServletRequest request){
		 person person = (person) request.getSession().getAttribute("user");		
//		 System.out.println(person.getId());
		 service.addNewAldum(new aldum(10, sf.format(new Date()),0,0, aldumName, person.getId()));
	   
	}
	
	

	@RequestMapping(value="/deletePicture.do" ,produces="text/plain;charset=utf-8",method=RequestMethod.GET)
	@ResponseBody 
	public void deletePicture(HttpServletRequest request){
		String[] items=request.getParameter("items").split(",");
		int[] pidItems=new int[items.length];
		for (int i = 0; i < items.length; i++) {
			 pidItems[i]=Integer.parseInt(items[i]);
			service.deletePicture(pidItems[i]);
		}
	
	}
	
	@RequestMapping(value="/updateAldum.do",produces="text/plain;charset=utf-8",method=RequestMethod.GET )
	@ResponseBody 
	public void updateAldum(HttpServletRequest request){
	   String aldumName=request.getParameter("aldumName");
	   int aldumId=Integer.parseInt(request.getParameter("aldumId"));	 
	   service.updateAldumName(aldumName, aldumId);	   
	}
	
	@RequestMapping(value="/deleteAldum.do",produces="text/plain;charset=utf-8",method=RequestMethod.GET )
	@ResponseBody 
	public void deleteAldum(HttpServletRequest request){
		String[] items=request.getParameter("items").split(",");
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i]);
			service.deleteAldum(Integer.parseInt(items[i]), 1);
			
		}  
	}
	
	@RequestMapping(value="/getAllFriendImgLog.do",produces="text/plain;charset=utf-8",method=RequestMethod.GET )
	@ResponseBody 
	public String getAllFriendImgLog(HttpServletRequest request){
		person person = (person) request.getSession().getAttribute("user");
		if(person!=null)
			return new Gson().toJson(service.getAllImgLogByPersonId(person.getId()));
		return "";
	}
}
