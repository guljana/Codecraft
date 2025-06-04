package org.example;

import java.util.HashSet;
import java.util.Set;

public class Customer
{
    private String name;
    private String email;
    private  String cardNumber;
    private Set<Item> itemsPurchaseHistory= new HashSet<>();

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void recordPurchase(Item item) {
        itemsPurchaseHistory.add(item);
    }

    public boolean getItemPurchaseRecord(Item item) {
        return itemsPurchaseHistory.contains(item);
    }

    public String getCardNumber()
    {
        return cardNumber;
    }
}
