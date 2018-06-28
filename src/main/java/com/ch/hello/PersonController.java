package com.ch.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {
	@RequestMapping("/addr")
	public String addr( 
			//@RequestParam("name") 
			//-- name 파라미터 불러오기
			//request.getParameter("name")
			//@RequestParam 생략 시 불러 온 순서대로 저장됨.
			//
			String name, 
			@RequestParam("addr") String addr, 
			Model model) {
		System.out.println("name:"+name);
		System.out.println("addr:"+addr);
		
		model.addAttribute("name", name);
		model.addAttribute("addr", addr);
		return "addr";
	}

	@RequestMapping("/addr2")
//	public String addr2(Person p, Model model) {
	public String addr2(@ModelAttribute Person p, Model model) {
		System.out.println("name:"+ p.getName());
		System.out.println("addr:"+ p.getAddr());
		
		model.addAttribute("person", p);
		return "addr2";
	}
}