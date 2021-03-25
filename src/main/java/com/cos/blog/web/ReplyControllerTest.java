package com.cos.blog.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.domain.post.Post;
import com.cos.blog.domain.post.PostRepository;
import com.cos.blog.web.dto.CMRespDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class ReplyControllerTest {

	//private final ReplyRepository replyRepository;
	private final PostRepository postRepository;
	
	// 게시글 상세보기 (user, post, reply 들)
	@GetMapping("/test/post/{id}")
	public @ResponseBody CMRespDto<?> testpOST(@PathVariable int id) {
		postRepository.findAll();
		
		Post post =  postRepository.findById(id).get();
		return new CMRespDto<>(1, post);
	}
	
}
