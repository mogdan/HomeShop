package shop;

class WriterTest {
/*    private String output;
    private Writer writerMock = new Writer() {
        @Override
        public void start() {
            output = "";

        }

        @Override
        public void writeLine(String line) {
            output += line;

        }

        @Override
        public void stop() {

        }
    }

    @Test
    GIVEN_StandardOrder_WHEN_Order_THEN_GenerateBill() {
        Customer client = new Customer("Juste  Leblanc", "19 rue Germain Pilon, Paris");
        Delivery delivery = new RelayDelivery(24);
        Bill facture = new Bill(client, delivery);

        Product tele = new Product("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599.0);
        Fridge frigo = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189.0, 130, true);
        Product cafe = new Product("Philips HD7899/61","Philips SENSEO Quadrante, Noir - 1 ou 2 tasses",79.99);

        facture.addProduct(tele,1);
        facture.addProduct(frigo,1);
        facture.addProduct(cafe,1);

        assertEquals("HomeShop compagnie", output[1]);
        assertEquals("H1 Place Charles de Gaulle, 75008 Paris", output[2]);
        assertEquals("Facture à l'attention de :", output[4]);
        assertEquals("Juste Leblanc", output[5]);
        assertEquals("19 rue Germain Pilon, Paris", output[6]);
        assertEquals("Mode de livraison : livraison point relais 2.99€", output[8]);
        assertEquals("Produits :", output[10]);
        assertEquals("-----------------------------------------------------", output[11]);
        assertEquals("TV Samsung UE49MU6292 - 599.0 - 1 unité(s)", output[12]);
        assertEquals("Smart TV LED incurvée 49\"", output[13]);
        assertEquals("BEKO TSE 1042 F - 189.0 - 1 unité(s)", output[15]);
        assertEquals("Réfrigérateur BEKO 130L - Classe A+ - blanc", output[16]);
        assertEquals("Philips HD7866/61 - 79.99 - 1 unité(s)", output[18]);
        assertEquals("Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", output[19]);
        assertEquals("Livraison : 2.99", output[21]);
        assertEquals("-----------------------------------------------------", output[22]);
        assertEquals("STotal : 870.98", output[23]);

    }*/

}