public class City {
    private int id;
    private String name;
    private Commune commune;

    /*public City(int id, String name, Commune commune) {
        this.id = id;
        this.name = name;
        this.commune = commune;
    }*/

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", commune=" + commune +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Commune getCommune() {
        return commune;
    }
}
