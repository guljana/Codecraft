package org.example;

import java.util.ArrayList;
import java.util.List;

public class CDWarehouse
{
  private List<CD> cds= new ArrayList<>();

    public void addCD(String title, String artist)
    {
        CD cd = new CD(title, artist);
        cds.add(cd);
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
