package com.mochen.spi.order.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@ApiModel(description = "订单列表请求")
public class OrderRequest {

    @ApiModelProperty(value = "用户id")
    private String userId;

}
