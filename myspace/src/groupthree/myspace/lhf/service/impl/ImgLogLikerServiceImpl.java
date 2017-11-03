/**
 * 
 */
package groupthree.myspace.lhf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import groupthree.myspace.lhf.bean.LHFImgLogLiker;
import groupthree.myspace.lhf.dao.ImgLogLikerDao;
import groupthree.myspace.lhf.service.ImgLogLikerService;

/**
 * @author �޻��
 *
 */
@Service
public class ImgLogLikerServiceImpl implements ImgLogLikerService {

	
	@Resource(name="ImgLogLikerDaoImpl")
	ImgLogLikerDao dao;
	
	@Override
	//��ѯ����is_deleteΪ0������δɾ�������е���
	public List<LHFImgLogLiker> getImgLogLikers(Integer is_delete){
		return dao.getImgLogLikers(is_delete);
	}

	@Override
	// �Ժ���˵˵���е���
	public int addImgLogLiker(LHFImgLogLiker imglogliker) {
		return dao.addImgLogLiker(imglogliker);
	}

	@Override
	//ɾ�����Ѷ�˵˵���ޣ����޸�is_delete�ֶ�Ϊ��0��ʱ��������ɾ������ʱ�û����ɼ�
	public int deleteImgLogLiker(Integer is_delete, Integer id) {
		return dao.deleteImgLogLiker(is_delete, id);
	}

}