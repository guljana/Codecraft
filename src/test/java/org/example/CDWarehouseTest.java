package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CDWarehouseTest
{
    @Test
    public void addSingleCD(){
        Warehouse cdWarehouse = new Warehouse();
        CD cd = new CD("The Wall", "Pink Floyd");
        cdWarehouse.addItem(cd,1);
        assertEquals(1, cdWarehouse.getStock(cd));
    }

    @Test
    public void buyCDInStock() {
        Warehouse warehouse = new Warehouse();
        CD cd = new CD("Thriller", "Michael Jackson");
        warehouse.addItem(cd, 5);
        boolean result = warehouse.buyItem(cd, 2);
        assertTrue(result);
        assertEquals(3, warehouse.getStock(cd));
    }

    @Test
    public void buyCDNotEnoughStock() {
        Warehouse warehouse = new Warehouse();
        CD cd = new CD("Thriller", "Michael Jackson");
        warehouse.addItem(cd, 1);
        boolean result = warehouse.buyItem(cd, 2);
        assertFalse(result);
        assertEquals(1, warehouse.getStock(cd));
    }

    @Test
    public void buyCDNotInStock()
    {
        Warehouse warehouse = new Warehouse();
        CD cd = new CD("Thriller", "Michael Jackson");
        assertFalse(warehouse.buyItem(cd, 1));
    }

        @Test
    public void testAddDuplicateCD() {
        Warehouse warehouse = new Warehouse();
        CD cd = new CD("Thriller", "Michael Jackson");
        warehouse.addItem(cd, 5);
        warehouse.addItem(cd, 2);
        assertEquals(7, warehouse.getStock(cd));
    }

    @Test
    public void searchForCDsByTitle(){
        Warehouse cdWarehouse = new Warehouse();
        CD cd1 = new CD("The Wall", "Pink Floyd");
        CD cd2 = new CD("The Wall", "Mike");
        cdWarehouse.addItem(cd1,1);
        cdWarehouse.addItem(cd2,1);
        assertEquals(2, cdWarehouse.getItems("The Wall","").size());
    }

@Test
    public void searchForCDsByTitleAndArtist(){
        Warehouse cdWarehouse = new Warehouse();
        CD cd1 = new CD("The Wall", "Pink Floyd");
        CD cd2 = new CD("The Wall", "Mike");
        cdWarehouse.addItem(cd1,1);
        cdWarehouse.addItem(cd2,5);
        assertEquals(1, cdWarehouse.getItems("The Wall", "Pink Floyd").size());
        assertEquals(1, cdWarehouse.getItems("The Wall", "Mike").size());
    }

    @Test
    public void searchForCDsByArtistOnly(){
        Warehouse cdWarehouse = new Warehouse();
        CD cd1 = new CD("The Wall", "Pink Floyd");
        CD cd2 = new CD("The Wall", "Mike");
        cdWarehouse.addItem(cd1,1);
        cdWarehouse.addItem(cd2,5);
        assertEquals(1, cdWarehouse.getItems("","Pink Floyd").size());
        assertEquals(1, cdWarehouse.getItems("","Mike").size());
    }

    @Test
    public void searchForCDsByTitleOnly(){
        Warehouse cdWarehouse = new Warehouse();
        CD cd1 = new CD("The Wall", "Pink Floyd");
        CD cd2 = new CD("The Wall", "Mike");
        cdWarehouse.addItem(cd1,1);
        cdWarehouse.addItem(cd2,5);
        assertEquals(2, cdWarehouse.getItems("The Wall","").size());
    }


}
