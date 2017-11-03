package groupthree.myspace.lzz.dao.daoImpl;

import groupthree.myspace.bean.chatLog;
import groupthree.myspace.bean.friend;
import groupthree.myspace.bean.friendApply;
import groupthree.myspace.lzz.dao.LzzFriendDao;
import groupthree.myspace.lzz.mapper.LzzFriend_Mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository(value="LzzFriendDao")
public class LzzFriendDaoImpl extends LzzBaseDao implements LzzFriendDao{

	@Override
	public List<friend> getFriendAll(Integer id) {
		return getMapper(LzzFriend_Mapper.class).getFriendAll(id);
	}

	@Override
	public List<chatLog> getChatLog(Integer person_id, Integer friend_id) {
		return getMapper(LzzFriend_Mapper.class).getChatLog(person_id, friend_id);
	}

	@Override
	public int sendMessage(chatLog chat) {
		return getMapper(LzzFriend_Mapper.class).sendMessage(chat);
	}

	@Override
	public List<friendApply> hasApply(Integer id) {
		return getMapper(LzzFriend_Mapper.class).hasApply(id);
	}

	@Override
	public int updateApply(friendApply friendApply) {
		return getMapper(LzzFriend_Mapper.class).updateApply(friendApply);
	}

	@Override
	public friend isFriend(friend friend) {
		return getMapper(LzzFriend_Mapper.class).isFriend(friend);
	}

	@Override
	public int beFriend(friend friend) {
		return getMapper(LzzFriend_Mapper.class).beFriend(friend);
	}

}
