package groupthree.myspace.bean;

import java.util.List;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

@Component
@Alias("person")
public class person {
	private Integer id;
	//space号码
	private Integer space;
	//昵称
	private String name;
	//密码
	private String pwd;
	//性别
	private String sex;
	//生日
	private String birthday;
	//头像
	private String img;
	//个性签名
	private String signature;
	//创建时间
	private String create_time;
	//好友集合
	private List<friend> friend_list;
	//好友申请集合
	private List<friendApply> apply_list;
	//说说集合
	private List<imgLog> imgLog_list;
	//消息集合
	private List<message> message_list;
	//相册集合
	private List<aldum> aldum_list;
	
	
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSpace() {
		return space;
	}
	public void setSpace(Integer space) {
		this.space = space;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public List<friend> getFriend_list() {
		return friend_list;
	}
	public void setFriend_list(List<friend> friend_list) {
		this.friend_list = friend_list;
	}
	public List<friendApply> getApply_list() {
		return apply_list;
	}
	public void setApply_list(List<friendApply> apply_list) {
		this.apply_list = apply_list;
	}
	public List<imgLog> getImgLog_list() {
		return imgLog_list;
	}
	public void setImgLog_list(List<imgLog> imgLog_list) {
		this.imgLog_list = imgLog_list;
	}
	public List<message> getMessage_list() {
		return message_list;
	}
	public void setMessage_list(List<message> message_list) {
		this.message_list = message_list;
	}
	public List<aldum> getAldum_list() {
		return aldum_list;
	}
	public void setAldum_list(List<aldum> aldum_list) {
		this.aldum_list = aldum_list;
	}
	public person() {
		super();
	}
	public person(Integer id, Integer space, String name, String pwd,
			String sex, String birthday, String img, String signature,
			String create_time, List<friend> friend_list,
			List<friendApply> apply_list, List<imgLog> imgLog_list,
			List<message> message_list, List<aldum> aldum_list) {
		super();
		this.id = id;
		this.space = space;
		this.name = name;
		this.pwd = pwd;
		this.sex = sex;
		this.birthday = birthday;
		this.img = img;
		this.signature = signature;
		this.create_time = create_time;
		this.friend_list = friend_list;
		this.apply_list = apply_list;
		this.imgLog_list = imgLog_list;
		this.message_list = message_list;
		this.aldum_list = aldum_list;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", space=" + space + ", name=" + name
				+ ", pwd=" + pwd + ", sex=" + sex + ", birthday=" + birthday
				+ ", img=" + img + ", signature=" + signature
				+ ", create_time=" + create_time + ", friend_list="
				+ friend_list + ", apply_list=" + apply_list + ", imgLog_list="
				+ imgLog_list + ", message_list=" + message_list
				+ ", aldum_list=" + aldum_list + "]";
	}
	
}
