package groupthree.myspace.zfl.service.imp;

import groupthree.myspace.bean.person;
import groupthree.myspace.zfl.dao.IPersonDao;
import groupthree.myspace.zfl.service.IPersonService;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import groupthree.myspace.bean.aldum;
import groupthree.myspace.bean.chatLog;
import groupthree.myspace.bean.friend;
import groupthree.myspace.bean.imgLog;
import groupthree.myspace.bean.imgLogCmt;
import groupthree.myspace.bean.imgLogLiker;
import groupthree.myspace.bean.logImg;
import groupthree.myspace.bean.person;
import groupthree.myspace.bean.picture;
import groupthree.myspace.zfl.dao.IPersonDao;
import groupthree.myspace.zfl.service.IPersonService;


@Service(value="zflPersonServiceImp")
public class PersonServiceImp implements IPersonService {

	@Resource(name="zflPersonDaoImp")
	IPersonDao dao;
	
	@Override
	public List<person> selectPerson(int pagesize,int pageindex) {
		// TODO Auto-generated method stub
		return dao.selectPerson(pagesize,pageindex);
	}
	public person selectPersonByNameAndPwd(String name,String pwd){
		return dao.selectPersonByNameAndPwd(name, pwd);
	}
	@Override
	public List<imgLog> selectImgLog(int pagesize,int pageindex) {
		// TODO Auto-generated method stub
		return dao.selectImgLog(pagesize,pageindex);
	}
	@Override
	public List<imgLogCmt> selectImgLogCmt(int id) {
		// TODO Auto-generated method stub
		return dao.selectImgLogCmt(id);
	}
	@Override
	public List<imgLogLiker> selectLogLiker(int id) {
		// TODO Auto-generated method stub
		return dao.selectLogLiker(id);
	}
	@Override
	public List<logImg> selectLogImg(int id) {
		// TODO Auto-generated method stub
		return dao.selectLogImg(id);
	}
	@Override
	public List<friend> selectFriend(int id) {
		// TODO Auto-generated method stub
		return dao.selectFriend(id);
	}
	@Override
	public List<picture> selectPicture(int id) {
		// TODO Auto-generated method stub
		return dao.selectPicture(id);
	}
	@Override
	public List<aldum> selectAldum(int id) {
		// TODO Auto-generated method stub
		return dao.selectAldum(id);
	}
	@Override
	public List<chatLog> selectChatLog(int id) {
		// TODO Auto-generated method stub
		return dao.selectChatLog(id);
	}

}
