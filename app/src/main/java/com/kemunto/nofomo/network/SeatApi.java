package com.kemunto.nofomo.network;

import com.kemunto.nofomo.models.SeatGeekEventsSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SeatApi {
    @GET("events")
    Call<SeatGeekEventsSearchResponse> getOccasions(
            @Query("type") String type,
            @Query("q") String q
    );
}
