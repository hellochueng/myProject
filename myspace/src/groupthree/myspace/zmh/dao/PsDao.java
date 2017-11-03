package groupthree.myspace.zmh.dao;

import groupthree.myspace.bean.aldum;
import groupthree.myspace.bean.friend;
import groupthree.myspace.bean.imgLog;
import groupthree.myspace.bean.person;
import groupthree.myspace.bean.picture;

import java.util.List;

public interface PsDao {
	//����
    person login(int space,int pwd);
    
    //�����û�ID��ѯ�������
    List <aldum> getAldumAllByPersonId(int id);
    
    //�������ID��ѯ������Ƭ
    List <picture> getPictureByAldumId(int id);
    
    //�����û�ID��ѯ����˵˵
    List <imgLog> getImgLogByPersonId(int id);
    
    //�����û�ID��ѯ���к���
    List <friend> getFriendsByPersonId(int id);
    
    //����ͼƬ�����
    int addPictureInAldum(picture picture);
    
    //�½����
    int addNewAldum(aldum aldum);
    
    //ɾ����Ƭ
    int deletePicture(int id);
    
    int updateAldumName(String name, int id);
    
    int deleteAldum(int id,int is_delete);
    
    List<imgLog> getAllImgLogByPersonId(int person_id);
}