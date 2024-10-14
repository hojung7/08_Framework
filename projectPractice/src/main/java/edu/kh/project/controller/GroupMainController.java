package edu.kh.project.controller;

import org.springframework.stereotype.Controller;

import edu.kh.project.service.GroupMainService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class GroupMainController {

	private GroupMainService service;
}
