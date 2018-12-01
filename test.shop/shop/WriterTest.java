package shop;

import org.junit.jupiter.api.Test;

class WriterTest {
    private String output;
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
        Product tele = new Product("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599.0);
        Fridge frigo = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189.0, 130, true);

    }

}