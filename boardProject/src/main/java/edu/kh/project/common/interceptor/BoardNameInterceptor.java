package edu.kh.project.common.interceptor;

import java.util.List;
import java.util.Map;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardNameInterceptor implements HandlerInterceptor {
	
	// BoardNameInterceptor는 class이므로 혼자서 코드를 수행할 수 X 
	// -> 객체를 만들어서 사용해야 함으로 config에 Bean 등록
	
	// 후처리
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		/* 게시판 관련된 요청/응답을 가로채서
		 * 현재 어떤 게시판을 조회/삽입/수정하려는지 알 수 있게
		 * 게시판 이름 끼워 넣기
		 * 	 */
		
		// 1) application scope에서 "boardTypeList" 얻어오기
		ServletContext application = request.getServletContext();
		
		List<Map<String, String>> boardTypeList
		= (List<Map<String,String>>) application.getAttribute("boardTypeList");
		
		// 2) "/board", "/editBoard"로 시작하는 요청 중
		//    {boardCode} 부분인 2번째 코드 값 얻어오기
		
		// URL : http://localhost/editBoard/1/insert
		
		// Uniform Resource Identifier(URI) : 통합 자원 식별자
		// - 자원 이름(주소)만 봐도 무엇인지 구별할 수 있는 문자열
		// ex)  /editBoard/1/insert
		
		String uri = request.getRequestURI();
		
		try {
			 // "" | editBoard | 1 | insert -> 이렇게 쪼개짐
			 // (0)    (1)      (2)   (3)
				String code = uri.split("/")[2]; // boardCode만 잘라내기 
				
				// boardTypeList에서 boardCode가 같은 경우의 boardName 찾기
				for(Map<String, String> boardType :boardTypeList) {
					String boardCode = String.valueOf( boardType.get("boardCode") );
							
							if(boardCode.equals(code)) { // 같은 경우
								
								// request scope에 boardName 세팅
								request.setAttribute("boardName", boardType.get("boardName"));
								break;
								
							}
				}
			
		}catch (Exception e) {
		}
		
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

}
