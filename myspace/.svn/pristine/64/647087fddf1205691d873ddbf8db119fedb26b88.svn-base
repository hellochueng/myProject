package groupthree.myspace.hjn.mapper;

import groupthree.myspace.bean.person;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface HPersonMapper {
	//显示用户通过id
	Integer updatePersonById(@Param("id")Integer id);
	
	//不显示说说
	Integer updateImgLogById(@Param("person_id")Integer person_id,@Param("id")Integer id);
	
	//不显示说说评论
	Integer updateImgLogCmtById(@Param("id")Integer id);
	
	//不显示相册
	Integer updateAldumById(@Param("person_id")Integer person_id,@Param("id")Integer id);
	
	//不显示相片
	Integer updatePictureById(@Param("id")Integer id);
	
	//不显示好友
	Integer updateFriendById(@Param("pid")Integer pid,@Param("fid")Integer fid);
	
	//更改用户属性
	Integer updatePersonInfoById(@Param("id")Integer id,@Param("name")String name,@Param("pwd")String pwd
			,@Param("sex")String sex,@Param("birthday")String birthday,@Param("signature")String signature);
	//添加用户信息
	Integer addPersonInfo(@Param("id")Integer id,@Param("space")Integer space,@Param("name")String name,@Param("pwd")String pwd
			,@Param("sex")String sex,@Param("birthday")String birthday,@Param("signature")String signature);
	
}
