package dao;

import org.apache.ibatis.session.SqlSession;

import common.db.SqlSessionFactoryManager;

import dto.MemberDTO;

public class MemberDAO {
	public static MemberDTO insertMember(MemberDTO member) {
		SqlSession session = SqlSessionFactoryManager.getSession();
		session.insert("insertMember", member);
		session.commit();
		member = session.selectOne("selectMember",member);
		session.close();
		SqlSessionFactoryManager.Delay("insertMember");
		return member;
	}
	public static MemberDTO selectMember(MemberDTO member) {
		SqlSession session = SqlSessionFactoryManager.getSession();
		member = session.selectOne("selectMember", member);
		session.close();
		SqlSessionFactoryManager.Delay("selectMember");
		return member;
	}
	public static int updateMember(MemberDTO member) {
		SqlSession session = SqlSessionFactoryManager.getSession();
		int number = session.update("updateMember", member);
		session.commit();
		session.close();
		SqlSessionFactoryManager.Delay("updateMember");
		return number;
	}
}
