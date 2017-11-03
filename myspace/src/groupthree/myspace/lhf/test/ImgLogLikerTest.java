/**
 * 
 */
package groupthree.myspace.lhf.test;

import groupthree.myspace.lhf.bean.LHFImgLogLiker;
import groupthree.myspace.lhf.mapper.ImgLogLikerMapper;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ÂÞ»á·å
 *
 */
public class ImgLogLikerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now=new Date();
		String time = df.format(now);
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		SqlSession sqlSession=context.getBean(SqlSession.class);
//		System.out.println(sqlSession);
		
		ImgLogLikerMapper mapper=sqlSession.getMapper(ImgLogLikerMapper.class);
//		mapper.addImgLogLiker(new ImgLogLiker(3, 1, 3, time, 0));
		mapper.deleteImgLogLiker(1, 3);
		System.out.println(mapper.getImgLogLikers(0));
	}

}
