package Human11.userinfo.web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import Human11.domain.dao.Userinfo;
import Human11.domain.dao.UserinfoDao;
import Human11.domain.dao.mysql.MySQLDao;
import Human11.domain.dao.oracle.OracleDao;

public class UserinfoClient {

	public static void main(String[] args) throws IOException {
	Userinfo uinfo=new Userinfo("human","12345","KANG");
	//uinfo.setUserPassword("7890");
	
	FileInputStream fis =new FileInputStream("D:\\AI_Class\\J2SE_File\\EX04\\src\\Human11\\userinfo\\web\\conf");
	
	Properties prop = new Properties();
	prop.load(fis);
	
	String dbType = prop.getProperty("DBTYPE");
	//dbType==> "ORACLE" 또는 "MYSQL"
	 
	UserinfoDao userinfoDao;
	if (dbType.equals("ORACLE")) {
		userinfoDao = new OracleDao();
		//userinfoDao(인터페이스 객체)= 뒷부분은 인터페이스를 구현한 클래스.
	}
	else {
		 userinfoDao = new MySQLDao();
	}
	 userinfoDao.insertInfo(uinfo);
	 userinfoDao.searchInfo(uinfo);
	 userinfoDao.deleteInfo(uinfo);
	}

}
