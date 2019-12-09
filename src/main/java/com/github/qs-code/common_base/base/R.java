package cn.qshui.common_base.base;

public class R<T> {

    public cn.qshui.common_base.base.BaseRes<T> success(T data){
        cn.qshui.common_base.base.BaseRes<T> baseRes = new cn.qshui.common_base.base.BaseRes<T>();
        baseRes.success(data);
        return baseRes;
    }

    public static cn.qshui.common_base.base.BaseRes fail(String code, String message){
         cn.qshui.common_base.base.BaseRes baseRes = new cn.qshui.common_base.base.BaseRes();
         baseRes.fail(code,message);
         return baseRes;
    }



}
