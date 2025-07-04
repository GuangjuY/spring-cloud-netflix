package com.mochen.spi.product.service;

import com.mochen.spi.product.response.ProductResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.extensions.Extension;
import io.swagger.v3.oas.annotations.extensions.ExtensionProperty;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 登录接口
 */
@Tag(name = "商品相关API", description = "用于管理和查询商品信息的接口")
public interface ProductService {

    @Operation(
            summary = "获取商品列表",
            description = "查询并返回所有符合条件的商品列表。",
            extensions = {
                    @Extension(name = "X-Custom-Status", properties = { // Custom extensions are often prefixed with X-
                            @ExtensionProperty(name = "development-status", value = "已定义")
                    })
            }
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "成功获取商品列表",
                    content = @Content(
                            mediaType = "application/json",
                            // Use ArraySchema to describe a list response
                            array = @ArraySchema(schema = @Schema(implementation = ProductResponse.class))
                    )
            ),
            @ApiResponse(responseCode = "500", description = "服务器内部错误")
    })
    @PostMapping("/getList")
    List<ProductResponse> getProductList();
}
