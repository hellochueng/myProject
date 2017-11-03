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
	
	//�����û����������ѯ�û������룩
	person selectPersonByNameAndPwd(@Param("name")String name,@Param("pwd")String pwd);
	
	//��ѯ�����û�
	List<person> selectPerson(@Param("begin")int begin,@Param("end")int end);
	
	//��ѯ�û���˵˵
	List<imgLog> selectImgLog(@Param("begin")int begin,@Param("end")int end);
	
	//��ѯ˵˵���� 
	List<imgLogCmt> selectImgLogCmt(@Param("id")int id);
	
	//��ѯ�û�˵˵�ĵ����û�
	List<imgLogLiker> selectLogLiker(@Param("id")int id);
	
	//��ѯ�û�˵˵ͼƬ
	List<logImg> selectLogImg(@Param("id")int id);
	
	//��ѯ�û�����
	List<friend> selectFriend(@Param("id")int id);
	
	//��ѯ���ͼƬ
	List<picture> selectPicture(@Param("id")int id);
	
	//��ѯ�û����
	List<aldum> selectAldum(@Param("id")int id);
	
	//��ѯ�����¼
	List<chatLog> selectChatLog(@Param("id")int id);
}