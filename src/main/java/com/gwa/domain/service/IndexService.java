package com.gwa.domain.service;

import org.springframework.stereotype.Service;

@Service
public class IndexService {

	/**
	 * テスト用のServiceなので固定文言を返却するメソッド
	 * 
	 * @return
	 */
	public String test() {
		return "Hello Spring MVC!!";
	}

}
