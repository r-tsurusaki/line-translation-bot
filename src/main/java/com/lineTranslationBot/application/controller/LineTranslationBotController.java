package com.lineTranslationBot.application.controller;

import com.lineTranslationBot.domain.service.LineService;
import com.linecorp.bot.model.event.Event;
import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;
import org.springframework.beans.factory.annotation.Autowired;

@LineMessageHandler
public class LineTranslationBotController {

    // LINEのサービスクラス
    @Autowired
    LineService lineService;

    /**
     * テキストメッセージのhandler
     *
     * @param event event
     * @return 返信メッセージ
     */
    @EventMapping
    public TextMessage handleTextMessageEvent(MessageEvent<TextMessageContent> event) {

        System.out.println("event: " + event);

        String resultStr = this.lineService.echo(event.getMessage().getText());

        return new TextMessage(resultStr);
    }

    /**
     * overrideしていないメソッドのhandler
     *
     * @param event event
     */
    @EventMapping
    public void handleDefaultMessageEvent(Event event) {
        System.out.println("event: " + event);
    }
}
