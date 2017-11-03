package groupthree.myspace.bean;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

/**
 * 
 * @author lzz
 * 说说点赞实体类
 */
@Component
@Alias("logliker")
public class imgLogLiker {
	private Integer id;
	//外键点赞者id 关联person主键
	private Integer friend_id;
	//点赞创建时间
	private String create_time;
	//点赞是否取消
	private Integer is_delete;
	//外键关联说说主键
	private Integer imgLog_id;
	//点赞者名字
	private String name;
	
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
	public imgLogLiker() {
		super();
	}
	public Integer getFriend_id() {
		return friend_id;
	}
	public void setFriend_id(Integer friend_id) {
		this.friend_id = friend_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "imgLogLiker [id=" + id + ", friend_id=" + friend_id
				+ ", create_time=" + create_time + ", is_delete=" + is_delete
				+ ", imgLog_id=" + imgLog_id + ", name=" + name + "]";
	}
	public imgLogLiker(Integer id, Integer friend_id, String create_time,
			Integer is_delete, Integer imgLog_id, String name) {
		super();
		this.id = id;
		this.friend_id = friend_id;
		this.create_time = create_time;
		this.is_delete = is_delete;
		this.imgLog_id = imgLog_id;
		this.name = name;
	}
}
