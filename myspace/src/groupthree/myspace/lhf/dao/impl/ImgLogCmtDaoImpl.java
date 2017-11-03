/**
 * 
 */
package groupthree.myspace.lhf.dao.impl;

import java.util.List;

import groupthree.myspace.lhf.bean.LHFImgLogCmt;
import groupthree.myspace.lhf.dao.BaseDao;
import groupthree.myspace.lhf.dao.ImgLogCmtDao;
import groupthree.myspace.lhf.mapper.ImgLogCmtMapper;

import org.springframework.stereotype.Repository;


/**
 * @author �޻��
 *
 */
@Repository(value = "ImgLogCmtDaoImpl")
//@Repository
public class ImgLogCmtDaoImpl extends BaseDao implements ImgLogCmtDao {
	
	@Override
	//�鿴����δ��ɾ����˵˵���ۣ�is_deleteĬ��Ϊ0��û��ɾ�����ɱ��û��鿴����
	public List<LHFImgLogCmt> getImgLogCmts(Integer is_delete) {
		return getMapper(ImgLogCmtMapper.class).getImgLogCmts(is_delete);
	}

	@Override
	//�Ժ���˵˵��������
	public int addImgLogCmt(LHFImgLogCmt imglogcmt) {
		return getMapper(ImgLogCmtMapper.class).addImgLogCmt(imglogcmt);
	}

	@Override
	//ɾ�����ѵ�˵˵���ۣ����޸�is_delete�ֶ�Ϊ��0��ʱ��������ɾ����ʱ�û����ɼ�
	public int deleteImgLogCmt(Integer is_delete, Integer id) {
		return getMapper(ImgLogCmtMapper.class).deleteImgLogCmt(is_delete, id);
	}

}