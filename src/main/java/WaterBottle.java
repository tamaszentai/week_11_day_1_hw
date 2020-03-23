public class WaterBottle {
    private int volume;

    public WaterBottle() {
        volume = 100;
    }

    public int Drink() {
        volume -= 10;
        return volume;
    }

    public int Empty() {
        volume = 0;
        return volume;
    }

    public int Fill() {
        volume = 100;
        return volume;
    }
}
