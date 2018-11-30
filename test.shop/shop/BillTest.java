package shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BillTest {

    @Test
    public void GIVEN_CorrectValue_WHEN_BillCreation_THEN_GoodResult(){
        Customer client = new Customer("Bastien","Prades-le-Lez");
        Product produit = new Product("chips", "chips piquant", 4);
        Bill vente = new Bill(client);
        //vente.addProduct(4,produit);

        assertTrue(client.getFullname()== "Bastien");
        assertTrue(client.getAddress()== "Prades-le-Lez");
        assertTrue(produit.getName()=="chips");
        assertTrue(produit.getDescription()=="chips piquant");
        assertTrue(produit.getPrice()==4);
        //assertTrue(vente.getCustomer()==client);

    }

}