
package com.kemunto.nofomo.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Stats {

    @SerializedName("event_count")
    @Expose
    private Integer eventCount;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Stats() {
    }

    /**
     * 
     * @param eventCount
     */
    public Stats(Integer eventCount) {
        super();
        this.eventCount = eventCount;
    }

    public Integer getEventCount() {
        return eventCount;
    }

    public void setEventCount(Integer eventCount) {
        this.eventCount = eventCount;
    }

}
