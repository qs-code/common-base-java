package cn.qshui.common_base.base;

public class BaseRes<T> {

    private String code;
    private String message;
    private T data;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }

    public void success(T data){
        this.code = "0";
        this.message = "success";
        this.data = data;
    }


    public  void fail(String code,String message){
       this.code = code;
       this.message = message;
    }
}
