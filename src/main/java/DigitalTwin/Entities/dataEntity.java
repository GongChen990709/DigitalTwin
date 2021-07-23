package DigitalTwin.Entities;

public class dataEntity {
    private int tag_index;
    private String description;
    private String data_collect_date_time;
    private double tagvalue;
    private int plant_id;


    public int getPlant_id() {
        return plant_id;
    }

    public void setPlant_id(int plant_id) {
        this.plant_id = plant_id;
    }

    public int getTag_index() {
        return tag_index;
    }

    public void setTag_index(int tag_index) {
        this.tag_index = tag_index;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getData_collect_date_time() {
        return data_collect_date_time;
    }

    public void setData_collect_date_time(String data_collect_date_time) {
        this.data_collect_date_time = data_collect_date_time;
    }

    public double getTagvalue() {
        return tagvalue;
    }

    public void setTagvalue(double tagvalue) {
        this.tagvalue = tagvalue;
    }

    public dataEntity(int tag_index, String description, String data_collect_date_time, double tagvalue, int plant_id) {
        this.tag_index = tag_index;
        this.description = description;
        this.data_collect_date_time = data_collect_date_time;
        this.tagvalue = tagvalue;
        this.plant_id = plant_id;
    }

    public dataEntity(){}


    @Override
    public String toString() {
        return "dataEntity{" +
                "tag_index=" + tag_index +
                ", description='" + description + '\'' +
                ", data_collect_date_time='" + data_collect_date_time + '\'' +
                ", tagvalue=" + tagvalue +
                ", plant_id=" + plant_id +
                '}';
    }
}
