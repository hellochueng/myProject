package groupthree.myspace.lzz.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import groupthree.myspace.bean.chatLog;
import groupthree.myspace.bean.friend;
import groupthree.myspace.bean.friendApply;
import groupthree.myspace.bean.person;

public interface LzzFriendDao {
	List<friend> getFriendAll(Integer id);
	
	List<chatLog> getChatLog(Integer person_id,Integer friend_id);
	
	int sendMessage(chatLog chat);
	
	List<friendApply> hasApply(Integer id);
	
	int updateApply(friendApply friendApply);

	friend isFriend(friend friend);
	
	int beFriend(friend friend);
}
