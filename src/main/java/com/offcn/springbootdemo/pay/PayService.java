package com.offcn.springbootdemo.pay;

public interface PayService {

    public void alipay();

    public void queryStatus(String out_trade_no);
}
