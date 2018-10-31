package com.gwa.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GwaWebController {

	/**
	 * 動作確認方法<br>
	 * 1. GwaWebApplicationを右クリックする<br>
	 * 2. 実行を選択<br>
	 * 3. Spring Boot アプリケーションを選択<br>
	 * 4. Springの起動が終わるのを待つ<br>
	 * 5. 以下のURLに@RequestMappingに指定したURLを追加してアクセスする<br>
	 * URL: http://localhost:8080
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/")
	public String index(Model model) {

		// jspの変数に設定する値を設定<br>
		// 以下の例ではjsp内のtextStrという変数に"Hello Spring MVC!!"という文字列をセットする
		model.addAttribute("textStr", "Hello Spring MVC!!");

		// src/main/webapp/WEB-INF/views配下のreturnに指定したファイル名のjspが表示される。
		return "index";
	}
}
