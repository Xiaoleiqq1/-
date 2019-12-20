import java.util.ArrayList;
import java.util.List;

public class Result {
    //结果的类，包括起点站、终点站、两站点之间的最短距离以及该线路上所经过的站点。

    private Station startStation;
    private Station endStation;
    private int distance;
    private List<Station> passStations = new ArrayList<>();

    public Station getStartStation() {
        return startStation;
    }
    public void setStartStation(Station startStation) {
        this.startStation = startStation;
    }
    public Station getEndStation() {
        return endStation;
    }
    public void setEndStation(Station endStation) {
        this.endStation = endStation;
    }
    public int getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    public List<Station> getPassStations() {
        return passStations;
    }
    public void setPassStations(List<Station> passStations) {
        this.passStations = passStations;
    }

}