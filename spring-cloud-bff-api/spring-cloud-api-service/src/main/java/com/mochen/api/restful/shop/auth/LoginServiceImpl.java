package com.mochen.api.restful.shop.auth;

import com.mochen.api.shop.auth.service.LoginService;
import com.mochen.api.shop.auth.request.LoginByPasswordRequest;
import com.mochen.api.shop.auth.vo.LoginVO;
import com.mochen.common.model.Result;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginServiceImpl implements LoginService {
    @Override
    public Result<LoginVO> loginByPassword(LoginByPasswordRequest loginByPasswordRequest) {
        return null;
    }
}
