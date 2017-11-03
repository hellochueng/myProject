package groupthree.myspace.lhf.tools;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.google.gson.Gson;

public class  DBTools{
	private static SqlSessionFactory sqlSessionFactory;
	private static final String resource ="spring.xml";
	private static ThreadLocal<SqlSession> tl=new ThreadLocal<SqlSession>();
	
	static{
		try {
			InputStream inputStream= Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//SqlSession不能使用单例,sqlSessionFactory可以使用单例
	public static SqlSession getSqlSession(){
		SqlSession sqlSession=tl.get();
		if(sqlSession==null){
			sqlSession=sqlSessionFactory.openSession();
			tl.set(sqlSession);
		}
		return sqlSession;
	}
	
	public static void closeSqlSession(){
		SqlSession sqlSession=tl.get();
		if (sqlSession !=null) {
			tl.set(null);
			sqlSession.close();
		}
	}
	
	public static void commit(){
		SqlSession sqlSession=tl.get();
		if (sqlSession !=null) {
			tl.set(null);
			sqlSession.commit();
		}
	}
	
	public static void rollBack(){
		SqlSession sqlSession=tl.get();
		if (sqlSession !=null) {
			tl.set(null);
			sqlSession.rollback();
		}
	}
}
