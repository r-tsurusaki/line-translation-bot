package com.lineTranslationBot.domain.service;

import com.lineTranslationBot.application.resources.TranslationEntity;
import com.lineTranslationBot.application.resources.TranslationEntityData;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class LineService {

    /**
     * テスト用のServiceなので固定文言を返却するメソッド
     *
     * @return
     */
    public TranslationEntity getEntity() {

        return TranslationEntity.builder()
                .status("200")
                .data(
                        TranslationEntityData.builder()
                                .code("10000")
                                .num(5)
                                .date(new Date())
                                .build())
                .message("success")
                .build();
    }
}
