package com.sample.application.controller;

import com.sample.application.resources.IndexEntity;
import com.sample.domain.service.IndexService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "サンプルAPI")
@ApiModel(description = "サンプルコントローラ")
@RestController
@ResponseBody
public class SampleController {

    @Autowired
    private IndexService indexService;

    /**
     * ほげ情報json返却
     */
    @ApiOperation("サンプルjson返却")
    @RequestMapping(value = "/", method = {RequestMethod.GET})
    public ResponseEntity<IndexEntity> Index() {

        IndexEntity indexEntity = this.indexService.getEntity();

        return ResponseEntity.ok(indexEntity);
    }
}
