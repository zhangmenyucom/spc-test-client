package com.taylor.controller;

import com.taylor.bean.SearchBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaolu.zhang
 * @desc:
 * @date: 2017/6/14 16:13
 */
@Api(value = "Test API", description = "测试API")
@RestController
@RequestMapping("/test/")
public class TestAction {

    @RequestMapping(value="/hello", method = RequestMethod.POST)
    @ApiOperation(value = "测试专用", produces = "application/json; charset=utf-8", notes = "测试", response = SearchBean.class)
    public SearchBean test(@RequestBody SearchBean searchBean) {
        return searchBean;
    }
}
