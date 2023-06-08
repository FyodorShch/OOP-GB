package src.Domen;

public class HotDrinks {
    public static class hotDrinks extends Product  {

        private int temp;
        /**
         * Create a product for VM
         *
         * @param productId       id product
         * @param productName
         * @param productCategory
         * @param price
         * @throws Exception
         */

        public hotDrinks(int productId, String productName, String productCategory, Double price, int temp) {
            super(productId, productName, productCategory, price);
            this.temp = temp;
        }
    }
}
