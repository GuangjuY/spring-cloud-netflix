package com.mochen.user.restful;


import com.mochen.spi.user.model.LoginDTO;
import com.mochen.spi.user.request.LoginRequest;
import com.mochen.spi.user.service.LoginService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class LoginServiceImpl implements LoginService {

    @Override
    public LoginDTO login(@RequestBody LoginRequest loginRequest) {
        log.error("1111111111111111111");
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setUserId("1232").setName("小明dto").setToken("987876543");
        return loginDTO;
    }
}
