package com.human.springboot;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface postDAO {

	void insertpost(String title, String content, String userid);
	ArrayList<postDTO> postlist();
	getDTO getpost(int post_id);
	void deletepost(int a);
	void updatepost(int a,String c,String d);
}
