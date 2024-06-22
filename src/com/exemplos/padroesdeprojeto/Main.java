package com.exemplos.padroesdeprojeto;

import com.exemplos.padroesdeprojeto.facade.OrderFacade;
import com.exemplos.padroesdeprojeto.strategy.CreditCardPayment;
import com.exemplos.padroesdeprojeto.strategy.PayPalPayment;
import com.exemplos.padroesdeprojeto.strategy.PaymentStrategy;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("Notebook", 1500.00);
        PaymentStrategy paymentMethod1 = new CreditCardPayment("1234-5678-9876-5432");

        Order order2 = new Order("Smartphone", 800.00);
        PaymentStrategy paymentMethod2 = new PayPalPayment("cliente@exemplo.com");

        OrderFacade orderFacade = new OrderFacade();

        orderFacade.placeOrder(order1, paymentMethod1);
        orderFacade.placeOrder(order2, paymentMethod2);
    }
}
