package org.launchcode.studio7;

public abstract class BaseDisc {
    private String name;
    private float capacity;
    private String type;
    private boolean reWritable;

    public BaseDisc(String name, float capacity, String type, boolean reWritable) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isReWritable() {
        return reWritable;
    }

    public void setReWritable(boolean reWritable) {
        this.reWritable = reWritable;
    }

    void reportInformation() {

    }
}