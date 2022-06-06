
package com.kemunto.nofomo.models;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.kemunto.nofomo.Location__1;

import org.parceler.Parcel;

@Parcel
@Generated("jsonschema2pojo")
public class Performer {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("divisions")
    @Expose
    private Object divisions;
    @SerializedName("has_upcoming_events")
    @Expose
    private Boolean hasUpcomingEvents;
    @SerializedName("primary")
    @Expose
    private Boolean primary;
    @SerializedName("stats")
    @Expose
    private Stats stats;
    @SerializedName("taxonomies")
    @Expose
    private List<Taxonomy> taxonomies = null;
    @SerializedName("image_attribution")
    @Expose
    private String imageAttribution;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("score")
    @Expose
    private Double score;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("home_venue_id")
    @Expose
    private Integer homeVenueId;
    @SerializedName("short_name")
    @Expose
    private String shortName;
    @SerializedName("num_upcoming_events")
    @Expose
    private Integer numUpcomingEvents;
    @SerializedName("colors")
    @Expose
    private Object colors;
    @SerializedName("image_license")
    @Expose
    private Object imageLicense;
    @SerializedName("genres")
    @Expose
    private List<Genre> genres = null;
    @SerializedName("popularity")
    @Expose
    private Integer popularity;
    @SerializedName("location")
    @Expose
    private Location__1 location;
    @SerializedName("image_rights_message")
    @Expose
    private String imageRightsMessage;
    @SerializedName("home_team")
    @Expose
    private Boolean homeTeam;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Performer() {
    }

    /**
     * 
     * @param image
     * @param images
     * @param imageRightsMessage
     * @param type
     * @param imageAttribution
     * @param divisions
     * @param url
     * @param colors
     * @param score
     * @param stats
     * @param taxonomies
     * @param numUpcomingEvents
     * @param genres
     * @param popularity
     * @param name
     * @param homeTeam
     * @param location
     * @param id
     * @param homeVenueId
     * @param shortName
     * @param hasUpcomingEvents
     * @param slug
     * @param primary
     * @param imageLicense
     */
    public Performer(String type, String name, String image, Integer id, Images images, Object divisions, Boolean hasUpcomingEvents, Boolean primary, Stats stats, List<Taxonomy> taxonomies, String imageAttribution, String url, Double score, String slug, Integer homeVenueId, String shortName, Integer numUpcomingEvents, Object colors, Object imageLicense, List<Genre> genres, Integer popularity, Location__1 location, String imageRightsMessage, Boolean homeTeam) {
        super();
        this.type = type;
        this.name = name;
        this.image = image;
        this.id = id;
        this.images = images;
        this.divisions = divisions;
        this.hasUpcomingEvents = hasUpcomingEvents;
        this.primary = primary;
        this.stats = stats;
        this.taxonomies = taxonomies;
        this.imageAttribution = imageAttribution;
        this.url = url;
        this.score = score;
        this.slug = slug;
        this.homeVenueId = homeVenueId;
        this.shortName = shortName;
        this.numUpcomingEvents = numUpcomingEvents;
        this.colors = colors;
        this.imageLicense = imageLicense;
        this.genres = genres;
        this.popularity = popularity;
        this.location = location;
        this.imageRightsMessage = imageRightsMessage;
        this.homeTeam = homeTeam;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public Object getDivisions() {
        return divisions;
    }

    public void setDivisions(Object divisions) {
        this.divisions = divisions;
    }

    public Boolean getHasUpcomingEvents() {
        return hasUpcomingEvents;
    }

    public void setHasUpcomingEvents(Boolean hasUpcomingEvents) {
        this.hasUpcomingEvents = hasUpcomingEvents;
    }

    public Boolean getPrimary() {
        return primary;
    }

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public List<Taxonomy> getTaxonomies() {
        return taxonomies;
    }

    public void setTaxonomies(List<Taxonomy> taxonomies) {
        this.taxonomies = taxonomies;
    }

    public String getImageAttribution() {
        return imageAttribution;
    }

    public void setImageAttribution(String imageAttribution) {
        this.imageAttribution = imageAttribution;
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

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Integer getHomeVenueId() {
        return homeVenueId;
    }

    public void setHomeVenueId(Integer homeVenueId) {
        this.homeVenueId = homeVenueId;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Integer getNumUpcomingEvents() {
        return numUpcomingEvents;
    }

    public void setNumUpcomingEvents(Integer numUpcomingEvents) {
        this.numUpcomingEvents = numUpcomingEvents;
    }

    public Object getColors() {
        return colors;
    }

    public void setColors(Object colors) {
        this.colors = colors;
    }

    public Object getImageLicense() {
        return imageLicense;
    }

    public void setImageLicense(Object imageLicense) {
        this.imageLicense = imageLicense;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public Location__1 getLocation() {
        return location;
    }

    public void setLocation(Location__1 location) {
        this.location = location;
    }

    public String getImageRightsMessage() {
        return imageRightsMessage;
    }

    public void setImageRightsMessage(String imageRightsMessage) {
        this.imageRightsMessage = imageRightsMessage;
    }

    public Boolean getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Boolean homeTeam) {
        this.homeTeam = homeTeam;
    }

}
