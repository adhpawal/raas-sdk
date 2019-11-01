package com.lftechnology.raas.sdk.service;

import com.lftechnology.raas.sdk.dto.Payer;
import com.lftechnology.raas.sdk.pojo.ListResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PayerApiService {

    @GET("payers")
    Call<ListResponse<Payer>> list(@Query("country") String country);

    @GET("payers/{payerId}")
    Call<Payer> get(@Path("payerId") String id);
}
