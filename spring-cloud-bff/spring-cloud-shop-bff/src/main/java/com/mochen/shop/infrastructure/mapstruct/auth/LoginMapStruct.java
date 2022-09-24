package com.mochen.shop.infrastructure.mapstruct.auth;


import com.mochen.api.shop.auth.vo.LoginVO;
import com.mochen.spi.user.model.LoginDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LoginMapStruct {
    LoginVO ToVO(LoginDTO loginDTO);
}
