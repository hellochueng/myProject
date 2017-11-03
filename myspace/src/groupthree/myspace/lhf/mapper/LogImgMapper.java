/**
 * 
 */
package groupthree.myspace.lhf.mapper;

import groupthree.myspace.lhf.bean.LHFLogImg;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author �޻��
 *
 */
public interface LogImgMapper {
	
	//��ѯ˵˵ͼƬ
	List<LHFLogImg> getLogImgs();
	
	//д˵˵ʱ��˵˵�����ͼƬ
	int addLogImg(@Param("id")Integer id,@Param("imglog_id")Integer imglog_id,@Param("logimg")String logimg);
	
	//д˵˵ʱ��Ӵ�ͼƬ����ɾ��������ӣ�Ҳ����ͨ��˵˵���ɾ���Լ�ȻΪ��Ҫ��ͼƬ
	int deleteLogImg(@Param("id")Integer id,@Param("imglog_id")Integer imglog_id);
}
