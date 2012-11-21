package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.db.SqlSessionFactoryManager;

import dto.EggDTO;
import dto.MemberDTO;

public class EggDAO {
	public static EggDTO insertEgg(EggDTO egg) {
		SqlSession session = SqlSessionFactoryManager.getSession();
		int id = session.insert("insertEgg", egg);
		session.commit();
		session.close();
		egg.setId(id);
		SqlSessionFactoryManager.Delay("insertEgg");
		return egg;
	}
	public static List<EggDTO> selectEgg(MemberDTO member) {
		SqlSession session = SqlSessionFactoryManager.getSession();
		List<EggDTO> list = session.selectList("selectEgg", member);
		session.close();
		SqlSessionFactoryManager.Delay("selectEgg");
		return list;
	}
	public static int updateEgg(EggDTO egg) {
		SqlSession session = SqlSessionFactoryManager.getSession();
		int number = session.update("updateEgg", egg);
		session.commit();
		session.close();
		SqlSessionFactoryManager.Delay("updateEgg");
		return number;
	}
}
