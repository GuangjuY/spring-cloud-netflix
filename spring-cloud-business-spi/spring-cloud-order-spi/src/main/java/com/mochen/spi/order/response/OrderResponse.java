package com.mochen.spi.order.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@Schema(description = "订单列表Response")
public class OrderResponse {
    @Schema(description = "用户", example = "1464947847161376769")
    private String userId;
    @Schema(description = "订单id", example = "178****1234")
    private String orderId;
    @Schema(description = "订单状态", example = "xxxx")
    private String state;
}
