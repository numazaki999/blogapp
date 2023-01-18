package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Blog;
import com.example.demo.repository.BlogRepository;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	BlogRepository blogRepository;
	
	@Override
	public void saveBlog(Blog blog) {
		blogRepository.saveOne(blog);
	}
	
	@Override
	public Optional<Blog> getBlog(Integer number) {
		return blogRepository.selectOne(number);
	}
	
	@Override
	public List<Blog> getBlogs() {
		return blogRepository.selectAll();
	}

	@Override
	public void updateBlog(Blog blog) {
		blogRepository.updateOne(blog);
	}
	
	@Override
	public void deleteBlog(Integer number) {
		blogRepository.deleteOne(number);
	}
}