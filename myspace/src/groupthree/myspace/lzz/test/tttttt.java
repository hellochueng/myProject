package groupthree.myspace.lzz.test;


import groupthree.myspace.bean.friend;
import groupthree.myspace.bean.imgLogCmt;
import groupthree.myspace.bean.imgLogLiker;
import groupthree.myspace.lzz.mapper.LzzFriend_Mapper;
import groupthree.myspace.lzz.mapper.LzzPerson_Mapper;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class tttttt {
	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("spring.xml");
		SqlSession ss = (SqlSession) a.getBean("sqlSessionTemplate");
		//System.out.println(ss);
//		LzzFriend_Mapper pm = ss.getMapper(LzzFriend_Mapper.class);
		
		//DateFormat format= new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
		//p.set(new DATE().toString());
//		LzzPerson_Mapper pp = ss.getMapper(LzzPerson_Mapper.class);
//		System.out.println(pp.getPersonAll(1));
//		person p = new person();
//		p.setId(593);
//		p.setSpace(1);
//		p.setId(3);
//		p.setName("����");
//		p.setPwd("123456");
//		p.setSex("Ů");
//		p.setImg("sadas");
//		p.setSignature("ddd");
//		p.setBirthday(new Timestamp(date.getTime()).toString());
//		p.setBirthday("1970-01-01");
//		System.out.println(p);
//		System.out.println(pm.personRegister(p));
//		chatLog cl =new chatLog(1,1,2,"�Ҳ����ֻ�","2017-09-14 00:00:00",0);
//		friendApply fa = new friendApply(1,1,null,0,20,0,"���»�");
		
		//[id=0, friend_id=3, create_time=2017-09-13, is_delete=0, imgLog_id=24]
//		imgLogLiker imgLogLiker = new imgLogLiker();
//		imgLogLiker.setId(1);
//		imgLogLiker.setFriend_id(1);
//		imgLogLiker.setImgLog_id(22);
//		imgLogLiker.setIs_delete(0);
//		imgLogLiker.setCreate_time("2017-08-09");
//		imgLogCmt imgLogCmt = new imgLogCmt();
//		imgLogCmt.setCreate_time("2014-08-08");
//		imgLogCmt.setFriend_id(1);
//		imgLogCmt.setImgLog_id(23);
//		imgLogCmt.setComment_content("�������ֻ���˭");

		LzzFriend_Mapper pm = ss.getMapper(LzzFriend_Mapper.class);
		friend friend =new friend();
		friend.setFriend_id(2);
		friend.setPerson_id(3);
		friend.setCreate_time("2017-08-08");
		friend.setRemark("�ֻ�");
		friend.setIs_delete(0);
		System.out.println(pm.beFriend(friend));

	}
}