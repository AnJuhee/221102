package com.jh.mvcboard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.jh.mvcboard.dao.BoardDao;

public class BDeleteCommand implements BCommand {

	@Override
	public void excute(Model model) {
		// TODO Auto-generated method stub
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		//model 객체에서 request 객체를 빼냄
		
		String bid = request.getParameter("bid");
		
		BoardDao dao = new BoardDao();
		dao.delete(bid);

	}

}
