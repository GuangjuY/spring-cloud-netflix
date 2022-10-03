package com.mochen.shop.restful.auth;

import com.mochen.api.shop.auth.service.LoginService;
import com.mochen.api.shop.auth.request.LoginByPasswordRequest;
import com.mochen.api.shop.auth.vo.LoginVO;
import com.mochen.common.model.Result;
import com.mochen.shop.facade.user.LoginFacade;
import com.mochen.shop.infrastructure.mapstruct.auth.LoginMapStruct;
import com.mochen.spi.user.model.LoginDTO;
import com.mochen.spi.user.request.LoginRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    private final LoginFacade loginFacade;
    private final LoginMapStruct loginMapStruct;

    @Override
    public Result<LoginVO> loginByPassword(@RequestBody LoginByPasswordRequest loginByPasswordRequest) {
        LoginRequest loginRequest = new LoginRequest().setPhone("121").setPhoneCode("123456");
        LoginDTO loginDTO = loginFacade.login(loginRequest);
        return Result.success(loginMapStruct.ToVO(loginDTO));
    }
}
