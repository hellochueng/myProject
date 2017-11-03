package groupthree.myspace.hjn.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import groupthree.myspace.bean.person;
import groupthree.myspace.hjn.dao.HPersonDao;
import groupthree.myspace.hjn.dao.imp.HPersonDaoImp;
import groupthree.myspace.hjn.service.HPersonService;


@Service(value="HPersonServiceImp")
public class HPersonServiceImp implements HPersonService {

	@Resource(name="HPersonDaoImp")HPersonDao dao;

	@Override
	public Integer updatePersonById(Integer id) {
		 if(dao.updatePersonById(id)>0)
			 return 1;
		 else
			 return 0;
	}

	@Override
	public Integer updateImgLogById(Integer person_id,Integer id) {
		if(dao.updateImgLogById(person_id,id)>0)
			return 1;
		else
			return 0;
	}

	@Override
	public Integer updateAldumById(Integer person_id,Integer id) {
		if(dao.updateAldumById(person_id,id)>0)
			return 1;
		else
			return 0;
	}

	@Override
	public Integer updateImgLogCmtById(Integer id) {
		dao.updateImgLogCmtById(id);
		return 1;
	}

	@Override
	public Integer updatePictureById(Integer id) {

		dao.updatePictureById(id);
		return 1;
	}

	@Override
	public Integer updateFriendById(Integer pid,Integer fid) {
		if(dao.updateFriendById(pid,fid)>0)
			return 1;
		else 
			return 0;
	}

	@Override
	public Integer updatePersonInfoById(Integer id, String name, String pwd,
			String sex, String birthday, String signature) {
		if(dao.updatePersonInfoById(id, name, pwd, sex, birthday, signature)>0)
			return 1;
		else
			return 0;
	}

	@Override
	public Integer addPersonInfo(Integer id, Integer space, String name,
			String pwd, String sex, String birthday, String signature) {
		if(dao.addPersonInfo(id, space, name, pwd, sex, birthday, signature)>0)
			return 1;
		else
			return 0;
	}

	

}
