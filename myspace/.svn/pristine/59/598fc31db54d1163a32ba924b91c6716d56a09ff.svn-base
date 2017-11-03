package groupthree.myspace.lzz.service;

import groupthree.myspace.bean.chatLog;
import groupthree.myspace.bean.friend;
import groupthree.myspace.bean.friendApply;

import java.util.List;

public interface LzzFriendService {
	List<friend> getFriendAll(Integer id);
	
	List<chatLog> getChatLog(Integer person_id,Integer friend_id);
	
	int sendMessage(chatLog chat);
	
	List<friendApply> hasApply(Integer id);
	
	boolean beFriend(friendApply friendApply,String remark,String name);
	
	boolean refuseFriend(friendApply friendApply);
}
