package cn.imwenwen.策略模式;

import java.math.BigDecimal;

public class BankCreditPaymentStrategy implements PaymentStrategy{
    @Override
    public void payment(BigDecimal amount) {
        System.out.println("使用银行卡支付"+amount);
    }
}
