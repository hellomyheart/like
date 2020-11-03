package cn.hellomyheart.like.common.vo;

import lombok.Data;

/**
 * @description
 * @className: ResponseResult
 * @package: cn.hellomyheart.like.common.vo
 * @author: Stephen Shen
 * @date: 2020/11/3 下午3:12
 */

@Data
public class ResponseResult<T> {
    private int code;//返回码
    private String msg;//返回码的字符串信息
    private T data;//返回的数据

    public static <T> ResponseResult setR(int c,String m,T obj){
        ResponseResult r=new ResponseResult();
        r.setCode(c);
        r.setData(obj);
        r.setMsg(m);
        return r;
    }
    //成功
    public static ResponseResult ok(){
        return setR(20000,"OK",null);
    }
    //成功
    public static <T> ResponseResult ok(T t){
        return setR(20000,"OK",t);
    }
    //失败
    public static ResponseResult fail(){
        return setR(20002,"Fail",null);
    }
    public static ResponseResult fail(String msg){
        return setR(20002,msg,null);
    }
}
