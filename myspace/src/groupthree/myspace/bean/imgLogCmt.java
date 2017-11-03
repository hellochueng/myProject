package groupthree.myspace.bean;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

/**
 * 
 * @author lzz
 * ˵˵����ʵ����
 */

@Component
@Alias("imglogcmt")
public class imgLogCmt {
	private Integer id;
	//���������id ����person���� 
	private Integer friend_id;
	//��������
	private String comment_content;
	//����ʱ��
	private String create_time;
	//�Ƿ�ɾ�� �ж��Ƿ���ʾ 0Ϊ�� 1Ϊ��
	private Integer is_delete;
	//�������˵˵����
	private Integer imgLog_id;
	//������name
	private String name;
	//������ͷ��
	private String img;
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
	public String getComment_content() {
		return comment_content;
	}
	public void setComment_content(String comment_content) {
		this.comment_content = comment_content;
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
	public Integer getImgLog_id() {
		return imgLog_id;
	}
	public void setImgLog_id(Integer imgLog_id) {
		this.imgLog_id = imgLog_id;
	}
	public imgLogCmt() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "imgLogCmt [id=" + id + ", friend_id=" + friend_id
				+ ", comment_content=" + comment_content + ", create_time="
				+ create_time + ", is_delete=" + is_delete + ", imgLog_id="
				+ imgLog_id + ", name=" + name + ", img=" + img + "]";
	}
	public imgLogCmt(Integer id, Integer friend_id, String comment_content,
			String create_time, Integer is_delete, Integer imgLog_id,
			String name, String img) {
		super();
		this.id = id;
		this.friend_id = friend_id;
		this.comment_content = comment_content;
		this.create_time = create_time;
		this.is_delete = is_delete;
		this.imgLog_id = imgLog_id;
		this.name = name;
		this.img = img;
	}
	
}