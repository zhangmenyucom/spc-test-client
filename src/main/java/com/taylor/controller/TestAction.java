package com.taylor.controller;

import com.taylor.bean.SearchBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author xiaolu.zhang
 * @desc:
 * @date: 2017/6/14 16:13
 */
@RestController
@RequestMapping("/test/")
public class TestAction {

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    @ApiOperation(value = "测试专用", produces = "application/json; charset=utf-8", notes = "测试", response = SearchBean.class)
    public SearchBean test(@RequestBody SearchBean searchBean) {
        return searchBean;
    }

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    @ResponseBody
    public SearchBean hi(@RequestParam("name") String name) {
        SearchBean searchBean = new SearchBean();
        searchBean.setName(name);
        return searchBean;
    }
}
