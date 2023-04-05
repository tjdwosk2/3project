package com.ict.homepage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ict.homepage.model.service.homepage_Service;
import com.ict.homepage.model.vo.homepage_VO;

@Controller
public class MyController {
	@Autowired
	private homepage_Service homepage_Service;
	
	public void setHomepage_Service(homepage_Service homepage_Service) {
		this.homepage_Service = homepage_Service;
	}

	@RequestMapping("mymain.do")
	public ModelAndView MyMain() {
		ModelAndView mv = new ModelAndView("mymain");
		return mv;
	}
	
	@RequestMapping("manager.mymain.do")
	public ModelAndView MyMain1() {
		ModelAndView mv = new ModelAndView("manager.mymain");
		return mv;
	}
	@RequestMapping("supermanager.mymain.do")
	public ModelAndView MyMain2() {
		ModelAndView mv = new ModelAndView("supermanager.mymain");
		return mv;
	}
	@RequestMapping("login.mymain.do")
	public ModelAndView MyMain3() {
		ModelAndView mv = new ModelAndView("login.mymain");
		return mv;
	}
	
	
	@RequestMapping("homepage.do")
	public ModelAndView HomePage() {
		ModelAndView mv = new ModelAndView("homepage");
		return mv;
		
	}
	/*
	 * @RequestMapping("homepage_ok.do") public ModelAndView HomePageok(homepage_VO
	 * hvo, HttpSession session) { ModelAndView mv = new
	 * ModelAndView("redirect:roomlist.do"); //리스트 로 가야함 return mv;
	 * 
	 * }
	 */

	@RequestMapping("roomList.do")
	public ModelAndView romm() {
		ModelAndView mv = new ModelAndView("roomList");
		List<homepage_VO> list = homepage_Service.homepageList();
		mv.addObject("list", list);
		
		return mv;

	}
	
}
