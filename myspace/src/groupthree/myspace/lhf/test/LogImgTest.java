/**
 * 
 */
package groupthree.myspace.lhf.test;

import groupthree.myspace.lhf.mapper.LogImgMapper;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ÂÞ»á·å
 *
 */
public class LogImgTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		SqlSession sqlSession=context.getBean(SqlSession.class);
//		System.out.println(sqlSession);
		LogImgMapper mapper=sqlSession.getMapper(LogImgMapper.class);
//		mapper.addLogImg(4, 1, "");
		mapper.deleteLogImg(4, 1);
		System.out.println(mapper.getLogImgs());
	}

}
