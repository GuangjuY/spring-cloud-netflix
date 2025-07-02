package com.mochen.front.infrastructure.feign.user;

import com.mochen.spi.user.service.LoginService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("user-service")
public interface LoginClient extends LoginService {
}
