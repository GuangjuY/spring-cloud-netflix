package com.mochen.spi.order.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@Schema(description = "订单列表请求")
public class OrderRequest {

    @Schema(description = "用户id")
    private String userId;

}
