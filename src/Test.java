public class Test {
    public static void main(String[] args) {
        Televisor televisor = new Televisor("Off");
        televisor.showStatus();

        televisor.turnOn(televisor);
        televisor.showStatus();

        televisor.turnOff(televisor);
        televisor.showStatus();
    }
}
