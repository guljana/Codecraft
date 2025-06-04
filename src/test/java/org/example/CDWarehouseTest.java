package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CDWarehouseTest
{
    @Test
    public void addSingleCD(){
        CDWarehouse cdWarehouse = new CDWarehouse();
        CD cd = new CD("The Wall", "Pink Floyd");
        cdWarehouse.addCD(cd,1);
        assertEquals(1, cdWarehouse.getStock(cd));
    }

    @Test
    public void buyCDInStock() {
        CDWarehouse warehouse = new CDWarehouse();
        CD cd = new CD("Thriller", "Michael Jackson");
        warehouse.addCD(cd, 5);
        boolean result = warehouse.buyCD(cd, 2);
        assertTrue(result);
        assertEquals(3, warehouse.getStock(cd));
    }

    @Test
    public void buyCDNotEnoughStock() {
        CDWarehouse warehouse = new CDWarehouse();
        CD cd = new CD("Thriller", "Michael Jackson");
        warehouse.addCD(cd, 1);
        boolean result = warehouse.buyCD(cd, 2);
        assertFalse(result);
        assertEquals(1, warehouse.getStock(cd));
    }

    @Test
    public void buyCDNotInStock()
    {
        CDWarehouse warehouse = new CDWarehouse();
        CD cd = new CD("Thriller", "Michael Jackson");
        assertFalse(warehouse.buyCD(cd, 1));
    }

        @Test
    public void testAddDuplicateCD() {
        CDWarehouse warehouse = new CDWarehouse();
        CD cd = new CD("Thriller", "Michael Jackson");
        warehouse.addCD(cd, 5);
        warehouse.addCD(cd, 2);
        assertEquals(7, warehouse.getStock(cd));
    }

    @Test
    public void searchForCDsByTitle(){
        CDWarehouse cdWarehouse = new CDWarehouse();
        CD cd1 = new CD("The Wall", "Pink Floyd");
        CD cd2 = new CD("The Wall", "Mike");
        cdWarehouse.addCD(cd1,1);
        cdWarehouse.addCD(cd2,1);
        assertEquals(2, cdWarehouse.getCds("The Wall","").size());
    }

@Test
    public void searchForCDsByTitleAndArtist(){
        CDWarehouse cdWarehouse = new CDWarehouse();
        CD cd1 = new CD("The Wall", "Pink Floyd");
        CD cd2 = new CD("The Wall", "Mike");
        cdWarehouse.addCD(cd1,1);
        cdWarehouse.addCD(cd2,5);
        assertEquals(1, cdWarehouse.getCds("The Wall", "Pink Floyd").size());
        assertEquals(1, cdWarehouse.getCds("The Wall", "Mike").size());
    }

    @Test
    public void searchForCDsByArtistOnly(){
        CDWarehouse cdWarehouse = new CDWarehouse();
        CD cd1 = new CD("The Wall", "Pink Floyd");
        CD cd2 = new CD("The Wall", "Mike");
        cdWarehouse.addCD(cd1,1);
        cdWarehouse.addCD(cd2,5);
        assertEquals(1, cdWarehouse.getCds("","Pink Floyd").size());
        assertEquals(1, cdWarehouse.getCds("","Mike").size());
    }

    @Test
    public void searchForCDsByTitleOnly(){
        CDWarehouse cdWarehouse = new CDWarehouse();
        CD cd1 = new CD("The Wall", "Pink Floyd");
        CD cd2 = new CD("The Wall", "Mike");
        cdWarehouse.addCD(cd1,1);
        cdWarehouse.addCD(cd2,5);
        assertEquals(2, cdWarehouse.getCds("The Wall","").size());
    }


}
