/**
 * 
 */
package groupthree.myspace.lhf.mapper;

import groupthree.myspace.lhf.bean.LHFImgLogCmt;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author 罗会峰
 *
 */
public interface ImgLogCmtMapper {
	
	//查看所有未被删除的说说评论，is_delete默认为0是没有删除即可被用户查看到的
	List<LHFImgLogCmt> getImgLogCmts(@Param("is_delete")Integer is_delete);
	
	//评论好友说说进行评论
	int addImgLogCmt(LHFImgLogCmt imglogcmt);
	
	//删除好友的说说评论，即修改is_delete字段为非0数时即代表被删除此时用户不可见
	int deleteImgLogCmt(@Param("is_delete")Integer is_delete,@Param("id")Integer id);
}
