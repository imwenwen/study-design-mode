package cn.imwenwen.策略模式;

import java.math.BigDecimal;

public class AliPayPaymentStrategy implements PaymentStrategy{
    @Override
    public void payment(BigDecimal amount) {
        System.out.println("使用支付宝支付"+amount);
    }
}
