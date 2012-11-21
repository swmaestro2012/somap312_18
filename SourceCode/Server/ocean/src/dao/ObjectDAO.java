package dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import common.db.SqlSessionFactoryManager;
import dto.MemberDTO;
import dto.ObjectDTO;

public class ObjectDAO {
	public static ObjectDTO insertObject(ObjectDTO object) {
		SqlSession session = SqlSessionFactoryManager.getSession();
		int id = session.insert("insertObject", object);
		object.setId(id);
		session.commit();
		session.close();
		SqlSessionFactoryManager.Delay("insertObject");
		return object;
	}
	public static List<ObjectDTO> selectObject(MemberDTO member) {
		SqlSession session = SqlSessionFactoryManager.getSession();
		List<ObjectDTO> list = session.selectList("selectObject", member);
		session.close();
		SqlSessionFactoryManager.Delay("selectObject");
		return list;
	}
	public static int updateMember(ObjectDTO object) {
		SqlSession session = SqlSessionFactoryManager.getSession();
		int number = session.update("updateObject", object);
		session.commit();
		session.close();
		SqlSessionFactoryManager.Delay("updateObject");
		return number;
	}
}
