package Human11.domain.dao.mysql;

import Human11.domain.dao.Userinfo;
import Human11.domain.dao.UserinfoDao;

public class MySQLDao implements UserinfoDao{

	@Override
	public void insertInfo(Userinfo userinfo) {
		System.out.printf("insert MYSQL ID(%s),PW(%s),NAME(%s) \n",userinfo.getUserId(),userinfo.getUserPassword(),userinfo.getUserName());
	}

	@Override
	public void deleteInfo(Userinfo userinfo) {
		System.out.printf("delete MYSQL ID(%s),PW(%s),NAME(%s) \n",userinfo.getUserId(),userinfo.getUserPassword(),userinfo.getUserName());
		
	}

	@Override
	public void searchInfo(Userinfo userinfo) {
		System.out.printf("select MYSQL ID(%s),PW(%s),NAME(%s) \n",userinfo.getUserId(),userinfo.getUserPassword(),userinfo.getUserName());
		
	}

}
