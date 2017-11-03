/**
 * 
 */
package groupthree.myspace.lhf.servlet;

import groupthree.myspace.lhf.bean.LHFImgLog;
import groupthree.myspace.lhf.service.ImgLogService;
import groupthree.myspace.lhf.service.impl.ImgLogServiceImpl;
import groupthree.myspace.lhf.tools.CommTools;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author �޻��
 *
 */
@WebServlet("/ImgLogServlet")
public class ImgLogServlet extends HttpServlet {
	ImgLogService service=new ImgLogServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type=request.getParameter("type");
		try {
			Method th=ImgLogServlet.class.getMethod(type, HttpServletRequest.class,HttpServletResponse.class);
			th.invoke(this,request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		response.getWriter().flush();
		response.getWriter().close();
	}
	
	
	
	/*//���ݽ�ɫID��ѯ����Ȩ��
	public void getSystemsByRolesId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		UserInfo info= (UserInfo) request.getSession().getAttribute("info");
		if (info!=null) {
			//System.out.println("------------");
			List<Systems> list = service.getSystemsByRolesId(info.getRolesid());
			response.getWriter().write(CommTools.gson.toJson(list));
		}else
			response.getWriter().write("1");
	}	*/
		
	//��ȡ���е�δ��ɾ����˵˵,��is_deleteΪ0������˵˵
	public void getImgLogAll(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		LHFImgLog imglog=(LHFImgLog) request.getSession().getAttribute("imglog");
		if(imglog!=null){
			List<LHFImgLog> list=service.getImgLogAll(0);
			response.getWriter().write(CommTools.gson.toJson(list));
		}else{
			response.getWriter().write("1");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}