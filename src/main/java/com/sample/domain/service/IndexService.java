package com.sample.domain.service;

import com.sample.application.resources.IndexEntity;
import com.sample.application.resources.IndexEntityData;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class IndexService {

    /**
     * テスト用のServiceなので固定文言を返却するメソッド
     *
     * @return
     */
    public IndexEntity getEntity() {

        return IndexEntity.builder()
                .status("200")
                .data(
                        IndexEntityData.builder()
                                .code("10000")
                                .num(5)
                                .date(new Date())
                                .build())
                .message("success")
                .build();
    }
}