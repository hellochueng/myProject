package groupthree.myspace.lhf.controller;

import groupthree.myspace.lhf.service.ImgLogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class ImgLogController {
	
	ImgLogService service;
	private Integer is_delete;
	
	@RequestMapping("/index")
	public String index(){
		System.out.println(service.getImgLogAll(is_delete));
		return "index";
	}
}
