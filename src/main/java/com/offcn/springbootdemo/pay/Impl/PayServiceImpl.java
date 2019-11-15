package com.offcn.springbootdemo.pay.Impl;

import com.offcn.springbootdemo.pay.PayService;

public class PayServiceImpl implements PayService {


    @Override
    public void alipay() {
        System.out.println("支付成功");
    }

    @Override
    public void queryStatus(String out_trade_no) {
        System.out.println("查询支付状态");
    }
}
