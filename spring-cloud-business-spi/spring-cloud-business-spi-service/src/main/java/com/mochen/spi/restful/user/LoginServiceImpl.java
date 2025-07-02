package com.mochen.spi.restful.user;

import com.mochen.spi.user.request.LoginRequest;
import com.mochen.spi.user.response.LoginResponse;
import com.mochen.spi.user.service.LoginService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginServiceImpl implements LoginService {

    @Override
    public LoginResponse login(@RequestBody LoginRequest loginRequest) {
        return null;
    }
}
