package com.lineTranslationBot.application.resources;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IndexEntity {

    @JsonProperty("Status")
    private String status;

    @JsonProperty("Data")
    IndexEntityData data;

    @JsonProperty("Message")
    private String message;
}
