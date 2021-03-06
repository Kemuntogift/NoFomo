
package com.kemunto.nofomo.models;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
@Generated("jsonschema2pojo")
public class Venue {

    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("name_v2")
    @Expose
    private String nameV2;
    @SerializedName("postal_code")
    @Expose
    private String postalCode;
    @SerializedName("name")
    @Expose
    private String name;
//    @SerializedName("links")
//    @Expose
//    private List<Object> links = null;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("score")
    @Expose
    private Double score;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("has_upcoming_events")
    @Expose
    private Boolean hasUpcomingEvents;
    @SerializedName("num_upcoming_events")
    @Expose
    private Integer numUpcomingEvents;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("extended_address")
    @Expose
    private String extendedAddress;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("popularity")
    @Expose
    private Integer popularity;
//    @SerializedName("access_method")
//    @Expose
//    private Object accessMethod;
    @SerializedName("metro_code")
    @Expose
    private Integer metroCode;
    @SerializedName("capacity")
    @Expose
    private Integer capacity;
    @SerializedName("display_location")
    @Expose
    private String displayLocation;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Venue() {
    }

    /**
     * 
     * @param accessMethod
     * @param country
     * @param address
     * @param displayLocation
     * @param city
     * @param timezone
     * @param postalCode
     * @param extendedAddress
     * @param url
     * @param capacity
     * @param score
     * @param numUpcomingEvents
     * @param popularity
     * @param metroCode
     * @param nameV2
     * @param name
     * @param links
     * @param location
     * @param state
     * @param id
     * @param hasUpcomingEvents
     * @param slug
     */
//    public Venue(String state, String nameV2, String postalCode, String name, List<Object> links, String timezone, String url, Double score, Location location, String address, String country, Boolean hasUpcomingEvents, Integer numUpcomingEvents, String city, String slug, String extendedAddress, Integer id, Integer popularity, Object accessMethod, Integer metroCode, Integer capacity, String displayLocation) {
//        super();
//        this.state = state;
//        this.nameV2 = nameV2;
//        this.postalCode = postalCode;
//        this.name = name;
//        this.links = links;
//        this.timezone = timezone;
//        this.url = url;
//        this.score = score;
//        this.location = location;
//        this.address = address;
//        this.country = country;
//        this.hasUpcomingEvents = hasUpcomingEvents;
//        this.numUpcomingEvents = numUpcomingEvents;
//        this.city = city;
//        this.slug = slug;
//        this.extendedAddress = extendedAddress;
//        this.id = id;
//        this.popularity = popularity;
//        this.accessMethod = accessMethod;
//        this.metroCode = metroCode;
//        this.capacity = capacity;
//        this.displayLocation = displayLocation;
//    }
//
//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public String getNameV2() {
//        return nameV2;
//    }
//
//    public void setNameV2(String nameV2) {
//        this.nameV2 = nameV2;
//    }
//
//    public String getPostalCode() {
//        return postalCode;
//    }
//
//    public void setPostalCode(String postalCode) {
//        this.postalCode = postalCode;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public List<Object> getLinks() {
//        return links;
//    }
//
//    public void setLinks(List<Object> links) {
//        this.links = links;
//    }
//
//    public String getTimezone() {
//        return timezone;
//    }
//
//    public void setTimezone(String timezone) {
//        this.timezone = timezone;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public Double getScore() {
//        return score;
//    }
//
//    public void setScore(Double score) {
//        this.score = score;
//    }
//
//    public Location getLocation() {
//        return location;
//    }
//
//    public void setLocation(Location location) {
//        this.location = location;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public Boolean getHasUpcomingEvents() {
//        return hasUpcomingEvents;
//    }
//
//    public void setHasUpcomingEvents(Boolean hasUpcomingEvents) {
//        this.hasUpcomingEvents = hasUpcomingEvents;
//    }
//
//    public Integer getNumUpcomingEvents() {
//        return numUpcomingEvents;
//    }
//
//    public void setNumUpcomingEvents(Integer numUpcomingEvents) {
//        this.numUpcomingEvents = numUpcomingEvents;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getSlug() {
//        return slug;
//    }
//
//    public void setSlug(String slug) {
//        this.slug = slug;
//    }
//
//    public String getExtendedAddress() {
//        return extendedAddress;
//    }
//
//    public void setExtendedAddress(String extendedAddress) {
//        this.extendedAddress = extendedAddress;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Integer getPopularity() {
//        return popularity;
//    }
//
//    public void setPopularity(Integer popularity) {
//        this.popularity = popularity;
//    }
//
//    public Object getAccessMethod() {
//        return accessMethod;
//    }
//
//    public void setAccessMethod(Object accessMethod) {
//        this.accessMethod = accessMethod;
//    }
//
//    public Integer getMetroCode() {
//        return metroCode;
//    }
//
//    public void setMetroCode(Integer metroCode) {
//        this.metroCode = metroCode;
//    }
//
//    public Integer getCapacity() {
//        return capacity;
//    }
//
//    public void setCapacity(Integer capacity) {
//        this.capacity = capacity;
//    }
//
//    public String getDisplayLocation() {
//        return displayLocation;
//    }
//
//    public void setDisplayLocation(String displayLocation) {
//        this.displayLocation = displayLocation;
//    }

    public Venue(String state, String nameV2, String postalCode, String name, String timezone, String url, Double score, Location location, String address, String country, Boolean hasUpcomingEvents, Integer numUpcomingEvents, String city, String slug, String extendedAddress, Integer id, Integer popularity, Integer metroCode, Integer capacity, String displayLocation) {
        this.state = state;
        this.nameV2 = nameV2;
        this.postalCode = postalCode;
        this.name = name;
        this.timezone = timezone;
        this.url = url;
        this.score = score;
        this.location = location;
        this.address = address;
        this.country = country;
        this.hasUpcomingEvents = hasUpcomingEvents;
        this.numUpcomingEvents = numUpcomingEvents;
        this.city = city;
        this.slug = slug;
        this.extendedAddress = extendedAddress;
        this.id = id;
        this.popularity = popularity;
        this.metroCode = metroCode;
        this.capacity = capacity;
        this.displayLocation = displayLocation;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getNameV2() {
        return nameV2;
    }

    public void setNameV2(String nameV2) {
        this.nameV2 = nameV2;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getHasUpcomingEvents() {
        return hasUpcomingEvents;
    }

    public void setHasUpcomingEvents(Boolean hasUpcomingEvents) {
        this.hasUpcomingEvents = hasUpcomingEvents;
    }

    public Integer getNumUpcomingEvents() {
        return numUpcomingEvents;
    }

    public void setNumUpcomingEvents(Integer numUpcomingEvents) {
        this.numUpcomingEvents = numUpcomingEvents;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getExtendedAddress() {
        return extendedAddress;
    }

    public void setExtendedAddress(String extendedAddress) {
        this.extendedAddress = extendedAddress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public Integer getMetroCode() {
        return metroCode;
    }

    public void setMetroCode(Integer metroCode) {
        this.metroCode = metroCode;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getDisplayLocation() {
        return displayLocation;
    }

    public void setDisplayLocation(String displayLocation) {
        this.displayLocation = displayLocation;
    }
}
