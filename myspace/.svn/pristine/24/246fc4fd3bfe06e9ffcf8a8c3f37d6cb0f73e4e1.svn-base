package groupthree.myspace.zmh.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository(value="zmhBaseDao")
public class BaseDao {
	@Autowired
	SqlSession sqlSession;
		
	protected <T> T getMapper(Class<T> c){
		return sqlSession.getMapper(c);
	}

}
