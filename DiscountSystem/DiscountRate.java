public class DiscountRate {
    static double serviceDiscountPremium = 0.2;
    static double serviceDiscountGold = 0.15;
    static double serviceDiscountSilver = 0.1;
    static double producDiscountPremium = 0.1;
    static double productDiscountGold = 0.1;
    static double productDiscountSilver = 0.1;

    public static double getServiceDiscountRate(String type){
        if(type == "Premium")
            return serviceDiscountPremium;
        else if (type == "Gold")
            return serviceDiscountGold;
        else
            return serviceDiscountSilver;
    }

    public static double getProducDiscountRate(String type){
        if(type == "Premium")
            return producDiscountPremium;
        else if (type == "Gold")
            return productDiscountGold;
        else
            return productDiscountSilver;
    }
}
