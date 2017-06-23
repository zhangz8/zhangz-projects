package com.baobaotao.advice;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ForumService {
	public void removeForum(int forumId) {
		// do sth...
		throw new RuntimeException("运行异常。");
	}

	public void updateForum(Forum forum) throws Exception {
		// do sth...
		throw new SQLException("数据更新操作异常。");

	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		
		List<String> l = new ArrayList<String>();
		l.add("a");
		l.add("d");
//		l.add("c");
		
		list.retainAll(l);
	}
}
