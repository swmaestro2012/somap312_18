package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.db.SqlSessionFactoryManager;

import dto.FishDTO;
import dto.MemberDTO;

public class FishDAO {
	public static FishDTO insertEgg(FishDTO fish) {
		SqlSession session = SqlSessionFactoryManager.getSession();
		int id = session.insert("insertFish", fish);
		session.commit();
		session.close();
		fish.setId(id);
		SqlSessionFactoryManager.Delay("insertFish");
		return fish;
	}
	public static List<FishDTO> selectEgg(MemberDTO member) {
		SqlSession session = SqlSessionFactoryManager.getSession();
		List<FishDTO> list = session.selectList("selectFish", member);
		session.close();
		SqlSessionFactoryManager.Delay("selectFish");
		return list;
	}
	public static int updateEgg(FishDTO egg) {
		SqlSession session = SqlSessionFactoryManager.getSession();
		int number = session.update("updateFish", egg);
		session.commit();
		session.close();
		SqlSessionFactoryManager.Delay("updateFish");
		return number;
	}
}
