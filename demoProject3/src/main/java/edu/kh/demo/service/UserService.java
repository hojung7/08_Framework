package edu.kh.demo.service;

import java.util.List;

import edu.kh.demo.dto.UserDto;

public interface UserService {

	/**사용자 이름 조회
	 * 
	 * @param userNo
	 * @return userName
	 */
	String selectUserName(int userNo);

	/**
	 * 사용자 전체 조회
	 * @return userList
	 */
	List<UserDto> selectAll();

	/* userNo가 일치하는 사용자 조회
	 * 
	 */
	UserDto selectUser(int userNo);

	/** 사용자 정보 수정
	 * @param user
	 * @return result
	 */
	int updateUser(UserDto user);

	/**사용자 삭제
	 * 
	 * @param userNo
	 * @return
	 */
	int deleteUser(int userNo);

	/** 사용자 추가
	 * @param user
	 * @return
	 */
	int insertUser(UserDto user);

}
