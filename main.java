import java.util.ArrayList;
import java.util.List;

/**
 * Головний клас для тестування RailwayCarList.
 */
public class main {
    public static void main (String[] args) {
        // Створення порожньої колекції
        RailwayCarList<RailwayCar> emptyList = new RailwayCarList<>();

        // Додавання одного елемента через конструктор
        RailwayCarList<RailwayCar> singleItemList = new RailwayCarList<>(
                new PassengerCar(100, 200, 3)
        );

        // Додавання елементів через стандартну колекцію
        List<RailwayCar> initialList = new ArrayList<>();
        initialList.add(new PassengerCar(50, 100, 2));
        initialList.add(new PassengerCar(80, 150, 4));
        initialList.add(new PassengerCar(80, 150, 1));

        RailwayCarList<RailwayCar> railwayCarList = new RailwayCarList<>(initialList);

        // Додавання елемента
        railwayCarList.add(new PassengerCar(120, 300, 5));
        System.out.println("Розмір списку: " + railwayCarList.size());

        // Отримання елементів
        for (RailwayCar car : railwayCarList) {
            System.out.println("Кількість пасажирів: " + car.getPassengerCount() + 
                               ", рівень комфорту: " + car.getComfortLevel());
        }
    }
}
