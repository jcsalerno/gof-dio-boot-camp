package com.exemplos.padroesdeprojeto.strategy;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Pago " + amount + " usando Cartão de Crédito.");
    }
}
