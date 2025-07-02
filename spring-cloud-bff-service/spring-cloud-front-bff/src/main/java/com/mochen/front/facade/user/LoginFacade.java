package com.mochen.front.facade.user;


import com.mochen.front.infrastructure.feign.user.LoginClient;
import com.mochen.spi.user.request.LoginRequest;
import com.mochen.spi.user.response.LoginResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class LoginFacade {

    @Resource
    private LoginClient loginClient;

    public LoginResponse login(LoginRequest loginRequest) {
        try {
            return loginClient.login(loginRequest);
        } catch (Exception e) {
            log.error("登录异常，入参：{}", loginRequest, e);
            return null;
        }
    }
}
