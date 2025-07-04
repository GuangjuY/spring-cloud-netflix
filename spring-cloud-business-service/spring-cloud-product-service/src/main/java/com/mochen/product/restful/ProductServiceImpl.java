package com.mochen.product.restful;

import com.mochen.spi.product.response.ProductResponse;
import com.mochen.spi.product.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductServiceImpl implements ProductService {

    @Override
    public List<ProductResponse> getProductList() {
        List<ProductResponse> productResponseList = new ArrayList<>();
        productResponseList.add(new ProductResponse().setProductId("1").setName("商品1").setState("success"));
        productResponseList.add(new ProductResponse().setProductId("2").setName("商品2").setState("success"));
        return productResponseList;
    }
}
