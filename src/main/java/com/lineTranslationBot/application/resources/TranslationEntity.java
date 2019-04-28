package com.lineTranslationBot.application.resources;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TranslationEntity {

    @JsonProperty("Status")
    private String status;

    @JsonProperty("Data")
    TranslationEntityData data;

    @JsonProperty("Message")
    private String message;
}
