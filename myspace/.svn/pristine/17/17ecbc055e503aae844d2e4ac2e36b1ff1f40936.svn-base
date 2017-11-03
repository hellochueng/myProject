/**
 * 
 */
package groupthree.myspace.lhf.mapper;

import groupthree.myspace.lhf.bean.LHFLogImg;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author 罗会峰
 *
 */
public interface LogImgMapper {
	
	//查询说说图片
	List<LHFLogImg> getLogImgs();
	
	//写说说时往说说中添加图片
	int addLogImg(@Param("id")Integer id,@Param("imglog_id")Integer imglog_id,@Param("logimg")String logimg);
	
	//写说说时添加错图片可以删除重新添加，也可以通过说说相册删除自己然为不要的图片
	int deleteLogImg(@Param("id")Integer id,@Param("imglog_id")Integer imglog_id);
}
