package cn.qshui.common_base.base;

public class R<T> {

    public BaseRes<T> success(T data){
        BaseRes<T> baseRes = new BaseRes<T>();
        baseRes.success(data);
        return baseRes;
    }

    public static  BaseRes fail(String code,String message){
         BaseRes baseRes = new BaseRes();
         baseRes.fail(code,message);
         return baseRes;
    }



}
