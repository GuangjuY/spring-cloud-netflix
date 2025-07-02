package com.mochen.spi.order.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@ApiModel(description = "订单列表Response")
public class OrderResponse {
    @ApiModelProperty(value = "用户", example = "1464947847161376769")
    private String userId;
    @ApiModelProperty(value = "订单id", example = "178****1234")
    private String orderId;
    @ApiModelProperty(value = "订单状态", example = "xxxx")
    private String state;
}
