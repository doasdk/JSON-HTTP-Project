public class AllStations {
    private int id;
    private String stationName, gegrLat, gegrLon,addressStreet;
    private City city;

    /*public AllStations(int id, String stationName, String gegrLat, String gegrLon, String addressStreet, City city) {
        this.id = id;
        this.stationName = stationName;
        this.gegrLat = gegrLat;
        this.gegrLon = gegrLon;
        this.addressStreet = addressStreet;
        this.city = city;
    }*/


    @Override
    public String toString() {
        return "AllStations{" +
                "id=" + id +
                ", stationName='" + stationName + '\'' +
                ", gegrLat='" + gegrLat + '\'' +
                ", gegrLon='" + gegrLon + '\'' +
                ", addressStreet='" + addressStreet + '\'' +
                ", city=" + city +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getStationName() {
        return stationName;
    }

    public String getGegrLat() {
        return gegrLat;
    }

    public String getGegrLon() {
        return gegrLon;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public City getCity() {
        return city;
    }
}
