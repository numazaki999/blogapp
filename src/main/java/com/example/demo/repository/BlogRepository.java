package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Blog;

@Mapper
public interface BlogRepository {

	/** Blogを1件保存する
	 * 
	 */
	void saveOne(Blog blog);

	/** 同じnumberのBlogを検索する
	 * 
	 * @return Blog
	 */
	Optional<Blog> selectOne(Integer number);

	/** Blogを全件検索する
	 * 
	 * @return Blog
	 */
	List<Blog> selectAll();

	/** Blogを1件更新する
	 * 
	 */
	void updateOne(Blog blog);

	/** 同じnumberのBlogを削除する
	 * 
	 */
	void deleteOne(Integer number);
}