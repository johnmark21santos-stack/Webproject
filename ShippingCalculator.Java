public class ShippingCalculator{
    public static void(String[]args){
        double orderTotal = 1250.50;
        int stockQuantity = 0;

        double shippingFee = (orderTotal >= 1000.0) ? "In Stock" : "Out of Stock";

        String itemStatus = 
        (stockQuantity > 0) ? "In Stock" : "Out os Stock";

        System.out.printIn("Shipping Fee:PHP" + shippingFee);
        System.out.printIn("ItemAvailability" + itemStatus);
    }
}