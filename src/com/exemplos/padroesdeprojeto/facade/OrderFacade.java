package com.exemplos.padroesdeprojeto.facade;

import com.exemplos.padroesdeprojeto.singleton.DatabaseConnection;
import com.exemplos.padroesdeprojeto.strategy.PaymentStrategy;
import com.exemplos.padroesdeprojeto.Order;

public class OrderFacade {
    public void placeOrder(Order order, PaymentStrategy paymentMethod) {
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        System.out.println("Processando pedido para: " + order.getProductName());
        paymentMethod.pay(order.getAmount());

        dbConnection.disconnect();
        System.out.println("Pedido concluído.");
    }
}
