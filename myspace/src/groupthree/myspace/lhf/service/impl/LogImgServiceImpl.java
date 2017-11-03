/**
 * 
 */
package groupthree.myspace.lhf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import groupthree.myspace.lhf.bean.LHFLogImg;
import groupthree.myspace.lhf.dao.LogImgDao;
import groupthree.myspace.lhf.service.LogImgService;

/**
 * @author �޻��
 *
 */
@Service
public class LogImgServiceImpl implements LogImgService {

	@Resource(name="LogImgDaoImpl")
	LogImgDao dao;
	
	@Override
	//��ѯ˵˵ͼƬ
	public List<LHFLogImg> getLogImgs() {
		return dao.getLogImgs();
	}

	@Override
	//д˵˵ʱ��˵˵������ͼƬ
	public int addLogImg(Integer id, Integer imglog_id, String logimg) {
		return dao.addLogImg(id, imglog_id, logimg);
	}

	@Override
	//д˵˵ʱ���Ӵ�ͼƬ����ɾ���������ӣ�Ҳ����ͨ��˵˵���ɾ���Լ�ȻΪ��Ҫ��ͼƬ
	public int deleteLogImg(Integer id, Integer imglog_id) {
		return dao.deleteLogImg(id, imglog_id);
	}
	
}