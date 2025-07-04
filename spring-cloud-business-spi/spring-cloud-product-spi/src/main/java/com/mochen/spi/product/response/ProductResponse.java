package com.mochen.spi.product.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@Schema(description = "订单列表Response")
public class ProductResponse {

    @Schema(description = "商品id", example = "178****1234")
    private String productId;
    @Schema(description = "商品名称", example = "178****1234")
    private String name;
    @Schema(description = "商品状态", example = "xxxx")
    private String state;
}
