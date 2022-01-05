package TrafficLights;

import java.util.ArrayList;
import java.util.List;

public class TrafficLights {
    private List<Colors> trafficLights;

    public TrafficLights(List<Colors> colors) {
        this.trafficLights = new ArrayList<>();
        trafficLights.addAll(colors);
    }

    public void nextColor(){
    ArrayList<String> tempColors = new ArrayList<>();
        for (Colors color : trafficLights) {
            tempColors.add(color.getNextColor());
        }
      trafficLights.removeAll(trafficLights);

        for (String color: tempColors) {

            trafficLights.add(Colors.valueOf(color));
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        trafficLights.forEach( l -> sb.append(l).append(" "));
        return  sb.toString();

    }
}
