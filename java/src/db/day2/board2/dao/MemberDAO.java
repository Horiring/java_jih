package db.day2.board2.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import db.day2.board2.vo.MemberVO;

public interface MemberDAO {

	void insertMember(@Param("id")String id, @Param("pw")String pw);

	MemberVO getMember(String id);

	void deleteMember(String id);

	ArrayList<MemberVO> selectMemberList();

}
