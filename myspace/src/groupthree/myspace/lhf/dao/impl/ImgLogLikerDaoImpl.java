/**
 * 
 */
package groupthree.myspace.lhf.dao.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import groupthree.myspace.lhf.bean.LHFImgLogLiker;
import groupthree.myspace.lhf.dao.BaseDao;
import groupthree.myspace.lhf.dao.ImgLogLikerDao;
import groupthree.myspace.lhf.mapper.ImgLogLikerMapper;

/**
 * @author �޻��
 *
 */
@Repository(value = "ImgLogLikerDaoImpl")
//@Repository
public class ImgLogLikerDaoImpl extends BaseDao implements ImgLogLikerDao {

	@Override
	//��ѯ����is_deleteΪ0������δɾ�������е���
	public List<LHFImgLogLiker> getImgLogLikers(Integer is_delete) {
		return getMapper(ImgLogLikerMapper.class).getImgLogLikers(is_delete);
	}

	@Override
	// �Ժ���˵˵���е���
	public int addImgLogLiker(LHFImgLogLiker imglogliker) {
		return getMapper(ImgLogLikerMapper.class).addImgLogLiker(imglogliker);
	}

	@Override
	//ɾ�����Ѷ�˵˵���ޣ����޸�is_delete�ֶ�Ϊ��0��ʱ��������ɾ������ʱ�û����ɼ�
	public int deleteImgLogLiker(Integer is_delete, Integer id) {
		return getMapper(ImgLogLikerMapper.class).deleteImgLogLiker(is_delete, id);
	}

}