package edu.kh.todolist.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import edu.kh.todolist.dto.Todo;

@Mapper // 상속 받은 클래스 생성 후 Bean 등록
public interface TodoListMapper {

	/** 할 일 목록 조회
	 * @return
	 */
	List<Todo> selectTodoList();

	/** 할 일 목록 조회
	 * @return
	 
	List<Todo> selectTodoList();@*/

	/** 완료된 할 일 개수 조회
	 * @return completeCount
	 */
	
	int selectCompleteCount();

	/** 할 일 추가
	 * @param todo
	 * @return result
	 */
	int todoAdd(Todo todo);

	/** 할 일 상세 조회
	 * @param todoNo
	 * @return todo
	 */
	Todo todoDetail(int todoNo);

	/** 완료 여부 변경
	 * @param todoNo
	 * @return
	 */
	int todoComplete(int todoNo);



	/**수정
	 * @param title
	 * @param detail
	 * @param no
	 * @return
	 */
//	int todoUpdate(@Param("todoTitle") String title,@Param("todoDetail")  String detail, @Param("todoNo") String no);

	int todoUpdate(Todo todo);

	/**삭제
	 * @param todoNo
	 * @return
	 */
	int todoDelete(int todoNo);
	

	String searchTitle(int todoNo);

	/**전체 할 일 개수 조회
	 * @return
	 */
	int getTotalCount();

}
