package com.human.springboot;



import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface memberDAO {
	int getMemberCount(String loginid, String passcode);
	int checkDup(String loginid);
	void insertMember(String one,String two, String three, String four);
	
}
