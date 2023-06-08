package src.Domen;

public class Product {
    public Product(int productId, String productName, String productCategory, Double price) {
    }

    public void setPrice(int i) {
    }

    public class product {
        private int productId;
        private String productName;//for displaying to customer
        private String productCategory;
        private double price;

        public product(int productId, String productName, String productCategory, double price) throws Exception {
            this.productId = productId;
            this.productName = productName;
            this.productCategory = productCategory;

        }

        public int getProductId() {
            return productId;
        }

        public void setProductId(int productId) {
            this.productId = productId;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getProductCategory() {
            return productCategory;
        }

        public void setProductCategory(String productCategory) {
            this.productCategory = productCategory;
        }

        public double getPrice() {
            return price;
        }

        public double setPrice(Double i) {
            if (price > 10) {
                this.price = i;
            }
            return i;
        }
    }
}
