class Televisor {
    String status;

    Televisor(String status) {
        this.status = status;
    }

    void turnOn(Televisor televisor) {
        televisor.status = "On";
    }

    void turnOff(Televisor televisor) {
        televisor.status = "Off";
    }

    void showStatus() {
        System.out.println(status);
    }
}
