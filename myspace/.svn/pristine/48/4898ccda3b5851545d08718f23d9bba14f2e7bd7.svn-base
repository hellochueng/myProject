package groupthree.myspace.bean;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

/**
 * 
 * @author lzz
 * 消息实体类
 */

@Component
@Alias("message")
public class message {
	private Integer id;
	//外键好友id 关联person主键
	private Integer friend_id;
	//消息内容
	private String msg_Content;
	//创建时间
	private String create_time;
	//是否删除
	private Integer is_delete;
	//外键关联用户主键
	private Integer person_id;

	
	public Integer getPerson_id() {
		return person_id;
	}
	public void setPerson_id(Integer person_id) {
		this.person_id = person_id;
	}
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
	public String getMsg_Content() {
		return msg_Content;
	}
	public void setMsg_Content(String msg_Content) {
		this.msg_Content = msg_Content;
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
	public message() {
		super();
	}
	@Override
	public String toString() {
		return "message [id=" + id + ", friend_id=" + friend_id
				+ ", msg_Content=" + msg_Content + ", create_time="
				+ create_time + ", is_delete=" + is_delete + ", person_id="
				+ person_id + "]";
	}
	public message(Integer id, Integer friend_id, String msg_Content,
			String create_time, Integer is_delete, Integer person_id) {
		super();
		this.id = id;
		this.friend_id = friend_id;
		this.msg_Content = msg_Content;
		this.create_time = create_time;
		this.is_delete = is_delete;
		this.person_id = person_id;
	}
}
