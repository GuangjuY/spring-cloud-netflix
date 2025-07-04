package com.mochen.spi.order.service;

import com.mochen.spi.order.request.OrderRequest;
import com.mochen.spi.order.response.OrderResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


/**
 * 订单接口
 */
@Tag(name = "订单相关API", description = "用于查询和管理用户订单的接口")
public interface OrderService {

    @Operation(
            summary = "获取订单列表",
            description = "根据指定条件查询并返回用户的订单列表。",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "订单列表查询参数",
                    required = true,
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = OrderRequest.class)
                    )
            )
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "成功获取订单列表",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = OrderResponse.class))
                    )
            ),
            @ApiResponse(responseCode = "400", description = "无效的请求参数"),
            @ApiResponse(responseCode = "500", description = "服务器内部错误")
    })
    @PostMapping("/getList")
    List<OrderResponse> getOrderList(@RequestBody OrderRequest orderRequest);
}
