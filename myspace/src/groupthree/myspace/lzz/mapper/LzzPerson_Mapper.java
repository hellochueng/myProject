package groupthree.myspace.lzz.mapper;

import groupthree.myspace.bean.friendApply;
import groupthree.myspace.bean.imgLog;
import groupthree.myspace.bean.imgLogCmt;
import groupthree.myspace.bean.imgLogLiker;
import groupthree.myspace.bean.logImg;
import groupthree.myspace.bean.person;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface LzzPerson_Mapper {
	person personLogin(person person);
	
	List<person> getPersonAll(Integer id);
	
	int personRegister(person person);
	
	int changePersonInfo(person person);
	
	int applyFriend(friendApply friendApply);
	
	List<friendApply> getAllApply();
	
	int isSendApply(friendApply friendApply);
	
	List<imgLog> getPersonImgLog(Integer id);
	
	List<imgLogCmt> getImgLogCmt(Integer id);
	
	
	List<imgLogLiker> getLikers(Integer id);
	
	int addLog(imgLog imgLog);
	
	int deleteLog(@Param("id")Integer id);
	
	imgLogLiker IsLiker(imgLogLiker imgLogLiker);
	
	int addLogLiker(imgLogLiker imgLogLiker);
	
	int likeLog(@Param("is_delete")Integer is_delete,@Param("id")Integer id);
	
	int sendCmt(imgLogCmt imgLogCmt);
}
