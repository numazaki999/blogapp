package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Blog;
import com.example.demo.service.BlogService;

@Controller
@RequestMapping("/")
public class BlogController {

	@Autowired
	BlogService blogServiceImpl;
	
	//一覧画面表示
	@GetMapping("/")
	public String summary(Model model) {
		List<Blog> blogs = blogServiceImpl.getBlogs();
		model.addAttribute("blogs", blogs);
		return "summary";	
	}
}