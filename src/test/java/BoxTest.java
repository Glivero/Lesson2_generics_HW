import org.example.Apple;
import org.example.Box;
import org.example.Orange;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class BoxTest {

    @Test
    public void check() {
        Box<Orange> orange1 = new Box<>();
        Box<Orange> orange2 = new Box<>();
        Box<Apple> apple1 = new Box<>();
        Box<Apple> apple2 = new Box<>();

//      System.out.println("Добавляем фрукты в коробку. Вес коробки:");

        orange1.addFruit(new Orange(), 8);
        orange2.addFruit(new Orange(), 4);
        apple1.addFruit(new Apple(), 12);
        apple2.addFruit(new Apple(), 8);

        Assertions.assertTrue(orange1.addFruit(new Orange(), 0));
        Assertions.assertTrue(orange2.addFruit(new Orange(), 0));
        Assertions.assertTrue(apple1.addFruit(new Apple(), 0));
        Assertions.assertTrue(apple2.addFruit(new Apple(), 0));
/*
        System.out.println("Коробка 1: " + orange1.getWeight());
        System.out.println("Коробка 2: " + orange2.getWeight());
        System.out.println("Коробка 3: " + apple1.getWeight());
        System.out.println("Коробка 4: " + apple2.getWeight());
        System.out.println("Коробка 1 равна коробке 3: " + orange1.compare(apple1));
        System.out.println("Коробка 2 равна коробке 4: " + orange2.compare(apple2));
*/
        Assertions.assertTrue(orange1.compare(orange1) == apple1.compare(apple1));
        Assertions.assertFalse(orange2.compare(orange2) == apple1.compare(apple2));

//      System.out.print("Пересыпаем фрукты. ");

        orange1.moveTo(orange2);
        apple1.moveTo(apple2);

        Assertions.assertTrue(orange1.moveTo(orange2));
        Assertions.assertTrue(apple1.moveTo(apple2));

/*
        System.out.println("Высчитываем вес коробки: ");
        System.out.println("Коробка 1: " + orange1.getWeight());
        System.out.println("Коробка 2: " + orange2.getWeight());
        System.out.println("Коробка 3: " + apple1.getWeight());
        System.out.println("Коробка 4: " + apple2.getWeight());
*/
        Assertions.assertEquals(orange1.getWeight(), 0);
        Assertions.assertEquals(orange2.getWeight(), 18);
        Assertions.assertEquals(apple1.getWeight(), 0);
        Assertions.assertEquals(apple2.getWeight(), 20);

    }
}