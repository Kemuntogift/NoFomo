
package com.kemunto.nofomo.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
@Generated("jsonschema2pojo")
public class Taxonomy__1 {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("parent_id")
    @Expose
    private Integer parentId;
    @SerializedName("rank")
    @Expose
    private Integer rank;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Taxonomy__1() {
    }

    /**
     * 
     * @param name
     * @param rank
     * @param id
     * @param parentId
     */
    public Taxonomy__1(Integer id, String name, Integer parentId, Integer rank) {
        super();
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.rank = rank;
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

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

}
