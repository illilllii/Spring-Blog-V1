package com.cos.blog.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CMRespDto<T> {
	private int statusCode; // -1 실패, 1 성공
	private T data;
}
