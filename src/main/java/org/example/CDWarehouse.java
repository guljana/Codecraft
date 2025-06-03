package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CDWarehouse
{
  private List<CD> cds= new ArrayList<>();
  private Map<CD, Integer> stock = new HashMap<>();

    public void addCD(String title, String artist, int quantity)
    {
        CD cd = new CD(title, artist);
        stock.put(cd, stock.getOrDefault(cd, 0) + quantity);
    }
    public void addCDs(CD cd, int quantity)
    {
        stock.put(cd, stock.getOrDefault(cd, 0) + quantity);
        cds.add(cd);
    }

    public int getStock(String title, String artist)
    {
        CD cd = new CD(title, artist);
        return this.stock.get(cd);
    }

    public int getStock1(CD cd)
    {
        if (this.stock.containsKey(cd)) {
            return this.stock.get(cd);
        }
        return 0;
    }


    public List<CD> getCds(String title, String artist)
    {
        List<CD> cds = new ArrayList<>();
        for (CD cd : this.cds) {
            if (cd.getTitle().equalsIgnoreCase(title) && cd.getArtist().equalsIgnoreCase(artist)) {
                cds.add(cd);
            }
        }
        return cds;
    }
}
