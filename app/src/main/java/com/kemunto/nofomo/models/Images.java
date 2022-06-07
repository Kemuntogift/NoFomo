
package com.kemunto.nofomo.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Images {

    @SerializedName("huge")
    @Expose
    private String huge;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Images() {
    }

    /**
     * 
     * @param huge
     */
    public Images(String huge) {
        super();
        this.huge = huge;
    }

    public String getHuge() {
        return huge;
    }

    public void setHuge(String huge) {
        this.huge = huge;
    }

}
