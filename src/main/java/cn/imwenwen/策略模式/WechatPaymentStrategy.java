package cn.imwenwen.策略模式;

import java.math.BigDecimal;

public class WechatPaymentStrategy implements PaymentStrategy{
    @Override
    public void payment(BigDecimal amount) {
        System.out.println("使用微信支付"+amount);
    }
}
