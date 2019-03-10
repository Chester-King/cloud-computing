package com.example.amazonians.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Current {

    @SerializedName("last_updated_epoch")
    @Expose
    private long last_updated_epoch;
    @SerializedName("last_updated")
    @Expose
    private String last_updated;
    @SerializedName("temp_c")
    @Expose
    private float temp_c;
    @SerializedName("temp_f")
    @Expose
    private float temp_f;
    @SerializedName("is_day")
    @Expose
    private int is_day;
    @SerializedName("condition")
    @Expose
    private ConditionModel condition;
    @SerializedName("wind_mph")
    @Expose
    private float wind_mph;
    @SerializedName("wind_kph")
    @Expose
    private float wind_kph;
    @SerializedName("wind_degree")
    @Expose
    private float wind_degree;
    @SerializedName("wind_dir")
    @Expose
    private String wind_dir;
    @SerializedName("pressure_mb")
    @Expose
    private float pressure_mb;
    @SerializedName("pressure_in")
    @Expose
    private float pressure_in;
    @SerializedName("precip_mm")
    @Expose
    private float precip_mm;
    @SerializedName("precip_in")
    @Expose
    private float precip_in;
    @SerializedName("humidity")
    @Expose
    private float humidity;
    @SerializedName("cloud")
    @Expose
    private float cloud;
    @SerializedName("feelslike_c")
    @Expose
    private float feelslike_c;
    @SerializedName("feelslike_f")
    @Expose
    private float feelslike_f;
    @SerializedName("vis_km")
    @Expose
    private float vis_km;
    @SerializedName("vis_miles")
    @Expose
    private float vis_miles;
    @SerializedName("uv")
    @Expose
    private float uv;

    public long getLast_updated_epoch() {
        return last_updated_epoch;
    }

    public void setLast_updated_epoch(long last_updated_epoch) {
        this.last_updated_epoch = last_updated_epoch;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public float getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(float temp_c) {
        this.temp_c = temp_c;
    }

    public float getTemp_f() {
        return temp_f;
    }

    public void setTemp_f(float temp_f) {
        this.temp_f = temp_f;
    }

    public int getIs_day() {
        return is_day;
    }

    public void setIs_day(int is_day) {
        this.is_day = is_day;
    }

    public ConditionModel getCondition() {
        return condition;
    }

    public void setCondition(ConditionModel condition) {
        this.condition = condition;
    }

    public float getWind_mph() {
        return wind_mph;
    }

    public void setWind_mph(float wind_mph) {
        this.wind_mph = wind_mph;
    }

    public float getWind_kph() {
        return wind_kph;
    }

    public void setWind_kph(float wind_kph) {
        this.wind_kph = wind_kph;
    }

    public float getWind_degree() {
        return wind_degree;
    }

    public void setWind_degree(float wind_degree) {
        this.wind_degree = wind_degree;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public float getPressure_mb() {
        return pressure_mb;
    }

    public void setPressure_mb(float pressure_mb) {
        this.pressure_mb = pressure_mb;
    }

    public float getPressure_in() {
        return pressure_in;
    }

    public void setPressure_in(float pressure_in) {
        this.pressure_in = pressure_in;
    }

    public float getPrecip_mm() {
        return precip_mm;
    }

    public void setPrecip_mm(float precip_mm) {
        this.precip_mm = precip_mm;
    }

    public float getPrecip_in() {
        return precip_in;
    }

    public void setPrecip_in(float precip_in) {
        this.precip_in = precip_in;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getCloud() {
        return cloud;
    }

    public void setCloud(float cloud) {
        this.cloud = cloud;
    }

    public float getFeelslike_c() {
        return feelslike_c;
    }

    public void setFeelslike_c(float feelslike_c) {
        this.feelslike_c = feelslike_c;
    }

    public float getFeelslike_f() {
        return feelslike_f;
    }

    public void setFeelslike_f(float feelslike_f) {
        this.feelslike_f = feelslike_f;
    }

    public float getVis_km() {
        return vis_km;
    }

    public void setVis_km(float vis_km) {
        this.vis_km = vis_km;
    }

    public float getVis_miles() {
        return vis_miles;
    }

    public void setVis_miles(float vis_miles) {
        this.vis_miles = vis_miles;
    }

    public float getUv() {
        return uv;
    }

    public void setUv(float uv) {
        this.uv = uv;
    }
}
