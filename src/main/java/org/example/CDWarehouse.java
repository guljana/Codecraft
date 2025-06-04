package org.example;

import java.util.*;

public class CDWarehouse {
    private final Map<CD, Integer> stock = new HashMap<>();

    public void addCD(CD cd, int quantity) {
        stock.put(cd, stock.getOrDefault(cd, 0) + quantity);
    }

    public boolean buyCD(CD cd, int quantity) {
        Integer currentStock = stock.get(cd);
        if (currentStock == null || currentStock < quantity) {
            return false;
        }
        stock.put(cd, currentStock - quantity);
        return true;
    }


    public int getStock(CD cd) {
        return stock.getOrDefault(cd, 0);
    }

    public List<CD> getCds(String title, String artist) {
        List<CD> result = new ArrayList<>();
        for (CD cd : stock.keySet()) {
            boolean matchesTitle = (title == null || title.isBlank() || cd.getTitle().equalsIgnoreCase(title));
            boolean matchesArtist = (artist == null || artist.isBlank() || cd.getArtist().equalsIgnoreCase(artist));
            if (matchesTitle && matchesArtist) {
                result.add(cd);
            }
        }
        return result;
    }




}
