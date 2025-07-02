package com.mochen.order.restful;


import com.mochen.spi.order.request.OrderRequest;
import com.mochen.spi.order.response.OrderResponse;
import com.mochen.spi.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class OrderServiceImpl implements OrderService {


    @Override
    public List<OrderResponse> getOrderList(@RequestBody OrderRequest orderRequest) {
        List<OrderResponse> orderResponseList = new ArrayList<>();
        orderResponseList.add(new OrderResponse().setUserId(orderRequest.getUserId()).setOrderId("order1232").setState("success"));
        orderResponseList.add(new OrderResponse().setUserId(orderRequest.getUserId()).setOrderId("order1233").setState("success"));
        return orderResponseList;
    }
}
