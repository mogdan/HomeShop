package test;

import product.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainTest {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        String requete = "fullname=Daniel+PHAN&address=39+rue+des+Albizzias%2C+%28chez+PHAN+Fran%C3%A7ois%29&deliveryMode=direct&deliveryInfo=Paris&products=0%3A4%0D%0A1%3A2%0D%0A2%3A3";
        String[] paramBruts = requete.split("&");
//        System.out.println(paramBruts[0]);
//        System.out.println(paramBruts[1]);
//        System.out.println(paramBruts[2]);
//        System.out.println(paramBruts[3]);
        Map<String, String> params = new HashMap<>();
        for (String brutParam : paramBruts) {
            String[] keyAndValue = brutParam.split("=");
            if (keyAndValue.length == 2)
                params.put(keyAndValue[0], keyAndValue[1]);
            //System.out.println("clé : "+keyAndValue[0]);
            //System.out.println("valeur : "+keyAndValue[1]);
        }
        String[] productParams = params.get("products").split("%0D%0A");
        System.out.println(productParams[0]);
        System.out.println(productParams[1]);
        System.out.println(productParams[2]);

        for (String productLine : productParams) {
            String[] productAndQuantity = productLine.split("%3A");
            Product product = products.get(Integer.parseInt(productAndQuantity[0]));
            System.out.println("Produit :" + product.getName());
            Integer quantity = Integer.parseInt(productAndQuantity[1]);
            System.out.println("Quantité :" + quantity);
        }


    }
}
