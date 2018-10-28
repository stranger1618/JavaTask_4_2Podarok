package Candies;

/**
 * Класс IceCream
 * Описывает продукт типа "Мороженное"
 * @see Candy
 */

public class IceCream extends Candy {
    private String taste;

    public IceCream(String name, int weight, int price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Мороженое: " + super.toString() + ", Вкус: " + taste;
    }
}

