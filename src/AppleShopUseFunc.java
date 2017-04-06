/**
 * Created by danawacomputer on 2017-04-06.
 */
public class AppleShopUseFunc {
    public static void main(String[] args){

        int iPadPro = 999_000;
        int rate = 15;
        double discountedPrice = getDiscountedPrice(iPadPro, rate);

        System.out.println(discountedPrice + "원");
    }

    public static double getDiscountedPrice(int iPadPro, double rate ){
        double discountedPrice = iPadPro * (1 - rate / 100);
        return discountedPrice;
    }
}
