package groupthree.myspace.hjn.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import groupthree.myspace.bean.person;

@Service
public interface HPersonService {
	
		//ɾ���û�ͨ��Id
		Integer updatePersonById(Integer id);
		
		//ɾ��˵˵ͨ��Id
		Integer updateImgLogById(Integer person_id,Integer id);
		
		//ɾ��˵˵����ͨ��Id
		Integer updateImgLogCmtById(Integer id);
		
		//ɾ�����ͨ��Id
		Integer updateAldumById(Integer person_id,Integer id);
	
		//ɾ����Ƭͨ��Id
		Integer updatePictureById(Integer id);
	
		//ɾ������ͨ��Id
		Integer updateFriendById(Integer pid,Integer fid);
		
		//�����û�����
		Integer updatePersonInfoById(@Param("id")Integer id,@Param("name")String name,@Param("pwd")String pwd
		,@Param("sex")String sex,@Param("birthday")String birthday,@Param("signature")String signature);
		//����û���Ϣ
		Integer addPersonInfo(@Param("id")Integer id,@Param("space")Integer space,@Param("name")String name,@Param("pwd")String pwd
		,@Param("sex")String sex,@Param("birthday")String birthday,@Param("signature")String signature);
}
