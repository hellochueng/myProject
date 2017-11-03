package groupthree.myspace.zfl.mapper;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		SqlSession sqlSession=context.getBean(SqlSession.class);
		PersonMapper ma=context.getBean(PersonMapper.class);
		System.out.println(ma.selectPerson(1,5));
	}

}
