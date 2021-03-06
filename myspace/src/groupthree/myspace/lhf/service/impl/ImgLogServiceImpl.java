/**
 * 
 */
package groupthree.myspace.lhf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import groupthree.myspace.lhf.bean.LHFImgLog;
import groupthree.myspace.lhf.dao.ImgLogDao;
import groupthree.myspace.lhf.service.ImgLogService;

/**
 * @author 罗会峰
 *
 */
@Service
public class ImgLogServiceImpl implements ImgLogService {

	
	@Resource(name="ImgLogDaoImpl")
	ImgLogDao dao;
	
	@Override
	//查询没有删除的的说说
	public List<LHFImgLog> getImgLogAll(Integer is_delete) {
		return dao.getImgLogAll(is_delete);
	}
	
	@Override
	public List<LHFImgLog> getImgLog(Integer is_delete, Integer person_id) {
		return dao.getImgLog(is_delete,person_id);
	}
	
	@Override
	//写说说
	public int addImgLog(LHFImgLog imglog) {
		return dao.addImgLog(imglog);
	}

	@Override
	//删除说说,其实是修改该表中的is_delete字段使其变为非0数即代表被删除
	public int deleteImgLog(Integer is_delete, Integer id) {
		return dao.deleteImgLog(is_delete, id);
	}

	@Override
	//修改说说查看权限
	public int changePermission(Integer permission, Integer id) {
		return dao.changePermission(permission, id);
	}

	

	

}
