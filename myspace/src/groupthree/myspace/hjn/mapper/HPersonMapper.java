package groupthree.myspace.hjn.mapper;

import groupthree.myspace.bean.person;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface HPersonMapper {
	//��ʾ�û�ͨ��id
	Integer updatePersonById(@Param("id")Integer id);
	
	//����ʾ˵˵
	Integer updateImgLogById(@Param("person_id")Integer person_id,@Param("id")Integer id);
	
	//����ʾ˵˵����
	Integer updateImgLogCmtById(@Param("id")Integer id);
	
	//����ʾ���
	Integer updateAldumById(@Param("person_id")Integer person_id,@Param("id")Integer id);
	
	//����ʾ��Ƭ
	Integer updatePictureById(@Param("id")Integer id);
	
	//����ʾ����
	Integer updateFriendById(@Param("pid")Integer pid,@Param("fid")Integer fid);
	
	//�����û�����
	Integer updatePersonInfoById(@Param("id")Integer id,@Param("name")String name,@Param("pwd")String pwd
			,@Param("sex")String sex,@Param("birthday")String birthday,@Param("signature")String signature);
	//����û���Ϣ
	Integer addPersonInfo(@Param("id")Integer id,@Param("space")Integer space,@Param("name")String name,@Param("pwd")String pwd
			,@Param("sex")String sex,@Param("birthday")String birthday,@Param("signature")String signature);
	
}
