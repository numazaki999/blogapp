package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.BlogService;

@Controller
@RequestMapping("/")
public class BlogController {

	@Autowired
	BlogService blogServiceImpl;

}