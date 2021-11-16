package com.example.mybatis.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName MessageResult
 * @Description
 * @Author Life
 * @Date 2021/11/16 15:05
 * @Version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageResult<T> {
    T data;
    int code;
    String msg;
}
