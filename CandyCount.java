public class CandyCount {
    public static void main(String[] args) {
        double realMoney = 12.4;
        double realPrice = 1.2;
        int candies = 0;
        if (realMoney > 0 && realPrice > 0) {
            while (realMoney - realPrice >= 0) {
                candies = candies + 1;
                realMoney = realMoney - realPrice;
            }
        }
        System.out.println(candies);
    }

}
// réel money ← 12.4;
// réel price ← 1.2
// entier candies ← 0
// Si money > 0 ET price > 0
// Tant que (money - price) >= 0
// candies ← candies + 1
// money ← money - price
// Fin Tant que
// Fin Si
// afficher candies
