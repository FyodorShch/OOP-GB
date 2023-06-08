package src.Domen;

public class bottle {
    public static class Bottle extends Product {
        private int volume;

        /**
         * Create a product for VM
         *
         * @param productId       id product
         * @param productName
         * @param productCategory
         * @param price
         * @throws Exception
         */
        public Bottle(int productId, String productName, String productCategory, double price, int volume) throws Exception {
            super (productId, productName, productCategory, price);
            this.volume = volume;
        }
    }
}
