package cc.wxyun.yunpan.util;

public class ApiResponse {

    private int code;

    private String msg;

    private Object data;

    public ApiResponse(ResponseStatus responseStatus,Object data) {
        this.code = responseStatus.getCode();
        this.msg = responseStatus.getMsg();
        this.data = data;
    }

    public ApiResponse(){
    }

    public ApiResponse(int code) {
        this.code = code;
    }


    public int getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }


    public Object getData() {
        return data;
    }


    public ApiResponse code(int code){
        this.code = code;
        return this;
    }

    public ApiResponse msg(String msg){
        this.msg = msg;
        return this;
    }

    public ApiResponse data(Object data){
        this.data = data;
        return this;
    }

    public static ApiResponse build(int code){
        return new ApiResponse(code);
    }

    public static ApiResponse build(int code,String msg){
        return new ApiResponse(code).msg(msg);
    }

    public static ApiResponse build(int code,String msg,Object data){
        return new ApiResponse(code).msg(msg).data(data);
    }

    public static  ApiResponse success(Object data){
        return new ApiResponse(ResponseStatus.SUCCESS,data);
    }

    public static  ApiResponse success(){
        return new ApiResponse(ResponseStatus.SUCCESS,null);
    }

    public static  ApiResponse error(){
        return new ApiResponse(ResponseStatus.ERROR,null);
    }

    public static  ApiResponse error(String msg){
        return new ApiResponse().code(ResponseStatus.ERROR.getCode()).msg(msg);
    }
}
