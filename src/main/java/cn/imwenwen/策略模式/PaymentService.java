package cn.imwenwen.策略模式;

import java.math.BigDecimal;

public class PaymentService {
    public void payment(PaymentStrategy strategy, BigDecimal amount){
        strategy.payment(amount);
    }
}
