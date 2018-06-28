package com.ch.hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //@RestController == @Controller + @ResponseBody
//Spring version 4.0부터 등장
//@Controller
public class SampleController {
	@RequestMapping("/sample")
	
	public SampleVo sample() {
		SampleVo sv = new SampleVo();
		sv.setMno(23);
		sv.setFirstName("홍");
		sv.setLastName("길동");
		return sv;
	}

	@RequestMapping("/list")
	
	public List<SampleVo> list() {
		List<SampleVo> list = new ArrayList<SampleVo>();
		for (int i = 1; i <= 10; i++) {
			SampleVo sv = new SampleVo();
			sv.setMno(i);
			sv.setFirstName("홍");
			sv.setLastName("길동" + i);
			list.add(sv);
		}
		return list;
	}
}