package com.lftechnology.raas.sdk.service;

import com.lftechnology.raas.sdk.dto.SenderCard;
import com.lftechnology.raas.sdk.pojo.ListResponse;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface SenderCardApiService {

    @GET("senders/{senderId}/funding-sources")
    Call<ListResponse<SenderCard>> listSenderCards(@Path("senderId") String senderId, @Query("type") String type);

    @GET("senders/{senderId}/funding-sources/{accountId}")
    Call<SenderCard> getSenderCard(@Path("senderId") String senderId, @Path("accountId") String accountId);

    @DELETE("senders/{senderId}/funding-sources/{accountId}")
    Call<Void> deleteSenderCard(@Path("senderId") String senderId, @Path("accountId") String accountId);
}
