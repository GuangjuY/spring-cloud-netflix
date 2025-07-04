package com.mochen.user.restful;


import com.mochen.spi.user.request.LoginRequest;
import com.mochen.spi.user.response.LoginResponse;
import com.mochen.spi.user.service.LoginService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/login")
public class LoginServiceImpl implements LoginService {

    @Override
    public LoginResponse login(@RequestBody LoginRequest loginRequest) {
        log.error("1111111111111111111");
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setUserId("1232").setName("小明dto").setToken("987876543");
        return loginResponse;
    }
}
