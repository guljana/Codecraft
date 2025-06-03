package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CDWarehouseTest
{
    @Test
    public void addSingleCD(){
        CDWarehouse cdWarehouse = new CDWarehouse();
        cdWarehouse.addCD("Thriller", "Mike");
        assertEquals(1,cdWarehouse.getCds("Thriller", "Mike").size());
    }

    @Test
    public void addMultipleCDsWithSameTitle(){
        CDWarehouse cdWarehouse = new CDWarehouse();
        cdWarehouse.addCD("Thriller", "Mike");
        cdWarehouse.addCD("Thriller", "Mike");
        cdWarehouse.addCD("Thriller", "John");
        assertEquals(2,cdWarehouse.getCds("Thriller", "Mike").size());
        assertEquals(1,cdWarehouse.getCds("Thriller", "John").size());
    }
}
