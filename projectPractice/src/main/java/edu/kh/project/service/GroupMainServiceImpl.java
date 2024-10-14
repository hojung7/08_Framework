package edu.kh.project.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.kh.project.mapper.GroupMainMapper;

@Transactional
@Service
public class GroupMainServiceImpl implements GroupMainService {

	private GroupMainMapper mapper;
}
