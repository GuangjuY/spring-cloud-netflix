package com.mochen.front.infrastructure.mapstruct.auth;


import com.mochen.api.front.auth.vo.LoginVO;
import com.mochen.spi.user.response.LoginResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LoginMapStruct {
    LoginVO ToVO(LoginResponse loginResponse);
}
