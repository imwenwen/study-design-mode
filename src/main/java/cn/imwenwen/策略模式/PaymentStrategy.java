package cn.imwenwen.策略模式;

import java.math.BigDecimal;

public interface PaymentStrategy {
    public void payment(BigDecimal amount);
}
