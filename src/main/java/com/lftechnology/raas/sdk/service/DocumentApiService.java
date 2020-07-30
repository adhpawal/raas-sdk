package com.lftechnology.raas.sdk.service;

import com.lftechnology.raas.sdk.dto.Document;
import com.lftechnology.raas.sdk.dto.DocumentResponse;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.UUID;

public interface DocumentApiService {

    @GET("senders/{senderId}/transactions/{transactionId}/invoice")
    Call<Document> get(@Path("senderId") UUID senderId, @Path("transactionId") UUID transactionId);

    @Multipart
    @POST("senders/{senderId}/documents")
    Call<DocumentResponse> upload(@Path("senderId") UUID senderId,  @PartMap() Map<String, RequestBody> partMap,
                                  @Part MultipartBody.Part file);

}
