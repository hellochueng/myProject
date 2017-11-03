package groupthree.myspace.lzz.dao.daoImpl;

import groupthree.myspace.lhf.tools.DBTools;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value="LzzBaseDao")
public class LzzBaseDao {
	@Autowired
	SqlSession sqlss;
	protected <T> T getMapper(Class<T> c){
		return sqlss.getMapper(c);
	}
	
}
