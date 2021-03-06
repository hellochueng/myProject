package groupthree.myspace.zfl.mapper;

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

import javax.websocket.server.PathParam;

import org.apache.ibatis.annotations.Param;

public interface PersonMapper {
	
	//根据用户名和密码查询用户（登入）
	person selectPersonByNameAndPwd(@Param("name")String name,@Param("pwd")String pwd);
	
	//查询所有用户
	List<person> selectPerson(@Param("begin")int begin,@Param("end")int end);
	
	//查询用户的说说
	List<imgLog> selectImgLog(@Param("begin")int begin,@Param("end")int end);
	
	//查询说说评论 
	List<imgLogCmt> selectImgLogCmt(@Param("id")int id);
	
	//查询用户说说的点赞用户
	List<imgLogLiker> selectLogLiker(@Param("id")int id);
	
	//查询用户说说图片
	List<logImg> selectLogImg(@Param("id")int id);
	
	//查询用户好友
	List<friend> selectFriend(@Param("id")int id);
	
	//查询相册图片
	List<picture> selectPicture(@Param("id")int id);
	
	//查询用户相册
	List<aldum> selectAldum(@Param("id")int id);
	
	//查询聊天记录
	List<chatLog> selectChatLog(@Param("id")int id);
}
