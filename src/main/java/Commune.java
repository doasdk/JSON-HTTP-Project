public class Commune {
    private String communeName, districtName, provinceName;

   /* public Commune(String communeName, String districtName, String provinceName) {
        this.communeName = communeName;
        this.districtName = districtName;
        this.provinceName = provinceName;
    }*/

    @Override
    public String toString() {
        return "Commune{" +
                "communeName='" + communeName + '\'' +
                ", districtName='" + districtName + '\'' +
                ", provinceName='" + provinceName + '\'' +
                '}';
    }

    public String getCommuneName() {
        return communeName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public String getProvinceName() {
        return provinceName;
    }
}
