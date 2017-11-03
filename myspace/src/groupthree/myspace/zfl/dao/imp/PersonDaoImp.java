package groupthree.myspace.zfl.dao.imp;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import groupthree.myspace.bean.aldum;
import groupthree.myspace.bean.chatLog;
import groupthree.myspace.bean.friend;
import groupthree.myspace.bean.imgLog;
import groupthree.myspace.bean.imgLogCmt;
import groupthree.myspace.bean.imgLogLiker;
import groupthree.myspace.bean.logImg;
import groupthree.myspace.bean.person;
import groupthree.myspace.bean.picture;
import groupthree.myspace.zfl.dao.BasicDao;
import groupthree.myspace.zfl.dao.IPersonDao;
import groupthree.myspace.zfl.mapper.PersonMapper;

@Repository(value="zflPersonDaoImp")
public class PersonDaoImp extends BasicDao implements IPersonDao {

	@Override
	public List<person> selectPerson(int pagesize,int pageindex) {
		// TODO Auto-generated method stub
		return getMapper(PersonMapper.class).selectPerson((pageindex-1)*pagesize+1,pageindex*pagesize);
	}

	@Override
	public person selectPersonByNameAndPwd(String name, String pwd) {
		// TODO Auto-generated method stub
		return getMapper(PersonMapper.class).selectPersonByNameAndPwd(name,pwd);
	}

	@Override
	public List<imgLog> selectImgLog(int pagesize,int pageindex) {
		// TODO Auto-generated method stub
		return getMapper(PersonMapper.class).selectImgLog((pageindex-1)*pagesize+1,pageindex*pagesize);
	}

	@Override
	public List<imgLogCmt> selectImgLogCmt(int id) {
		// TODO Auto-generated method stub
		return getMapper(PersonMapper.class).selectImgLogCmt(id);
	}

	@Override
	public List<imgLogLiker> selectLogLiker(int id) {
		// TODO Auto-generated method stub
		return getMapper(PersonMapper.class).selectLogLiker(id);
	}

	@Override
	public List<logImg> selectLogImg(int id) {
		// TODO Auto-generated method stub
		return getMapper(PersonMapper.class).selectLogImg(id);
	}

	@Override
	public List<friend> selectFriend(int id) {
		// TODO Auto-generated method stub
		return getMapper(PersonMapper.class).selectFriend(id);
	}

	@Override
	public List<picture> selectPicture(int id) {
		// TODO Auto-generated method stub
		return getMapper(PersonMapper.class).selectPicture(id);
	}

	@Override
	public List<aldum> selectAldum(int id) {
		// TODO Auto-generated method stub
		return getMapper(PersonMapper.class).selectAldum(id);
	}

	@Override
	public List<chatLog> selectChatLog(int id) {
		// TODO Auto-generated method stub
		return getMapper(PersonMapper.class).selectChatLog(id);
	}

}
