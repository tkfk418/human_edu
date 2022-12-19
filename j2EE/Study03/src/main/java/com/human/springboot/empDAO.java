package com.human.springboot;



import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface empDAO {
	int getMemberCount(String loginid, String passcode);
	int getidCount(String loginid);
	void insertMember(String one,String two, String three, String four);
}
