/**
 * 
 */
package groupthree.myspace.lhf.bean;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

/**
 * @author �޻��
 *
 */

@Component
@Alias("lhfilliker")
public class LHFImgLogLiker {
	//˵˵��������id
	private Integer id;
	//�������˵˵����
	private Integer imglog_id;
	//���������id ����friend���� 
	private Integer friend_id;
	//���޴���ʱ��
	private String create_time;
	//�����Ƿ�ȡ��
	private Integer is_delete;
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
	public Integer getFriend_id() {
		return friend_id;
	}
	public void setFriend_id(Integer friend_id) {
		this.friend_id = friend_id;
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
	@Override
	public String toString() {
		return "ImgLogLiker [id=" + id + ", imglog_id=" + imglog_id
				+ ", friend_id=" + friend_id + ", create_time=" + create_time
				+ ", is_delete=" + is_delete + "]";
	}
	public LHFImgLogLiker(Integer id, Integer imglog_id, Integer friend_id,
			String create_time, Integer is_delete) {
		super();
		this.id = id;
		this.imglog_id = imglog_id;
		this.friend_id = friend_id;
		this.create_time = create_time;
		this.is_delete = is_delete;
	}
	public LHFImgLogLiker() {
		super();
	}
}