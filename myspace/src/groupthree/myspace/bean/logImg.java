package groupthree.myspace.bean;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

/**
 * 
 * @author lzz
 * 说说图片实体类
 */
@Component
@Alias("logimg")
public class logImg {
	private Integer id;
	//说说图片路径
	private String logImg;
	//外键关联说说主键
	private Integer imgLog_id;
	
	
	public Integer getImgLog_id() {
		return imgLog_id;
	}
	public void setImgLog_id(Integer imgLog_id) {
		this.imgLog_id = imgLog_id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogImg() {
		return logImg;
	}
	public void setLogImg(String logImg) {
		this.logImg = logImg;
	}
	public logImg() {
		super();
	}
	@Override
	public String toString() {
		return "logImg [id=" + id + ", logImg=" + logImg + ", imgLog_id="
				+ imgLog_id + "]";
	}
	public logImg(Integer id, String logImg, Integer imgLog_id) {
		super();
		this.id = id;
		this.logImg = logImg;
		this.imgLog_id = imgLog_id;
	}
}
