package edu.kh.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.kh.todolist.service.GroupMainService;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Controller
public class GroupMainController {
 
	private GroupMainService service;
	
}
