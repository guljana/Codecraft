package org.example;

import java.util.*;

public class Warehouse
{
    private final Map<Item, Integer> stock = new HashMap<>();

    public void addItem(Item item, int quantity) {
        stock.put(item, stock.getOrDefault(item, 0) + quantity);
    }

    public boolean buyItem(Item item, int quantity) {
        Integer currentStock = stock.get(item);
        if (currentStock == null || currentStock < quantity) {
            return false;
        }
        stock.put(item, currentStock - quantity);
        return true;
    }


    public int getStock(Item item) {
        return stock.getOrDefault(item, 0);
    }

    public List<Item> getItems(String title, String artist) {
        List<Item> result = new ArrayList<>();
        for (Item item : stock.keySet()) {
            boolean matchesTitle = (title == null || title.isBlank() || item.getTitle().equalsIgnoreCase(title));
            boolean matchesArtist = (artist == null || artist.isBlank() || item.getArtist().equalsIgnoreCase(artist));
            if (matchesTitle && matchesArtist) {
                result.add(item);
            }
        }
        return result;
    }




}
