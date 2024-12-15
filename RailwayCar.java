/**
 * Абстрактний клас для опису залізничного вагона.
 */
public abstract class RailwayCar {
    private int passengerCount;
    private int baggageCount;

    /**
     * Конструктор для створення об'єкта RailwayCar.
     *
     * @param passengerCount кількість пасажирів
     * @param baggageCount кількість багажу
     */
    public RailwayCar(int passengerCount, int baggageCount) {
        this.passengerCount = passengerCount;
        this.baggageCount = baggageCount;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public int getBaggageCount() {
        return baggageCount;
    }

    /**
     * Абстрактний метод для визначення рівня комфорту.
     *
     * @return рівень комфорту
     */
    public abstract int getComfortLevel();
}
