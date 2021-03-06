package groupthree.myspace.zfl.service;

import groupthree.myspace.bean.aldum;
import groupthree.myspace.bean.chatLog;
import groupthree.myspace.bean.friend;
import groupthree.myspace.bean.imgLog;
import groupthree.myspace.bean.imgLogCmt;
import groupthree.myspace.bean.imgLogLiker;
import groupthree.myspace.bean.logImg;
import groupthree.myspace.bean.person;
import groupthree.myspace.bean.picture;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface IPersonService {
	
	//根据用户名和密码查询用户（登入）
		person selectPersonByNameAndPwd(String name,String pwd);
			
		//查询所有用户
		List<person> selectPerson(int pagesize,int pageindex);
		
		//查询用户的说说
		List<imgLog> selectImgLog(int pagesize,int pageindex);
			
		//查询说说评论
		List<imgLogCmt> selectImgLogCmt(int id);
			
		//查询用户说说的点赞用户
		List<imgLogLiker> selectLogLiker(int id);
			
		//查询用户说说图片
		List<logImg> selectLogImg(int id);
		//查询用户好友
		List<friend> selectFriend(int id);
			
		//查询相册图片
		List<picture> selectPicture(int id);
			
		//查询用户相册
		List<aldum> selectAldum(int id);
			
		//查询聊天记录
		List<chatLog> selectChatLog(int id);
}
