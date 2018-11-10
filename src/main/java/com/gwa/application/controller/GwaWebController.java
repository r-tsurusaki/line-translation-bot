package com.gwa.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gwa.domain.service.IndexService;

@Controller
public class GwaWebController {

	@Autowired
	private IndexService indexService;

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
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ModelAndView index(ModelAndView modelAndView) {

		// Serviceクラスを呼び出す処理
		// 固定文言を返却する
		String serviceReslt = this.indexService.test();

		// jspの変数に設定する値を設定<br>
		// 以下の例ではjsp内のtextStrという変数にserviceResltの値をセットする
		modelAndView.addObject("textStr", serviceReslt);

		modelAndView.setViewName("index");

		// src/main/webapp/WEB-INF/views配下のreturnに指定したファイル名のjspが表示される。
		return modelAndView;
	}
}
