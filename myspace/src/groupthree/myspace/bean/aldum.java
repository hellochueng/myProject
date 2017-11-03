package groupthree.myspace.bean;

import java.util.List;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

/**
 * 
 * @author lzz
 * ���ʵ����
 */

@Component
@Alias("aldum")
public class aldum {
	private Integer id;
	//����ʱ��
	private String create_time;
	//�Ƿ�ɾ�����ж��Ƿ���ʾ
	private Integer is_delete;
	//Ȩ�ޣ�0���� 1���ѿɼ�2�Լ��ɼ�
	private Integer permission;
	//�������
	private String aldumName;
	//��������û�����
	private Integer person_id;
	
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
	public Integer getPermission() {
		return permission;
	}
	public void setPermission(Integer permission) {
		this.permission = permission;
	}
	public aldum() {
		super();
	}
	public Integer getPerson_id() {
		return person_id;
	}
	public void setPerson_id(Integer person_id) {
		this.person_id = person_id;
	}
	@Override
	public String toString() {
		return "aldum [id=" + id + ", create_time=" + create_time
				+ ", is_delete=" + is_delete + ", permission=" + permission
				+ ", aldumName=" + aldumName + ", person_id=" + person_id + "]";
	}
	public String getAldumName() {
		return aldumName;
	}
	public void setAldumName(String aldumName) {
		this.aldumName = aldumName;
	}
	public aldum(Integer id, String create_time, Integer is_delete,
			Integer permission, String aldumName, Integer person_id) {
		super();
		this.id = id;
		this.create_time = create_time;
		this.is_delete = is_delete;
		this.permission = permission;
		this.aldumName = aldumName;
		this.person_id = person_id;
	}
	
}