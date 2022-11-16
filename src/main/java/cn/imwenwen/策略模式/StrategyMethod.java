package cn.imwenwen.策略模式;

import java.math.BigDecimal;

public class StrategyMethod {
    public static void main(String[] args) {
        PaymentService paymentService =new PaymentService();
        paymentService.payment(new BankCreditPaymentStrategy(),new BigDecimal("100"));

        paymentService.payment(new WechatPaymentStrategy(),new BigDecimal("100"));

        paymentService.payment(new AliPayPaymentStrategy(),new BigDecimal("100"));
    }
}
