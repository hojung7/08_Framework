package edu.kh.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.kh.todolist.service.GroupMainService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class GroupMainController {
 
	private GroupMainService service;
	
	@RequestMapping("/")
	public String groupMain() {
		return "groupMain/group";
	}
	
}
