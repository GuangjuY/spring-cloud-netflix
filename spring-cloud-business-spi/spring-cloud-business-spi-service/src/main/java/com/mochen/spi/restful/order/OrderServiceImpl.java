package com.mochen.spi.restful.order;

import com.mochen.spi.order.request.OrderRequest;
import com.mochen.spi.order.response.OrderResponse;
import com.mochen.spi.order.service.OrderService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class OrderServiceImpl implements OrderService {

    @Override
    public List<OrderResponse> getOrderList(@RequestBody OrderRequest loginRequest) {
        return Collections.emptyList();
    }
}
