package com.human.springboot;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface empDAO {
	ArrayList<EmpDTO> list();	// 반환값 메소드명 (매개변수들)
	ArrayList<RoomtypeDTO> listRoomType();
	ArrayList<departmentDTO> listdepartment();
	void insertRoomType(String typename);
	void deleteRoomType(int typenum);
	void updateRoomType(String tname, int tnum);
	
	ArrayList<RoominfoDTO> listRoomInfo();
	void insertRoomInfo(String one,int two, int three, int four);
	void deleteRoomInfo(int room_num);
	void updateRoomInfo(int dnum,String aname, int anum, int bnum, int cnum);
}
