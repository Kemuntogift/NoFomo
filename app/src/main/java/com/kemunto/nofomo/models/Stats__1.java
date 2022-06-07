
package com.kemunto.nofomo.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Stats__1 {

    @SerializedName("listing_count")
    @Expose
    private Object listingCount;
    @SerializedName("average_price")
    @Expose
    private Object averagePrice;
    @SerializedName("lowest_price_good_deals")
    @Expose
    private Object lowestPriceGoodDeals;
    @SerializedName("lowest_price")
    @Expose
    private Object lowestPrice;
    @SerializedName("highest_price")
    @Expose
    private Object highestPrice;
    @SerializedName("visible_listing_count")
    @Expose
    private Object visibleListingCount;
    @SerializedName("dq_bucket_counts")
    @Expose
    private Object dqBucketCounts;
    @SerializedName("median_price")
    @Expose
    private Object medianPrice;
    @SerializedName("lowest_sg_base_price")
    @Expose
    private Object lowestSgBasePrice;
    @SerializedName("lowest_sg_base_price_good_deals")
    @Expose
    private Object lowestSgBasePriceGoodDeals;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Stats__1() {
    }

    /**
     * 
     * @param visibleListingCount
     * @param highestPrice
     * @param medianPrice
     * @param lowestPriceGoodDeals
     * @param lowestPrice
     * @param listingCount
     * @param dqBucketCounts
     * @param averagePrice
     * @param lowestSgBasePrice
     * @param lowestSgBasePriceGoodDeals
     */
    public Stats__1(Object listingCount, Object averagePrice, Object lowestPriceGoodDeals, Object lowestPrice, Object highestPrice, Object visibleListingCount, Object dqBucketCounts, Object medianPrice, Object lowestSgBasePrice, Object lowestSgBasePriceGoodDeals) {
        super();
        this.listingCount = listingCount;
        this.averagePrice = averagePrice;
        this.lowestPriceGoodDeals = lowestPriceGoodDeals;
        this.lowestPrice = lowestPrice;
        this.highestPrice = highestPrice;
        this.visibleListingCount = visibleListingCount;
        this.dqBucketCounts = dqBucketCounts;
        this.medianPrice = medianPrice;
        this.lowestSgBasePrice = lowestSgBasePrice;
        this.lowestSgBasePriceGoodDeals = lowestSgBasePriceGoodDeals;
    }

    public Object getListingCount() {
        return listingCount;
    }

    public void setListingCount(Object listingCount) {
        this.listingCount = listingCount;
    }

    public Object getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(Object averagePrice) {
        this.averagePrice = averagePrice;
    }

    public Object getLowestPriceGoodDeals() {
        return lowestPriceGoodDeals;
    }

    public void setLowestPriceGoodDeals(Object lowestPriceGoodDeals) {
        this.lowestPriceGoodDeals = lowestPriceGoodDeals;
    }

    public Object getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(Object lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public Object getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(Object highestPrice) {
        this.highestPrice = highestPrice;
    }

    public Object getVisibleListingCount() {
        return visibleListingCount;
    }

    public void setVisibleListingCount(Object visibleListingCount) {
        this.visibleListingCount = visibleListingCount;
    }

    public Object getDqBucketCounts() {
        return dqBucketCounts;
    }

    public void setDqBucketCounts(Object dqBucketCounts) {
        this.dqBucketCounts = dqBucketCounts;
    }

    public Object getMedianPrice() {
        return medianPrice;
    }

    public void setMedianPrice(Object medianPrice) {
        this.medianPrice = medianPrice;
    }

    public Object getLowestSgBasePrice() {
        return lowestSgBasePrice;
    }

    public void setLowestSgBasePrice(Object lowestSgBasePrice) {
        this.lowestSgBasePrice = lowestSgBasePrice;
    }

    public Object getLowestSgBasePriceGoodDeals() {
        return lowestSgBasePriceGoodDeals;
    }

    public void setLowestSgBasePriceGoodDeals(Object lowestSgBasePriceGoodDeals) {
        this.lowestSgBasePriceGoodDeals = lowestSgBasePriceGoodDeals;
    }

}
