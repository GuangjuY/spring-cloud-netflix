package com.mochen.spi.order.service;

import com.mochen.spi.order.request.OrderRequest;
import com.mochen.spi.order.response.OrderResponse;
import io.swagger.annotations.*;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 登录接口
 */
@Api(tags = "订单相关api")
@RequestMapping("/order")
public interface OrderService {

    @ApiOperation(value = "订单列表", notes = "订单列表", extensions = {@Extension(name = "状态", properties = {@ExtensionProperty(name = "开发状态", value = "已定义")})})
    @ApiImplicitParam(name = "orderRequest", value = "订单列表入参", dataType = "OrderRequest", required = true, paramType = "body")
    @RequestMapping(value = "/getList", method = RequestMethod.POST)
    @ApiResponses({@ApiResponse(code = 200, message = "成功")})
    List<OrderResponse> getOrderList(@RequestBody OrderRequest loginRequest);
}
