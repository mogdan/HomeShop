package shop3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BillTest {
    String content;

    Writer writerMock = new Writer() {
        @Override
        public void start() {
            content = "";
        }

        @Override
        public void writeLine(String line) {
            content += line + "%n";

        }

        @Override
        public void stop() {

        }
    };
    private Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
    private Product tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
    private Fridge fridge = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);
    private Client customer = new Client("Juste Leblanc", "19 rue Germain Pilon, Paris");
    private ExpressDelivery expressDelivery = new ExpressDelivery("Montpellier");

    @Test
    public void Given_2productsAndDelivery_When_generatingBill_Then_getGoodLineNumber() {
        Bill bill = new Bill(customer, expressDelivery);
        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.generate(writerMock);
        int lineNumber = content.split("%n").length;
        assertEquals(20, lineNumber);
    }

    @Test
    public void Given_3productsAndDelivery_When_generatingBill_Then_getGoodTotal() {
        Bill bill = new Bill(customer, expressDelivery);
        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);
        assertEquals(877.98, bill.getTotal(), 0.01);
    }

}