package com.co.kr.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

@Component
public class Pagination {
	
	public static Map<String,Object> pagination(int totalcount, HttpServletRequest request) {
		Map<String,Object> map = new HashMap<String,Object>();
		
		String pnum = request.getParameter("page");
		System.out.println("pnum"+pnum);
		if (pnum == null) { pnum = "1"; }
		
		
		int rowNUM = Integer.parseInt(pnum);
		if(rowNUM < 0) {rowNUM = 1;}
		
		
		int pageNum;
		if (totalcount % 10 == 0) { 
			pageNum = totalcount / 10; 
		}else { 
			pageNum = (totalcount / 10) + 1; 
		}
		if(rowNUM > pageNum) { rowNUM = pageNum; }
		
		int temp = (rowNUM - 1) % 10; 
		int startpage = rowNUM - temp; 
		int endpage = startpage + (10-1); 
	
		
		if (endpage > pageNum) { endpage = pageNum; } 
		
		
		int offset = (rowNUM - 1) * 10;
	
		map.put("rowNUM", rowNUM);
		map.put("pageNum", pageNum);
		map.put("startpage", startpage);
		map.put("endpage", endpage);
		map.put("offset", offset);

		return map;
	}

}
