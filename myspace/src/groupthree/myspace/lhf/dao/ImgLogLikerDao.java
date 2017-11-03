/**
 * 
 */
package groupthree.myspace.lhf.dao;

import groupthree.myspace.lhf.bean.LHFImgLogLiker;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author 罗会峰
 *
 */
public interface ImgLogLikerDao {
	
	//查询所有is_delete为0即代表未删除的所有点赞
	List<LHFImgLogLiker> getImgLogLikers(@Param("is_delete")Integer is_delete);
	
	// 对好友说说进行点赞
	int addImgLogLiker(LHFImgLogLiker imglogliker);
	
	//删除好友对说说点赞，即修改is_delete字段为非0数时即代表被删除，此时用户不可见
	int deleteImgLogLiker(@Param("is_delete")Integer is_delete,@Param("id")Integer id);
}
