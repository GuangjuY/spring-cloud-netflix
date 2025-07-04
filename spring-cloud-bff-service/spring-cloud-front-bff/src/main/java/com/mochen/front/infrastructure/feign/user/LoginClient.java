package com.mochen.front.infrastructure.feign.user;

import com.mochen.spi.user.service.LoginService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "user-service", path = "/login")
public interface LoginClient extends LoginService {
}
