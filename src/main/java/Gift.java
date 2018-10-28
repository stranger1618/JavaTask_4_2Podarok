import Candies.Candy;
import java.util.Random;

/**
 * Класс Gift
 * Описывает сформированный подарок.
 */

public class Gift {
    private int totalPrice;
    private int totalWeight;
    private Candy[] newBox;


    public Gift(int totalPrice, int totalWeight) {
        this.totalPrice = totalPrice;
        this.totalWeight = totalWeight;
    }

    public int getTotalPrice() {
        totalPrice = 0;
        for (Candy candy : newBox) {
            totalPrice = totalPrice + candy.getPrice();
        }
        return totalPrice;
    }


    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }


    public int getTotalWeight() {
        totalWeight = 0;
        for (Candy candy : newBox){
            totalWeight = totalWeight + candy.getWeight();
        }
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Candy[] getNewBox() {
        return newBox;
    }

    public void setNewBox(Candy[] newBox) {
        this.newBox = newBox;
    }

    public void makeGift (Candy[] box) {

        Random myRandom = new Random();

        //Генерируем максимальное число сладостей в подарке
        int max = myRandom.nextInt(30);

        Candy[] newBox = new Candy[max];

        for (int i=0; i<max; i++) {
            int y = myRandom.nextInt(10);
            newBox[i] = box[y];
        }

        setNewBox(newBox);
    }
    public void printGift () {
        System.out.print("Количество сладостей в подарке: ");
        System.out.println(newBox.length);
        System.out.println("\nПеречень сладостей в подарке: \n");
        for (Candy someCandy : newBox) {
            System.out.println(someCandy.toString());
        }
        System.out.println("\nОбщий вес подарка = " + getTotalWeight() + " грамм");
        System.out.println("\nОбщая стоимость подарка = " + getTotalPrice() + "$");
    }
}
