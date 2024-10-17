package edu.kh.project.sse.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.project.sse.dto.Notification;
import edu.kh.project.sse.service.SseService;

@Mapper
public interface SseMapper {

	// 알림 삽입
	int insertNotification(Notification notification);

	/** 알림을 받아야하는 회원의 번호 + 안 읽음 알람개수 조회
	 * @param notificationNo
	 * @return map
	 */
	Map<String, Object> selectReceiveMember(int notificationNo);

	/**로그인한 회원의 알림 목록 조회
	 * @param memberNo
	 * @return
	 */
	List<Notification> selectNotificationList(int memberNo);
 
	
}
