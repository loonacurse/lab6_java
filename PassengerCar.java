/**
 * Клас, що представляє пасажирський вагон.
 */
public class PassengerCar extends RailwayCar {
    private int comfortLevel;

    /**
     * Конструктор для створення пасажирського вагона.
     *
     * @param passengerCount кількість пасажирів
     * @param baggageCount кількість багажу
     * @param comfortLevel рівень комфорту
     */
    public PassengerCar(int passengerCount, int baggageCount, int comfortLevel) {
        super(passengerCount, baggageCount);
        this.comfortLevel = comfortLevel;
    }

    @Override
    public int getComfortLevel() {
        return comfortLevel;
    }
}
