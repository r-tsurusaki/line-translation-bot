package com.gwa.application.resources;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class IndexEntityData {

    @JsonProperty("Num")
    private int num;

    @JsonFormat(pattern = "yyyy-mm-dd")
    @JsonProperty("Date")
    private Date date;

    @JsonProperty("Code")
    private String code;
}
