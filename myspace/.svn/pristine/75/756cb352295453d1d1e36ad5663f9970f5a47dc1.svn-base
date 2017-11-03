package groupthree.myspace.hjn.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import groupthree.myspace.bean.person;

@Service
public interface HPersonService {
	
		//删除用户通过Id
		Integer updatePersonById(Integer id);
		
		//删除说说通过Id
		Integer updateImgLogById(Integer person_id,Integer id);
		
		//删除说说评论通过Id
		Integer updateImgLogCmtById(Integer id);
		
		//删除相册通过Id
		Integer updateAldumById(Integer person_id,Integer id);
	
		//删除相片通过Id
		Integer updatePictureById(Integer id);
	
		//删除好友通过Id
		Integer updateFriendById(Integer pid,Integer fid);
		
		//更改用户属性
		Integer updatePersonInfoById(@Param("id")Integer id,@Param("name")String name,@Param("pwd")String pwd
		,@Param("sex")String sex,@Param("birthday")String birthday,@Param("signature")String signature);
		//添加用户信息
		Integer addPersonInfo(@Param("id")Integer id,@Param("space")Integer space,@Param("name")String name,@Param("pwd")String pwd
		,@Param("sex")String sex,@Param("birthday")String birthday,@Param("signature")String signature);
}
