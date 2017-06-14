package com.taylor.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author xiaolu.zhang
 * @desc:
 * @date: 2017/6/14 16:48
 */
@Data
public class SearchBean {
    @ApiModelProperty(notes = "id")
    private int id;
    @ApiModelProperty(notes = "姓名")
    private String name;
}
