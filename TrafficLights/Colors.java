package TrafficLights;

public enum Colors {
    RED("GREEN"),
    GREEN("YELLOW"),
    YELLOW("RED");

    private String nextColor;

    Colors(String next) {
        this.nextColor = next;
    }

    public String getNextColor() {
        return nextColor;
    }
}
