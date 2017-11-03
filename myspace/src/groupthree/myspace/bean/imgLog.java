package groupthree.myspace.bean;

import java.util.List;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;
/**
 * 
 * @author lzz
 * ˵˵ʵ����
 */

@Component
@Alias("imglog")
public class imgLog {
	private Integer id;
	//˵˵����
	private String imgLog_content;
	//����ʱ��
	private String create_time;
	//�Ƿ�ɾ�� �ж��Ƿ���ʾ
	private Integer is_delete;
	//Ȩ�� 0���� 1���ѿɼ� 2�Լ��ɼ�
	private Integer permission;
	//ͼƬ·��
	private String imgSrc;
	//��������û�����
	private Integer person_id;
	//˵˵��ӵ��������
	private String name;
	//˵˵����ͷ��
	private String img;
	//˵˵ͼƬ���� ����˵˵���ޱ����
	private List<imgLogLiker> logLiker_list;
	//˵˵���ۼ���
	private List<imgLogCmt> imgLogCmt_list;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImgLog_content() {
		return imgLog_content;
	}
	public void setImgLog_content(String imgLog_content) {
		this.imgLog_content = imgLog_content;
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
	public List<imgLogLiker> getLogLiker_list() {
		return logLiker_list;
	}
	public void setLogLiker_list(List<imgLogLiker> logLiker_list) {
		this.logLiker_list = logLiker_list;
	}
	public List<imgLogCmt> getImgLogCmt_list() {
		return imgLogCmt_list;
	}
	public void setImgLogCmt_list(List<imgLogCmt> imgLogCmt_list) {
		this.imgLogCmt_list = imgLogCmt_list;
	}
	public imgLog() {
		super();
	}
	public Integer getPerson_id() {
		return person_id;
	}
	public void setPerson_id(Integer person_id) {
		this.person_id = person_id;
	}
	
	public String getImgSrc() {
		return imgSrc;
	}
	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
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
		return "imgLog [id=" + id + ", imgLog_content=" + imgLog_content
				+ ", create_time=" + create_time + ", is_delete=" + is_delete
				+ ", permission=" + permission + ", imgSrc=" + imgSrc
				+ ", person_id=" + person_id + ", name=" + name + ", img="
				+ img + ", logLiker_list=" + logLiker_list
				+ ", imgLogCmt_list=" + imgLogCmt_list + "]";
	}
	public imgLog(Integer id, String imgLog_content, String create_time,
			Integer is_delete, Integer permission, String imgSrc,
			Integer person_id, String name, String img,
			List<imgLogLiker> logLiker_list, List<imgLogCmt> imgLogCmt_list) {
		super();
		this.id = id;
		this.imgLog_content = imgLog_content;
		this.create_time = create_time;
		this.is_delete = is_delete;
		this.permission = permission;
		this.imgSrc = imgSrc;
		this.person_id = person_id;
		this.name = name;
		this.img = img;
		this.logLiker_list = logLiker_list;
		this.imgLogCmt_list = imgLogCmt_list;
	}
	
}