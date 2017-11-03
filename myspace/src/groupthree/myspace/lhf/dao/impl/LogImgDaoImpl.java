/**
 * 
 */
package groupthree.myspace.lhf.dao.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import groupthree.myspace.lhf.bean.LHFLogImg;
import groupthree.myspace.lhf.dao.BaseDao;
import groupthree.myspace.lhf.dao.LogImgDao;
import groupthree.myspace.lhf.mapper.LogImgMapper;

/**
 * @author �޻��
 *
 */
@Repository(value = "LogImgDaoImpl")
public class LogImgDaoImpl extends BaseDao implements LogImgDao {

	@Override
	//��ѯ˵˵ͼƬ
	public List<LHFLogImg> getLogImgs(){
		return getMapper(LogImgMapper.class).getLogImgs();
	}
	
	@Override
	//д˵˵ʱ��˵˵������ͼƬ
	public int addLogImg(Integer id, Integer imglog_id, String logimg) {
		return getMapper(LogImgMapper.class).addLogImg(id, imglog_id, logimg);
	}

	@Override
	//д˵˵ʱ���Ӵ�ͼƬ����ɾ���������ӣ�Ҳ����ͨ��˵˵���ɾ���Լ�ȻΪ��Ҫ��ͼƬ
	public int deleteLogImg(Integer id, Integer imglog_id) {
		return getMapper(LogImgMapper.class).deleteLogImg(id, imglog_id);
	}
	
}