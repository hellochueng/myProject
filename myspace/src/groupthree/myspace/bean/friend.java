package groupthree.myspace.bean;

import java.util.List;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

/**
 * 
 * @author lzz
 * 好友实体类
 */

@Component
@Alias("friend")
public class friend {
	private Integer id;
	//外键好友的id 对应person主键
	private Integer friend_id;
	//好友备注名
	private String remark;
	//创建时间
	private String create_time;
	//是否删除，判断是否显示
	private Integer is_delete;
	//外键关联用户主键
	private Integer person_id;
	//好友聊天对话集合
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getFriend_id() {
		return friend_id;
	}
	public void setFriend_id(Integer friend_id) {
		this.friend_id = friend_id;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
	public Integer getPerson_id() {
		return person_id;
	}
	public void setPerson_id(Integer person_id) {
		this.person_id = person_id;
	}
	public friend() {
		super();
	}
	@Override
	public String toString() {
		return "friend [id=" + id + ", friend_id=" + friend_id + ", remark="
				+ remark + ", create_time=" + create_time + ", is_delete="
				+ is_delete + ", person_id=" + person_id + "]";
	}
	public friend(Integer id, Integer friend_id, String remark,
			String create_time, Integer is_delete, Integer person_id) {
		super();
		this.id = id;
		this.friend_id = friend_id;
		this.remark = remark;
		this.create_time = create_time;
		this.is_delete = is_delete;
		this.person_id = person_id;
	}
}
