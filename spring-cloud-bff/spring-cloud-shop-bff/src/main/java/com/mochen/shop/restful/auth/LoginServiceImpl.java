package com.mochen.shop.restful.auth;

import com.mochen.api.shop.auth.api.LoginService;
import com.mochen.api.shop.auth.request.LoginByPasswordRequest;
import com.mochen.api.shop.auth.vo.LoginVO;
import com.mochen.common.model.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    @Override
    public Result<LoginVO> loginByPassword(@RequestBody LoginByPasswordRequest loginByPasswordRequest) {
        LoginVO loginVO = new LoginVO();
        loginVO.setName("小明").setUserId("123").setToken("abc");
        return Result.success(loginVO);
    }
}
