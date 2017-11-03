package groupthree.myspace.lzz.mapper;

import groupthree.myspace.bean.chatLog;
import groupthree.myspace.bean.friend;
import groupthree.myspace.bean.friendApply;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface LzzFriend_Mapper {
	
	List<friend> getFriendAll(Integer id);
	
	List<chatLog> getChatLog(@Param("person_id")Integer person_id,@Param("friend_id")Integer friend_id);
	
	int sendMessage(chatLog chat);
	
	List<friendApply> hasApply(Integer id);
	
	friend isFriend(friend friend);
	
	int beFriend(friend friend);
	
	int updateApply(friendApply friendApply);
}
