package com.lxz.book.model;


import java.util.List;

/**
 * Created by Administrator on 2018/5/27 0027.
 */
public class  WebResult<T> {
    private int ret;
    private String msg;
    private T data;
    private int totals;
    public static int errCode = 0;
    public static int succCode = 1;

    public WebResult(int ret, String msg) {
        this.ret = ret;
        this.msg = msg;
    }

    public WebResult(int ret, String msg, T data) {
        this.ret = ret;
        this.msg = msg;
        this.data = data;
    }

    public WebResult(T data) {
        this.ret = succCode;
        this.data = data;
        this.msg = "请求成功";
    }

    public WebResult(T data, int totals) {
        this.ret = succCode;
        this.data = data;
        this.totals = totals;
        this.msg = "请求成功";
    }

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getTotals() {
        return totals;
    }

    public void setTotals(int totals) {
        this.totals = totals;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
