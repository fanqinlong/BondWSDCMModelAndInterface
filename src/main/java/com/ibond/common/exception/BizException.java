package com.ibond.common.exception;

/**
 * @author simonfan
 * @Title: BizException
 * @Description: 业务异常类
 * @Version:1.0.0
 */
public class BizException extends RuntimeException {

    /**
     * 错误码
     */
    private int code;

    /**
     * 错误数据
     */
    private Object data;


    public BizException() {
        super();
    }

    public BizException(BaseErrorInfoInterface errorInfoInterface) {
        super(errorInfoInterface.getMsg());
        this.code = errorInfoInterface.getCode();
    }

    public BizException(BaseErrorInfoInterface errorInfoInterface, Object data) {
        super(errorInfoInterface.getMsg());
        this.code = errorInfoInterface.getCode();
        this.data = data;
    }

    public BizException(BaseErrorInfoInterface errorInfoInterface, Throwable cause) {
        super(errorInfoInterface.getMsg(), cause);
        this.code = errorInfoInterface.getCode();
    }

    public BizException(String msg) {
        super(msg);
    }

    public BizException(int code, String msg) {
        super(msg);
        this.code = code;
    }

    public BizException(int code, String msg, Object data) {
        super(msg);
        this.code = code;
        this.data = data;
    }

    public BizException(int code, String msg, Throwable cause) {
        super(msg, cause);
        this.code = code;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     */
    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

}
