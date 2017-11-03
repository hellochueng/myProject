/**
 * 
 */
package groupthree.myspace.lhf.bean;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

/**
 * @author �޻��
 * @see ˵˵ͼƬ��
 */

@Component
@Alias("lhfli")
public class LHFLogImg {
	//˵˵ͼƬ����id
	private Integer id;
	//�������˵˵����
	private Integer imglog_id;
	//˵˵ͼƬ·��
	private String logimg;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getImglog_id() {
		return imglog_id;
	}
	public void setImglog_id(Integer imglog_id) {
		this.imglog_id = imglog_id;
	}
	public String getLogimg() {
		return logimg;
	}
	public void setLogimg(String logimg) {
		this.logimg = logimg;
	}
	@Override
	public String toString() {
		return "LogImg [id=" + id + ", imglog_id=" + imglog_id + ", logimg="
				+ logimg + "]";
	}
	public LHFLogImg(Integer id, Integer imglog_id, String logimg) {
		super();
		this.id = id;
		this.imglog_id = imglog_id;
		this.logimg = logimg;
	}
	public LHFLogImg() {
		super();
	}
}
