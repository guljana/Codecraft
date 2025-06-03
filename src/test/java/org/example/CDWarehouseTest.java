package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CDWarehouseTest
{
    @Test
    public void addSingleCD(){
        CDWarehouse cdWarehouse = new CDWarehouse();
       // cdWarehouse.addCD("Thriller", "Mike",1);
        CD cd1 = new CD("The Wall", "Pink Floyd");
        cdWarehouse.addCDs(cd1,1);
        assertEquals(1, cdWarehouse.getStock1(cd1));
        assertEquals(1,cdWarehouse.getCds("The Wall", "Pink Floyd").size());
    }

    @Test
    public void addMultipleCDsWithSameTitle(){
        CDWarehouse cdWarehouse = new CDWarehouse();
        cdWarehouse.addCD("Thriller", "Mike",10);
        assertEquals(10,cdWarehouse.getStock("Thriller", "Mike"));
    }

    @Test
    public void addMultipleCDsWithDifferentTitle(){
        CDWarehouse cdWarehouse = new CDWarehouse();
        cdWarehouse.addCD("Thriller", "Mike",1);
        cdWarehouse.addCD("Thriller", "John",1);
        assertEquals(1,cdWarehouse.getCds("Thriller", "Mike").size());
        assertEquals(1,cdWarehouse.getCds("Thriller", "John").size());
    }

    @Test
    public void searchForCDsByTitle(){
        CDWarehouse cdWarehouse = new CDWarehouse();
        CD cd1 = new CD("The Wall", "Pink Floyd");
        cdWarehouse.addCDs(cd1,1);
        assertEquals(1, cdWarehouse.getCds("The Wall", "Pink Floyd").size());
    }



}
