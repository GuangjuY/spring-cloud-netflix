package com.mochen.spi.restful.product;

import com.mochen.spi.product.response.ProductResponse;
import com.mochen.spi.product.service.ProductService;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class ProductServiceImpl implements ProductService {

    @Override
    public List<ProductResponse> getProductList() {
        return Collections.emptyList();
    }
}
