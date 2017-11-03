package groupthree.myspace.zmh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import groupthree.myspace.bean.aldum;
import groupthree.myspace.bean.friend;
import groupthree.myspace.bean.imgLog;
import groupthree.myspace.bean.imgLogCmt;
import groupthree.myspace.bean.person;
import groupthree.myspace.bean.picture;
import groupthree.myspace.lzz.dao.daoImpl.LzzPersonDaoImpl;
import groupthree.myspace.zmh.dao.PsDao;
import groupthree.myspace.zmh.service.PsService;











import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.stereotype.Service;
//@Service(value="zmhPsServiceImpl")
@Service(value="zmhPsServiceImpl")
public class PsServiceImpl implements PsService{
    @Resource(name="zmhPsDaoImpl")PsDao dao;
    @Resource(name="LzzPersonDao")LzzPersonDaoImpl lzzDao;
	//@Autowired
	//PsDao dao;
	
	@Override
	public person login(int space, int pwd) {
		
		if(dao.login(space, pwd)!=null){
			return dao.login(space, pwd);
		}
		return null;
	}

	@Override
	public List<aldum> getAldumAllByPersonId(int id) {
		
		return dao.getAldumAllByPersonId(id);
	}

	@Override
	public List<picture> getPictureByAldumId(int id) {
		
		return dao.getPictureByAldumId(id);
	}

	@Override
	public List<imgLog> getImgLogByPersonId(int id) {
		
		return dao.getImgLogByPersonId(id);
	}

	@Override
	public List<friend> getFriendsByPersonId(int id) {
		return dao.getFriendsByPersonId(id);
	}

	@Override
	public int addPictureInAldum(picture picture) {
		
		return dao.addPictureInAldum(picture);
	}

	@Override
	public int addNewAldum(aldum aldum) {
		
		return dao.addNewAldum(aldum);
	}

	@Override
	public int deletePicture(int id) {
		return dao.deletePicture(id);
	}

	@Override
	public int updateAldumName(String name, int id) {
	
		return dao.updateAldumName(name, id);
	}

	@Override
	public int deleteAldum(int id, int is_delete) {
		
		return dao.deleteAldum(id, is_delete);
	}

	@Override
	public List<imgLog> getAllImgLogByPersonId(int person_id) {
		List<imgLog> imglog = dao.getAllImgLogByPersonId(person_id);
		for(int i=0;i<imglog.size();i++){
			imglog.get(i).setImgLogCmt_list(lzzDao.getImgLogCmt(imglog.get(i).getId()));
			imglog.get(i).setLogLiker_list(lzzDao.getPersonImgLogLiker(imglog.get(i).getId()));
		}
		return imglog;
	}

	
	
}
