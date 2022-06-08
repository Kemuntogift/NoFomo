
package com.kemunto.nofomo.models;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
@Generated("jsonschema2pojo")
public class SeatGeekEventsSearchResponse {

    @SerializedName("events")
    @Expose
    private List<Event> events = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SeatGeekEventsSearchResponse() {
    }

    /**
     * 
     * @param events
     */
    public SeatGeekEventsSearchResponse(List<Event> events) {
        super();
        this.events = events;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

}
