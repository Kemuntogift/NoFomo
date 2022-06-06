
package com.kemunto.nofomo.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.kemunto.nofomo.models.DocumentSource;

import org.parceler.Parcel;

@Parcel
@Generated("jsonschema2pojo")
public class Taxonomy {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("parent_id")
    @Expose
    private Integer parentId;
    @SerializedName("document_source")
    @Expose
    private DocumentSource documentSource;
    @SerializedName("rank")
    @Expose
    private Integer rank;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Taxonomy() {
    }

    /**
     * 
     * @param name
     * @param rank
     * @param id
     * @param parentId
     * @param documentSource
     */
    public Taxonomy(Integer id, String name, Integer parentId, DocumentSource documentSource, Integer rank) {
        super();
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.documentSource = documentSource;
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

    public DocumentSource getDocumentSource() {
        return documentSource;
    }

    public void setDocumentSource(DocumentSource documentSource) {
        this.documentSource = documentSource;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

}
