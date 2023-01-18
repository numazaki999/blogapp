package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Blog;

public interface BlogService {
	
	public void saveBlog(Blog blog);
	
	public Optional<Blog> getBlog(Integer number);
	
	public List<Blog> getBlogs();
	
	public void updateBlog(Blog blog);
	
	public void deleteBlog(Integer number);
}