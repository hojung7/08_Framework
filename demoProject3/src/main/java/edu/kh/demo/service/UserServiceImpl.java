package edu.kh.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.kh.demo.dto.UserDto;
import edu.kh.demo.mapper.TestMapper;
//@Service
// - Service 역할(비지니스 로직 처리)임 명시
// - Bean 등록(== Spring이 관리하는 객체 == IOC)

@Service
public class UserServiceImpl implements  UserService {

	/* @Autowired
	 *  - 등록된 Bean 중에서
	 *    자료형이 같은 Bean을 얻어와 필드에 대입
	 *  == DI(의존성 주입)
	 */
	 @Autowired
		private TestMapper mapper;

	 // 사용자 이름 조회
	@Override
	public String selectUserName(int userNo) {
													
		return mapper.selectUserName(userNo);
	}

	// 사용자 전체 조회
	@Override
	public List<UserDto> selectAll() {

		// mapper : 의존성 주입(DI) 받은 TestMapper를 
		//								상속 받아 구현된 클래스로 만들어진 Bean(객체)
		return mapper.selectAll();
	}

	// UserNo가 일치하는 사용자 조회
	@Override
	public UserDto selectUser(int userNo) {
	
		return mapper.selectUser(userNo);
	}

	// 사용자 정보 수정(DML)
	// -> DML 수행하면 트랜잭션 제어 처리
	// @Transactional :
	//  - 해당 메서드 수행 중 RuntimeException 발생 시 rollback 수행
	//  - 예외가 발생하지 않으면 매서드 종료 후 commit 수행
	
	@Transactional
	@Override
	public int updateUser(UserDto user) {
		
		return mapper.updateUser(user);
	}

	// 사용자 삭제
	@Transactional // 예외 발생 시 rollback, 아니면 메서드 종료 시 commit
	@Override
	public int deleteUser(int userNo) {
		
		return mapper.deleteUser(userNo);
	}

	// 사용자 추가
	@Transactional
	@Override
	public int insertUser(UserDto user) {
		
		return mapper.insertUser(user);
	}
		
		
}
