package groupthree.myspace.zfl.dao;

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

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonDao {
	
	
	//�����û����������ѯ�û������룩
	person selectPersonByNameAndPwd(String name,String pwd);
		
	//��ѯ�����û�
	List<person> selectPerson(int pagesize,int pageindex);
	
	//��ѯ�û���˵˵
	List<imgLog> selectImgLog(int pagesize,int pageindex);
		
	//��ѯ˵˵����
	List<imgLogCmt> selectImgLogCmt(int id);
		
	//��ѯ�û�˵˵�ĵ����û�
	List<imgLogLiker> selectLogLiker(int id);
		
	//��ѯ�û�˵˵ͼƬ
	List<logImg> selectLogImg(int id);
		
	//��ѯ�û�����
	List<friend> selectFriend(int id);
		
	//��ѯ���ͼƬ
	List<picture> selectPicture(int id);
		
	//��ѯ�û����
	List<aldum> selectAldum(int id);
		
	//��ѯ�����¼
	List<chatLog> selectChatLog(int id);
}