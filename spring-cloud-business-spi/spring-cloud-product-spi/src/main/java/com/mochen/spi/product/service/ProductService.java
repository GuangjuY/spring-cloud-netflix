package com.mochen.spi.product.service;

import com.mochen.spi.product.response.ProductResponse;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 登录接口
 */
@Api(tags = "商品相关api")
@RequestMapping("/product")
public interface ProductService {

    @ApiOperation(value = "商品列表", notes = "商品列表", extensions = {@Extension(name = "状态", properties = {@ExtensionProperty(name = "开发状态", value = "已定义")})})
    @RequestMapping(value = "/getList", method = RequestMethod.POST)
    @ApiResponses({@ApiResponse(code = 200, message = "成功")})
    List<ProductResponse> getProductList();
}
