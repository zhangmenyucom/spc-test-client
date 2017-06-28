package com.taylor.bean;

import com.netflix.discovery.provider.Serializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author xiaolu.zhang
 * @desc:
 * @date: 2017/6/14 16:48
 */
@Data
@Serializer
public class SearchBean{
    @ApiModelProperty(notes = "id")
    private int id;
    @ApiModelProperty(notes = "姓名")
    private String name;
}
