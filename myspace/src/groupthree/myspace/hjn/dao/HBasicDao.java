package groupthree.myspace.hjn.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class HBasicDao {
	@Autowired
	SqlSession sqlSession;
	
	protected <T>T getMapper(Class<T> c){
		return sqlSession.getMapper(c);
	}

}
