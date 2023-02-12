public class MeasuringStation {
    private int id;
    private String stCalcDate, stSourceDataDate, so2CalcDate, so2SourceDataDate,
    no2CalcDate, no2SourceDataDate, pm10CalcDate, pm10SourceDataDate, pm25CalcDate,
    pm25SourceDataDate, o3CalcDate, o3SourceDataDate, stIndexCrParam;

    private boolean stIndexStatus;

    private stIndexLevel stIndexLevel;
    private no2IndexLevel no2IndexLevel;
    private pm10IndexLevel pm10IndexLevel;
    private pm25IndexLevel pm25IndexLevel;
    private o3IndexLevel o3IndexLevel;
    private so2IndexLevel so2IndexLevel;

    @Override
    public String toString() {
        return "MeasuringStation{" +
                "id=" + id +
                ", stCalcDate='" + stCalcDate + '\'' +
                ", stSourceDataDate='" + stSourceDataDate + '\'' +
                ", so2CalcDate='" + so2CalcDate + '\'' +
                ", so2IndexLevel='" + so2IndexLevel + '\'' +
                ", so2SourceDataDate='" + so2SourceDataDate + '\'' +
                ", no2CalcDate='" + no2CalcDate + '\'' +
                ", no2SourceDataDate='" + no2SourceDataDate + '\'' +
                ", pm10CalcDate='" + pm10CalcDate + '\'' +
                ", pm10SourceDataDate='" + pm10SourceDataDate + '\'' +
                ", pm25CalcDate='" + pm25CalcDate + '\'' +
                ", pm25SourceDataDate='" + pm25SourceDataDate + '\'' +
                ", o3CalcDate='" + o3CalcDate + '\'' +
                ", o3SourceDataDate='" + o3SourceDataDate + '\'' +
                ", stIndexCrParam='" + stIndexCrParam + '\'' +
                ", stIndexStatus=" + stIndexStatus +
                ", stIndexLevel=" + stIndexLevel +
                ", no2IndexLevel=" + no2IndexLevel +
                ", pm10IndexLevel=" + pm10IndexLevel +
                ", pm25IndexLevel=" + pm25IndexLevel +
                ", o3IndexLevel=" + o3IndexLevel +
                '}';
    }

/*public MeasuringStation(int id, String stCalcDate, String stSourceDataDate, String so2CalcDate, String so2SourceDataDate, String no2CalcDate, String no2SourceDataDate, String pm10CalcDate, String pm10SourceDataDate, String pm25CalcDate, String pm25IndexLevel, String pm25SourceDataDate, String o3CalcDate, String o3SourceDataDate, String stIndexCrParam, boolean stIndexStatus, stIndexLevel stIndexLevel, so2IndexLevel so2IndexLevel, no2IndexLevel no2IndexLevel, pm10IndexLevel pm10IndexLevel, o3IndexLevel o3IndexLevel) {
        this.id = id;
        this.stCalcDate = stCalcDate;
        this.stSourceDataDate = stSourceDataDate;
        this.so2CalcDate = so2CalcDate;
        this.so2SourceDataDate = so2SourceDataDate;
        this.no2CalcDate = no2CalcDate;
        this.no2SourceDataDate = no2SourceDataDate;
        this.pm10CalcDate = pm10CalcDate;
        this.pm10SourceDataDate = pm10SourceDataDate;
        this.pm25CalcDate = pm25CalcDate;
        this.pm25IndexLevel = pm25IndexLevel;
        this.pm25SourceDataDate = pm25SourceDataDate;
        this.o3CalcDate = o3CalcDate;
        this.o3SourceDataDate = o3SourceDataDate;
        this.stIndexCrParam = stIndexCrParam;
        this.stIndexStatus = stIndexStatus;
        this.stIndexLevel = stIndexLevel;
        this.so2IndexLevel = so2IndexLevel;
        this.no2IndexLevel = no2IndexLevel;
        this.pm10IndexLevel = pm10IndexLevel;
        this.o3IndexLevel = o3IndexLevel;
    }*/


    public int getId() {
        return id;
    }

    public String getStCalcDate() {
        return stCalcDate;
    }

    public String getStSourceDataDate() {
        return stSourceDataDate;
    }

    public String getSo2CalcDate() {
        return so2CalcDate;
    }

    public so2IndexLevel getSo2IndexLevel() {
        return so2IndexLevel;
    }

    public String getSo2SourceDataDate() {
        return so2SourceDataDate;
    }

    public String getNo2CalcDate() {
        return no2CalcDate;
    }

    public String getNo2SourceDataDate() {
        return no2SourceDataDate;
    }

    public String getPm10CalcDate() {
        return pm10CalcDate;
    }

    public String getPm10SourceDataDate() {
        return pm10SourceDataDate;
    }

    public String getPm25CalcDate() {
        return pm25CalcDate;
    }

    public String getPm25SourceDataDate() {
        return pm25SourceDataDate;
    }

    public String getO3CalcDate() {
        return o3CalcDate;
    }

    public String getO3SourceDataDate() {
        return o3SourceDataDate;
    }

    public String getStIndexCrParam() {
        return stIndexCrParam;
    }

    public boolean isStIndexStatus() {
        return stIndexStatus;
    }

    public stIndexLevel getStIndexLevel() {
        return stIndexLevel;
    }

    public no2IndexLevel getNo2IndexLevel() {
        return no2IndexLevel;
    }

    public pm10IndexLevel getPm10IndexLevel() {
        return pm10IndexLevel;
    }

    public pm25IndexLevel getPm25IndexLevel() {
        return pm25IndexLevel;
    }

    public o3IndexLevel getO3IndexLevel() {
        return o3IndexLevel;
    }
}
