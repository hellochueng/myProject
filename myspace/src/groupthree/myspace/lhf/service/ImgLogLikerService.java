/**
 * 
 */
package groupthree.myspace.lhf.service;

import groupthree.myspace.lhf.bean.LHFImgLogLiker;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author �޻��
 *
 */
public interface ImgLogLikerService {
	
	//��ѯ����is_deleteΪ0������δɾ�������е���
	List<LHFImgLogLiker> getImgLogLikers(@Param("is_delete")Integer is_delete);
	
	// �Ժ���˵˵���е���
	int addImgLogLiker(LHFImgLogLiker imglogliker);
	
	//ɾ�����Ѷ�˵˵���ޣ����޸�is_delete�ֶ�Ϊ��0��ʱ������ɾ������ʱ�û����ɼ�
	int deleteImgLogLiker(@Param("is_delete")Integer is_delete,@Param("id")Integer id);
}
