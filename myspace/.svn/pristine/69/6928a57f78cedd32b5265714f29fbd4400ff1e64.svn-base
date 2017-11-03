package groupthree.myspace.lzz.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import groupthree.myspace.bean.friendApply;
import groupthree.myspace.bean.imgLog;
import groupthree.myspace.bean.imgLogCmt;
import groupthree.myspace.bean.imgLogLiker;
import groupthree.myspace.bean.logImg;
import groupthree.myspace.bean.person;

public interface LzzPersonDao {
	person login(person person);
	int register(person person);
	int changePersonInfo(person person);
	List<person> getPersonAll(Integer id);
	int applyFriend(friendApply friendApply);
	List<friendApply> getAllApply();
	int isSendApply(friendApply friendApply);
	
	List<imgLog> getPersonImgLog(Integer id);
	List<imgLogCmt> getImgLogCmt(Integer id);
	List<imgLogLiker> getPersonImgLogLiker(Integer id);
	
	int addLog(imgLog imgLog);
	
	int deleteLog(Integer id);
	
	imgLogLiker IsLiker(imgLogLiker imgLogLiker);
	
	int addLogLiker(imgLogLiker imgLogLiker);
	
	int likeLog(Integer is_delete,Integer id);
	
	int sendCmt(imgLogCmt imgLogCmt);
}
