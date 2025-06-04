package org.example;

public interface PaymentProcessor
{
    boolean process(String cardNumber, double amount);

}
