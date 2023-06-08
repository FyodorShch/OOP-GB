package src;

import src.Domen.HotDrinks;
import src.Domen.Product;
import src.Domen.bottle;
import src.VendingMachines.VendingMachine;
public class Sem1 {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product(1, "Lays", "Чипсы", 59.0);
        item1.setPrice(98);
        Product item2 = new bottle.Bottle(2, "Cola", "Water", 70, 500);

        VendingMachine iMachine = new VendingMachine(300);
        iMachine.addProduct(item1);
        iMachine.addProduct(item2);
        iMachine.addProduct(new Product(3, "Масло", "Масло", 59.0));
        iMachine.addProduct(new bottle.Bottle(4, "Water", "Water", 170, 1500));

        for(Product prod: iMachine.getProducts())
        {
            System.out.println(prod.toString());
        }
    }
}
