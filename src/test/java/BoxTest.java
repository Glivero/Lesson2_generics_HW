import org.example.Apple;
import org.example.Box;
import org.example.Orange;
import org.junit.Test;

public class BoxTest {

    @Test
    public void check() {
        Box<Orange> orange1 = new Box<>();
        Box<Orange> orange2 = new Box<>();
        Box<Apple> apple1 = new Box<>();
        Box<Apple> apple2 = new Box<>();

        System.out.println("Добавляем фрукты в коробку:");
        orange1.addFruit(new Orange(), 8);
        orange2.addFruit(new Orange(), 4);
        apple1.addFruit(new Apple(), 12);
        apple2.addFruit(new Apple(), 8);

        System.out.println("Коробка 1: " + orange1.getWeight());
        System.out.println("Коробка 2: " + orange2.getWeight());
        System.out.println("Коробка 3: " + apple1.getWeight());
        System.out.println("Коробка 4: " + apple2.getWeight());

        System.out.println("Коробка 1 равна коробке 3: " + orange1.compare(apple1));
        System.out.println("Коробка 2 равна коробке 4: " + orange2.compare(apple2));
        System.out.print("Пересыпаем фрукты. ");
        orange1.moveTo(orange2);
        apple1.moveTo(apple2);

        System.out.println("Высчитываем вес коробки: ");
        System.out.println("Коробка 1: " + orange1.getWeight());
        System.out.println("Коробка 2: " + orange2.getWeight());
        System.out.println("Коробка 3: " + apple1.getWeight());
        System.out.println("Коробка 4: " + apple2.getWeight());

    }
}