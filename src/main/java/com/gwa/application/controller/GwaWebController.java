package com.gwa.application.controller;

import com.gwa.application.resources.IndexEntity;
import com.gwa.domain.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class GwaWebController {

    @Autowired
    private IndexService indexService;

    /**
     * ほげ情報json返却
     */
    @RequestMapping(value = "/", method = {RequestMethod.GET})
    public ResponseEntity<IndexEntity> Index() {

        IndexEntity indexEntity = this.indexService.getEntity();

        return ResponseEntity.ok(indexEntity);
    }
}
