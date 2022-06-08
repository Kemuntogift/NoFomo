
package com.kemunto.nofomo.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
@Generated("jsonschema2pojo")
public class Genre {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("primary")
    @Expose
    private Boolean primary;
    @SerializedName("images")
    @Expose
    private Images__1 images;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("document_source")
    @Expose
    private DocumentSource__1 documentSource;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Genre() {
    }

    /**
     * 
     * @param image
     * @param images
     * @param name
     * @param id
     * @param slug
     * @param primary
     * @param documentSource
     */
    public Genre(Integer id, String name, String slug, Boolean primary, Images__1 images, String image, DocumentSource__1 documentSource) {
        super();
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.primary = primary;
        this.images = images;
        this.image = image;
        this.documentSource = documentSource;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Boolean getPrimary() {
        return primary;
    }

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    public Images__1 getImages() {
        return images;
    }

    public void setImages(Images__1 images) {
        this.images = images;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public DocumentSource__1 getDocumentSource() {
        return documentSource;
    }

    public void setDocumentSource(DocumentSource__1 documentSource) {
        this.documentSource = documentSource;
    }

}
