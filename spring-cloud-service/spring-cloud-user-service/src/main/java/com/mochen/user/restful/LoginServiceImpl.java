package com.mochen.user.restful;


import com.mochen.spi.user.model.LoginDTO;
import com.mochen.spi.user.request.LoginRequest;
import com.mochen.spi.user.service.LoginService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    @Override
    public LoginDTO login(@RequestBody LoginRequest loginRequest) {
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setUserId("1232").setName("小明dto").setToken("987876543");
        return loginDTO;
    }
}
