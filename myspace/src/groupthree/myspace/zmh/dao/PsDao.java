package groupthree.myspace.zmh.dao;

import groupthree.myspace.bean.aldum;
import groupthree.myspace.bean.friend;
import groupthree.myspace.bean.imgLog;
import groupthree.myspace.bean.person;
import groupthree.myspace.bean.picture;

import java.util.List;

public interface PsDao {
	//登入
    person login(int space,int pwd);
    
    //根据用户ID查询所有相册
    List <aldum> getAldumAllByPersonId(int id);
    
    //根据相册ID查询所有相片
    List <picture> getPictureByAldumId(int id);
    
    //根据用户ID查询所有说说
    List <imgLog> getImgLogByPersonId(int id);
    
    //根据用户ID查询所有好友
    List <friend> getFriendsByPersonId(int id);
    
    //添加图片到相册
    int addPictureInAldum(picture picture);
    
    //新建相册
    int addNewAldum(aldum aldum);
    
    //删除照片
    int deletePicture(int id);
    
    int updateAldumName(String name, int id);
    
    int deleteAldum(int id,int is_delete);
    
    List<imgLog> getAllImgLogByPersonId(int person_id);
}
