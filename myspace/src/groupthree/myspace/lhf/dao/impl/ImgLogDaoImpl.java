/**
 * 
 */
package groupthree.myspace.lhf.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import groupthree.myspace.lhf.bean.LHFImgLog;
import groupthree.myspace.lhf.dao.BaseDao;
import groupthree.myspace.lhf.dao.ImgLogDao;
import groupthree.myspace.lhf.mapper.ImgLogMapper;
import groupthree.myspace.lhf.tools.DBTools;

/**
 * @author �޻��
 *
 */
@Repository(value = "ImgLogDaoImpl")
//@Repository
public class ImgLogDaoImpl extends BaseDao implements ImgLogDao {
	ImgLogMapper mapper=null;
	@Override
	//��ѯû��ɾ���ĵ�˵˵
	public List<LHFImgLog> getImgLogAll(Integer is_delete) {
		mapper=DBTools.getSqlSession().getMapper(ImgLogMapper.class);
		return getMapper(ImgLogMapper.class).getImgLogAll(is_delete);
	}
	
	//��ѯ�鿴ָ����Ⱥ��û��ɾ���ĵ�˵˵
	@Override
	public List<LHFImgLog> getImgLog(Integer is_delete, Integer person_id) {
		mapper=DBTools.getSqlSession().getMapper(ImgLogMapper.class);
		return getMapper(ImgLogMapper.class).getImgLog(is_delete,person_id);
	}
	
	@Override
	//д˵˵
	public int addImgLog(LHFImgLog imglog) {
		mapper=DBTools.getSqlSession().getMapper(ImgLogMapper.class);
		return getMapper(ImgLogMapper.class).addImgLog(imglog);
	}

	@Override
	//ɾ��˵˵,��ʵ���޸ĸñ��е�is_delete�ֶ�ʹ���Ϊ��0����������ɾ��
	public int deleteImgLog(Integer is_delete, Integer id) {
		mapper=DBTools.getSqlSession().getMapper(ImgLogMapper.class);
		return getMapper(ImgLogMapper.class).deleteImgLog(is_delete, id);
	}

	@Override
	//�޸�˵˵�鿴Ȩ��
	public int changePermission(Integer permission, Integer id) {
		mapper=DBTools.getSqlSession().getMapper(ImgLogMapper.class);
		return getMapper(ImgLogMapper.class).changePermission(permission, id);
	}

	
	
}