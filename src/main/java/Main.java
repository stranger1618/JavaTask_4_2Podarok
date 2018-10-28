import Candies.Drops;
import Candies.Candy;
import Candies.Chocolate;
import Candies.IceCream;

/**
 * Main класс
 * Формирование новогоднего подарка из списка доступных сладостей
 */

public class Main {
    /**
     * Класс Gift
     * Описывает тип: Новогодний подарок.
     */
    public static void main(String[] args) {

        Drops DropsLimon = new Drops("Лимонные", 15 ,20, "жёлтый");
        Drops DropsSulfur = new Drops("Со вкусом яблока", 15 ,25, "Зеленый");
        Drops DropsStrawberry = new Drops("Клубничные", 15 ,15, "Розовый");
        Drops DropsCopper = new Drops("Со вкусом мёда", 15 ,35, "Бронзовый");
        Chocolate ChocolateWhite = new Chocolate("Из белого шоколада", 25, 22, "RitterSport");
        Chocolate ChocolateBroun = new Chocolate("Из молочного шоколада", 25, 20, "AlpenGold");
        Chocolate ChocolateBlack = new Chocolate("Из темного шоколада", 25, 28, "Mozart");

        IceCream IceCreamPistache = new IceCream("Вкусландия", 200, 42, "Фисташковое");
        IceCream IceCreamVanilla = new IceCream("СССР", 120, 17, "Ванильное");
        IceCream IceCreamCoffee = new IceCream("Бразильское", 80, 33, "Кофейное");

        Candy[] box = {DropsLimon, DropsSulfur, DropsStrawberry, DropsCopper, ChocolateWhite, ChocolateBroun,

                ChocolateBlack, IceCreamPistache, IceCreamVanilla, IceCreamCoffee};

        Gift prsnt = new Gift(0, 0);
        prsnt.makeGift(box);
        prsnt.printGift();
    }
}