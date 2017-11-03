package groupthree.myspace.bean;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;
/**
 * 
 * @author lzz
 * 对话实体类
 */

@Component
@Alias("chatlog")
public class chatLog {
	private Integer id;
	//外键关联用户主键
	private Integer sender_id;
	//外键关联用户主键
	private Integer getter_id;
	//聊天内容
	private String content;
	//创建时间
	private String create_time;
	//是否删除
	private Integer is_delete;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public chatLog() {
		super();
	}
	public Integer getSender_id() {
		return sender_id;
	}
	public void setSender_id(Integer sender_id) {
		this.sender_id = sender_id;
	}
	public Integer getGetter_id() {
		return getter_id;
	}
	public void setGetter_id(Integer getter_id) {
		this.getter_id = getter_id;
	}
	public Integer getIs_delete() {
		return is_delete;
	}
	public void setIs_delete(Integer is_delete) {
		this.is_delete = is_delete;
	}
	@Override
	public String toString() {
		return "chatLog [id=" + id + ", sender_id=" + sender_id
				+ ", getter_id=" + getter_id + ", content=" + content
				+ ", create_time=" + create_time + ", is_delete=" + is_delete
				+ "]";
	}
	public chatLog(Integer id, Integer sender_id, Integer getter_id,
			String content, String create_time, Integer is_delete) {
		super();
		this.id = id;
		this.sender_id = sender_id;
		this.getter_id = getter_id;
		this.content = content;
		this.create_time = create_time;
		this.is_delete = is_delete;
	}
}
