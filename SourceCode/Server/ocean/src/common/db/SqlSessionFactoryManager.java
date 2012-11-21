package common.db;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryManager {
		private static SqlSessionFactoryManager sqlManager;
		private static SqlSession ss;
		private static SqlSessionFactory factory;
		private static long delay;
		private SqlSessionFactoryManager(){
			LogFactory.useLog4JLogging();
			
			Reader r=null;
			try {
				r = Resources.getResourceAsReader("config/config.xml");
			} catch (IOException e) {
				System.out.println("error Reading MyBatis configuration File");
				e.printStackTrace();
			}
			SqlSessionFactoryBuilder ssfb=new SqlSessionFactoryBuilder();
			factory=ssfb.build(r);
			
		}
		public static SqlSession getSession(){
			delay = System.currentTimeMillis();
			if(sqlManager==null){
				sqlManager=new SqlSessionFactoryManager();
			}
			ss=factory.openSession();
			return ss;
		}
		public static void Delay(String type){
			delay = System.currentTimeMillis()-delay;
			System.out.println(type+" Delay : "+delay);
		}
		public void getData(){
			/* DB 누수 확인용 select * from v$session에서 확인
			while(true){
			SqlSession session= MyBatisFactory.getSession();
			session.close();
			session=null;
			}
			
			SqlSession session= SqlSessionFactoryManager.getSession();
			List<MemberDTO> mList=session.selectList("selectTable");
			session.close();
			
			session= SqlSessionFactoryManager.getSession();
			session.insert("insertMember",m);
			session.commit();
			session.close();
			*/
		}

}
