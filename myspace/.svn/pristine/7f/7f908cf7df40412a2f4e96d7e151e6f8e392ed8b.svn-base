/**
 * 
 */
package groupthree.myspace.lhf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





import groupthree.myspace.lhf.bean.LHFImgLogCmt;
import groupthree.myspace.lhf.dao.ImgLogCmtDao;
import groupthree.myspace.lhf.dao.ImgLogDao;
import groupthree.myspace.lhf.service.ImgLogCmtService;
import groupthree.myspace.lhf.service.ImgLogService;

/**
 * @author 罗会峰
 *
 */
@Service
public class ImgLogCmtServiceImpl implements ImgLogCmtService {
	
	@Resource(name="ImgLogCmtDaoImpl")
	ImgLogCmtDao dao;
	
	@Override
	//查看所有未被删除的说说评论，is_delete默认为0是没有删除即可被用户查看到的
	public List<LHFImgLogCmt> getImgLogCmts(Integer is_delete) {
		return dao.getImgLogCmts(is_delete);
	}

	@Override
	//对好友说说进行评论
	public int addImgLogCmt(LHFImgLogCmt imglogcmt) {
		return dao.addImgLogCmt(imglogcmt);
	}

	@Override
	//删除好友的说说评论，即修改is_delete字段为非0数时即代表被删除此时用户不可见
	public int deleteImgLogCmt(Integer is_delete, Integer id) {
		return dao.deleteImgLogCmt(is_delete, id);
	}

}
