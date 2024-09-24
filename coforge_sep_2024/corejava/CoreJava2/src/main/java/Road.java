import java.util.Objects;

public class Road {
    private int RoadNo;
    private  String  RoadName;
    private int RoadLength;

    public Road(int roadNo, String roadName, int roadLength) {
        RoadNo = roadNo;
        RoadName = roadName;
        RoadLength = roadLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Road road = (Road) o;
        return RoadNo == road.RoadNo && RoadLength == road.RoadLength && Objects.equals(RoadName, road.RoadName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(RoadNo, RoadName, RoadLength);
    }
}
