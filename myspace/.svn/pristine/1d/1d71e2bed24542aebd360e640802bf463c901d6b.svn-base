/**
 * 
 */
package groupthree.myspace.lhf.service;

import groupthree.myspace.lhf.bean.LHFImgLog;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author 罗会峰
 *
 */
public interface ImgLogService {
	
		//查询没有删除的的说说
		List<LHFImgLog> getImgLogAll(@Param("is_delete")Integer is_delete);
		
		//查询查看指定人群的没有删除的的说说
		List<LHFImgLog> getImgLog(@Param("is_delete")Integer is_delete,@Param("person_id")Integer person_id);
		
		//写说说
		int addImgLog(LHFImgLog imglog);
		
		//删除说说,其实是修改该表中的is_delete字段使其变为非0数即代表被删除
		int deleteImgLog(@Param("is_delete")Integer is_delete,@Param("id")Integer id);
		
		//修改说说查看权限
		int changePermission(@Param("permission")Integer permission,@Param("id")Integer id);
}
