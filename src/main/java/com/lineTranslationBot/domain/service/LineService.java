package com.lineTranslationBot.domain.service;

import org.springframework.stereotype.Service;

@Service
public class LineService {

    public String echo(String text) {

        // 受信したメッセージをそのまま返す
        return text;
    }
}
