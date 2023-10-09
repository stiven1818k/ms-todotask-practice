package com.smb18k.todolist.utils;

import com.smb18k.todolist.dto.ResponseDto;

public class Response {
    public static <T> ResponseDto<T> success(T data){
        return new ResponseDto<>(data, "Operacion existosa");
    }

    public static <T> ResponseDto<T> error(T data){
        return new ResponseDto<>(data, "Existe un error en la peticion");
    }
}
