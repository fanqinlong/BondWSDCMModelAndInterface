package com.ibond.common.exception;

import com.ibond.common.enums.CommonEnum;
import com.ibond.common.result.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author simonfan
 * @Title: GlobalExceptionHandler
 * @Description: 全局异常处理
 * 如果使用@RestControllerAdvice 注解
 * 则会将返回的数据类型转换成JSON格式
 * @Version:1.0.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 处理自定义的业务异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public Result bizExceptionHandler(BizException e) {
        logger.error("发生业务异常！原因是：{}", e.getMessage());
        return Result.builder().code(e.getCode()).msg(e.getMessage()).data(e.getData()).build();
    }

    /**
     * 处理其他异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result exceptionHandler(Exception e) {
        logger.error("未知异常！原因是:", e);
        return Result.builder().code(CommonEnum.FAILURE.getCode()).msg(e.getMessage()).build();
    }
}
