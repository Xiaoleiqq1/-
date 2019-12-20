import java.util.ArrayList;
import java.util.List;

public class Station {
    //站点的类，包括站点名称、所在线路、是否换乘、可换乘的线路以及其相邻站点。
    public String name;
    public String line;
    public Boolean isTransferStation;
    public List<String> lines = new ArrayList<>();
    public List<Station> adjacentStation = new ArrayList<>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLine() {
        return line;
    }
    public void setLine(String line) {
        this.line = line;
    }
    public Boolean getIsTransferStation() {
        return isTransferStation;
    }
    public void setIsTransferStation(Boolean isTransferStation) {
        this.isTransferStation = isTransferStation;
    }
    public List<String> getLines() {
        return lines;
    }
    public void setLines(List<String> lines) {
        this.lines = lines;
    }
    public List<Station> getAdjacentStation() {
        return adjacentStation;
    }
    public void setAdjacentStation(List<Station> adjacentStation) {
        this.adjacentStation = adjacentStation;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        else if(obj instanceof Station){
            Station s = (Station)obj;
            if(s.getName().equals(this.getName()))
                return true;
            else
                return false;
        }
        else
            return false;
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }

    public Station() {
        // TODO Auto-generated constructor stub
    }

    public Station(String s) {
        this.name = s;
    }

}