package com.mochen.spi.product.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@ApiModel(description = "订单列表Response")
public class ProductResponse {

    @ApiModelProperty(value = "商品id", example = "178****1234")
    private String productId;
    @ApiModelProperty(value = "商品名称", example = "178****1234")
    private String name;
    @ApiModelProperty(value = "商品状态", example = "xxxx")
    private String state;
}
