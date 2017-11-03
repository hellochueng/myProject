/**
 * 
 */
package groupthree.myspace.lhf.controller;

import groupthree.myspace.lhf.bean.LHFLogImg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 罗会峰
 *
 */
@Controller
@RequestMapping("/lzz")
public class LogImgController {
	//上传说说图片
	@RequestMapping(value="/mainView",method=RequestMethod.POST)
	public String index(@ModelAttribute("logimg")LHFLogImg info,@RequestParam("file")MultipartFile file,HttpServletRequest request ) throws IllegalStateException, IOException{
		//文件名
		String img= request.getSession().getId()+ System.currentTimeMillis();
		String path=request.getServletContext().getRealPath("img");
		System.out.println(file.getOriginalFilename());
		System.out.println(path);
		file.transferTo(new File(path+"//"+img+".jpg"));
		
		return "mainView";
	}
	
/*	@RequestMapping(value="/downImg/{name}")
	public void downImg(HttpServletRequest request,@PathVariable("name")String name,HttpServletResponse response) throws IOException{
		String serverPath=request.getServletContext().getRealPath("img");
		File file=new File(serverPath+"//"+name+".jpg");
		System.out.println("serverPath:"+serverPath);
		System.out.println("name:"+name);
		if (file.exists()) {
			response.addHeader("Content-Disposition","attachment;filename="+name+".jpg");
			OutputStream output= response.getOutputStream();
			FileInputStream input=new FileInputStream(file);
			byte[] b=new byte[1024];
			int i=0;
			while ((i=input.read(b))>0) {
				output.write(b, 0, i);
			}
			input.close();
			output.flush();
			output.close();
		}
	}
	
	@RequestMapping(value="/down",method=RequestMethod.GET)
	public void down(String path,HttpServletRequest request,HttpServletResponse response) throws IllegalStateException, IOException{
		response.addHeader("Content-Disposition","attachment;filename=" + path);  
		
		String serverPath=request.getServletContext().getRealPath("/img");
		FileInputStream input=new FileInputStream(serverPath+"//"+path);
		OutputStream output= response.getOutputStream();
		
		byte[] b=new byte[1024];
		int i=0;
		while ((i=input.read(b))>0) {
			output.write(b, 0, i);
		}
		input.close();
		output.flush();
		output.close();
	}*/
}
