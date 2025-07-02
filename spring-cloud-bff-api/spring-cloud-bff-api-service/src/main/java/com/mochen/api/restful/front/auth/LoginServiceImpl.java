package com.mochen.api.restful.front.auth;

import com.mochen.api.front.auth.service.LoginService;
import com.mochen.api.front.auth.request.LoginByPasswordRequest;
import com.mochen.api.front.auth.vo.LoginVO;
import com.mochen.common.model.Result;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginServiceImpl implements LoginService {
    @Override
    public Result<LoginVO> loginByPassword(LoginByPasswordRequest loginByPasswordRequest) {
        return null;
    }
}
