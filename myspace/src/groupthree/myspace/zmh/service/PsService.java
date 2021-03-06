package groupthree.myspace.zmh.service;

import groupthree.myspace.bean.aldum;
import groupthree.myspace.bean.friend;
import groupthree.myspace.bean.imgLog;
import groupthree.myspace.bean.person;
import groupthree.myspace.bean.picture;
import groupthree.myspace.zmh.mapper.PsMapper;

import java.util.List;

public interface PsService {
   person login(int space,int pwd);
   
   List<aldum> getAldumAllByPersonId(int id);
   
   List<picture> getPictureByAldumId(int id);
   
   List<imgLog> getImgLogByPersonId(int id);
   
   List <friend> getFriendsByPersonId(int id);
   
   int addPictureInAldum(picture picture);
   
   int addNewAldum(aldum aldum);
   
   int deletePicture(int id);
   
   int updateAldumName(String name, int id);
   
   int deleteAldum(int id,int is_delete);
   
   List<imgLog> getAllImgLogByPersonId(int person_id);
}
