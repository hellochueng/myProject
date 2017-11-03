
package groupthree.myspace.lhf.bean;

import java.util.List;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

/**
 * @author 罗会峰
 * @see 说说表
 */

@Alias("lhfil")
public class LHFImgLog {
	private Integer id;
	//外键关联用户主键
	private Integer person_id;
	//说说内容
	private String imglog_content;
	//创建时间
	private String create_time;
	//是否删除 判断是否显示
	private Integer is_delete;
	//权限 0公开 1好友可见 2自己可见
	private Integer permission;
	//说说图片集合 关联说说图片表外键
	private List<LHFLogImg> logimglist;
	//说说评论集合
	private List<LHFImgLogCmt> imgloglcmtlist;
	//说说图片集合 关联说说点赞表外键
	private List<LHFImgLogLiker> imgloglikerlist;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPerson_id() {
		return person_id;
	}
	public void setPerson_id(Integer person_id) {
		this.person_id = person_id;
	}
	public String getImgLog_content() {
		return imglog_content;
	}
	public void setImgLog_content(String imglog_content) {
		this.imglog_content = imglog_content;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public Integer getIs_delete() {
		return is_delete;
	}
	public void setIs_delete(Integer is_delete) {
		this.is_delete = is_delete;
	}
	public Integer getPermission() {
		return permission;
	}
	public void setPermission(Integer permission) {
		this.permission = permission;
	}
	public List<LHFLogImg> getLogimglist() {
		return logimglist;
	}
	public void setLogimglist(List<LHFLogImg> logimglist) {
		this.logimglist = logimglist;
	}
	public List<LHFImgLogCmt> getImgloglcmtlist() {
		return imgloglcmtlist;
	}
	public void setImgloglcmtlist(List<LHFImgLogCmt> imgloglcmtlist) {
		this.imgloglcmtlist = imgloglcmtlist;
	}
	public List<LHFImgLogLiker> getImgloglikerlist() {
		return imgloglikerlist;
	}
	public void setImgloglikerlist(List<LHFImgLogLiker> imgloglikerlist) {
		this.imgloglikerlist = imgloglikerlist;
	}
	@Override
	public String toString() {
		return "ImgLog [id=" + id + ", person_id=" + person_id
				+ ", imglog_content=" + imglog_content + ", create_time="
				+ create_time + ", is_delete=" + is_delete + ", permission="
				+ permission + ", logimglist=" + logimglist
				+ ", imgloglcmtlist=" + imgloglcmtlist + ", imgloglikerlist="
				+ imgloglikerlist + "]";
	}
	public LHFImgLog(Integer id, Integer person_id, String imglog_content,
			String create_time, Integer is_delete, Integer permission,
			List<LHFLogImg> logimglist, List<LHFImgLogCmt> imgloglcmtlist,
			List<LHFImgLogLiker> imgloglikerlist) {
		super();
		this.id = id;
		this.person_id = person_id;
		this.imglog_content = imglog_content;
		this.create_time = create_time;
		this.is_delete = is_delete;
		this.permission = permission;
		this.logimglist = logimglist;
		this.imgloglcmtlist = imgloglcmtlist;
		this.imgloglikerlist = imgloglikerlist;
	}
	
	public LHFImgLog(Integer id, Integer person_id, String imglog_content,
			String create_time, Integer is_delete, Integer permission) {
		super();
		this.id = id;
		this.person_id = person_id;
		this.imglog_content = imglog_content;
		this.create_time = create_time;
		this.is_delete = is_delete;
		this.permission = permission;
	}
	public LHFImgLog() {
		super();
	}
}
