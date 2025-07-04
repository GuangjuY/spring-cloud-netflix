package com.mochen.front.infrastructure.mapstruct.auth;


import com.mochen.front.restful.auth.response.LoginByPasswordResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LoginMapStruct {
    LoginByPasswordResponse ToVO(com.mochen.spi.user.response.LoginResponse loginResponse);
}
