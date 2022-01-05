package TrafficLights;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Colors> colors = Arrays.stream(sc.nextLine().split("\\s+")).map(Colors::valueOf).collect(Collectors.toList());
        TrafficLights trafficLights = new TrafficLights(colors);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            trafficLights.nextColor();
            System.out.println(trafficLights);

        }
    }
}
