package cc.wxyun.yunpan.util;

public enum ResponseStatus {

    SUCCESS(0,"成功"),
    ERROR(-1,"错误");
    private int code;

    private String msg;

     ResponseStatus(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }

}
