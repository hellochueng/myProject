/**
 * 
 */
package groupthree.myspace.lhf.mapper;

import groupthree.myspace.lhf.bean.LHFImgLogCmt;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author �޻��
 *
 */
public interface ImgLogCmtMapper {
	
	//�鿴����δ��ɾ����˵˵���ۣ�is_deleteĬ��Ϊ0��û��ɾ�����ɱ��û��鿴����
	List<LHFImgLogCmt> getImgLogCmts(@Param("is_delete")Integer is_delete);
	
	//���ۺ���˵˵��������
	int addImgLogCmt(LHFImgLogCmt imglogcmt);
	
	//ɾ�����ѵ�˵˵���ۣ����޸�is_delete�ֶ�Ϊ��0��ʱ������ɾ����ʱ�û����ɼ�
	int deleteImgLogCmt(@Param("is_delete")Integer is_delete,@Param("id")Integer id);
}
