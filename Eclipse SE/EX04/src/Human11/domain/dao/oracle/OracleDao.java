package Human11.domain.dao.oracle;

import Human11.domain.dao.Userinfo;
import Human11.domain.dao.UserinfoDao;

public class OracleDao implements UserinfoDao{

	@Override
	public void insertInfo(Userinfo userinfo) {
		System.out.printf("insert Oracle ID(%s),PW(%s),NAME(%s) \n",userinfo.getUserId(),userinfo.getUserPassword(),userinfo.getUserName());
	}

	@Override
	public void deleteInfo(Userinfo userinfo) {
		System.out.printf("delete Oracle ID(%s),PW(%s),NAME(%s) \n",userinfo.getUserId(),userinfo.getUserPassword(),userinfo.getUserName());
		
	}

	@Override
	public void searchInfo(Userinfo userinfo) {
		System.out.printf("select Oracle ID(%s),PW(%s),NAME(%s) \n",userinfo.getUserId(),userinfo.getUserPassword(),userinfo.getUserName());
		
	}


}
