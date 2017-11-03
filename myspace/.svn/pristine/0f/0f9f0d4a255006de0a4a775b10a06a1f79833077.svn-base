package groupthree.myspace.hjn.dao.imp;

import groupthree.myspace.hjn.dao.HBasicDao;
import groupthree.myspace.hjn.dao.HPersonDao;
import groupthree.myspace.hjn.mapper.HPersonMapper;

import org.springframework.stereotype.Repository;


@Repository(value="HPersonDaoImp")
public class HPersonDaoImp extends HBasicDao implements HPersonDao{
	
	@Override
	public Integer updatePersonById(Integer id) {
		return getMapper(HPersonMapper.class).updatePersonById(id);
			
	}

	@Override
	public Integer updateImgLogById(Integer person_id,Integer id) {
		return getMapper(HPersonMapper.class).updateImgLogById(person_id,id);
	
	}

	@Override
	public Integer updateAldumById(Integer person_id,Integer id) {
		return getMapper(HPersonMapper.class).updateAldumById(person_id,id);
		
	}

	@Override
	public Integer updateImgLogCmtById(Integer id) {
		return getMapper(HPersonMapper.class).updateImgLogCmtById(id);
		
	}

	@Override
	public Integer updatePictureById(Integer id) {
		return getMapper(HPersonMapper.class).updatePictureById(id);
		
	}

	@Override
	public Integer updateFriendById(Integer pid,Integer fid) {
		return getMapper(HPersonMapper.class).updateFriendById(pid,fid);
		
	}

	@Override
	public Integer updatePersonInfoById(Integer id, String name, String pwd,
			String sex, String birthday, String signature) {
		return getMapper(HPersonMapper.class).updatePersonInfoById(id, name, pwd, sex, birthday, signature);
	}

	@Override
	public Integer addPersonInfo(Integer id, Integer space, String name,
			String pwd, String sex, String birthday, String signature) {
		return getMapper(HPersonMapper.class).addPersonInfo(id, space, name, pwd, sex, birthday, signature);
	}	
}
