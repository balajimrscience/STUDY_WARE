package com.course.Mr_Science.Service;

import java.util.List;

import com.course.Mr_Science.Model.Test;

public interface FilterService {
	
	public List<Test> filterTest (int code,List<Test> fullList);

}
