package com.gwa.application.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import com.gwa.domain.service.IndexService;

/**
 * GwaWebControllerのテストクラス
 */
@ExtendWith(SpringExtension.class)
@WebAppConfiguration
@SpringBootTest
class GwaWebControllerTest {

	MockMvc mockMvc;

	// MockitoJUnitの適用
	@Rule
	private final MockitoRule rule = MockitoJUnit.rule();

	// テスト対象クラス
	@InjectMocks
	private GwaWebController gwaWebController;

	// ServiceクラスのMock
	@Mock
	private IndexService indexService;

	@BeforeEach
	private void setup() {

		// mockMvcのビルド
		this.mockMvc = MockMvcBuilders.standaloneSetup(this.gwaWebController).build();
	}

	@Test
	public void indexTest() throws Exception {

		// attribute_valueの期待値
		String textStr = "Hello Spring MVC!!";

		// mockの作成
		// 以下の例では、indexServiceのtest()メソッドが呼び出された場合、textStrの値を返却する
		when(this.indexService.test()).thenReturn(textStr);

		// mockMvcでのテスト実行
		// 条件が満たされない場合、テストNGでエラーとなる
		this.mockMvc
				// Getで"/"が実行された場合
				.perform(MockMvcRequestBuilders.get("/"))
				// 実行結果のHTTPステータスコードがOK(200)であること
				.andExpect(status().isOk())
				// 実行後、index.jspが返却されること
				.andExpect(view().name("index"))
				// 実行結果のattribute_value:"textStr"が、変数textStrの値に等しいこと
				.andExpect(model().attribute("textStr", textStr));
	}
}
