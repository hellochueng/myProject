package groupthree.myspace.zmh.test;


import java.util.List;

import groupthree.myspace.bean.aldum;
import groupthree.myspace.bean.imgLog;
import groupthree.myspace.zmh.mapper.PsMapper;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
   public static void main(String[] args) {
	    ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	    SqlSession sqlSession=context.getBean(SqlSession.class);
		PsMapper mapper=sqlSession.getMapper(PsMapper.class);
//		System.out.println(mapper.login(111222,111));	
//		System.out.println("--------------------------------");
//		System.out.println(mapper.getAldumAllByPersonId(1002));
//		System.out.println("--------------------------------");
//		System.out.println(mapper.getPictureByAldumId(1));
//		System.out.println("--------------------------------");
//		System.out.println(mapper.getImgLogByPersonId(1001));
//		System.out.println("--------------------------------");
	//	System.out.println(mapper.getFriendsByPersonId(1002));
	//	System.out.println(mapper.addPictureInAldum(new picture(8,"tiger",0,"2017-9-8",0,2)));
  
      // System.out.println(mapper.updateAldumName("≈÷ª¢∞Ææ≤œ„",112));
      //   System.out.println(mapper.deleteAldum(8, 1));
		List<imgLog> imglog= mapper.getAllImgLogByPersonId(1001);
		for(imgLog ilog:imglog){
			System.out.println(ilog);
		}
   }
}

