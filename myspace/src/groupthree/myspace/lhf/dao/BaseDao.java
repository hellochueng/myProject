
package groupthree.myspace.lhf.dao;
import groupthree.myspace.lhf.tools.DBTools;

/**
 * @author �޻��
 *
 */
public class BaseDao {
	protected <T> T getMapper(Class<T> c){
		return DBTools.getSqlSession().getMapper(c);
	}
}
