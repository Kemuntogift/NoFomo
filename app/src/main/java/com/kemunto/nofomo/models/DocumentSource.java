
package com.kemunto.nofomo.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

//@Parcel
@Generated("jsonschema2pojo")
public class DocumentSource {

    @SerializedName("source_type")
    @Expose
    private String sourceType;
    @SerializedName("generation_type")
    @Expose
    private String generationType;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DocumentSource() {
    }

    /**
     * 
     * @param generationType
     * @param sourceType
     */
    public DocumentSource(String sourceType, String generationType) {
        super();
        this.sourceType = sourceType;
        this.generationType = generationType;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getGenerationType() {
        return generationType;
    }

    public void setGenerationType(String generationType) {
        this.generationType = generationType;
    }

}
