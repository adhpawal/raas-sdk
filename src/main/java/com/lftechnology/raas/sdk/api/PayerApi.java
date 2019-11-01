package com.lftechnology.raas.sdk.api;

import com.lftechnology.raas.sdk.dto.Payer;
import com.lftechnology.raas.sdk.exception.ApiException;
import com.lftechnology.raas.sdk.pojo.ListResponse;
import com.lftechnology.raas.sdk.service.PayerApiService;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.Map;

public class PayerApi {
    private RequestApi requestApi;

    public PayerApi(String baseUrl, Map<String, String> headerMap) {
        this.requestApi = new RequestApi(baseUrl, headerMap);
    }

    public Payer getById(String id) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        PayerApiService service = retrofit.create(PayerApiService.class);
        Call<Payer> call = service.get(id);
        return executeApiCall(call);
    }

    public ListResponse<Payer> list(String country) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        PayerApiService service = retrofit.create(PayerApiService.class);
        Call<ListResponse<Payer>> call = service.list(country);
        try {
            Response<ListResponse<Payer>> response = call.execute();
            if (!response.isSuccessful()) {
                throw new ApiException(response.errorBody().string());
            }
            return response.body();
        } catch (IOException e) {
            throw new ApiException();
        }
    }

    private Payer executeApiCall(Call<Payer> call) {
        try {
            Response<Payer> response = call.execute();
            if (!response.isSuccessful()) {
                throw new ApiException(response.errorBody().string());
            }
            return response.body();
        } catch (IOException e) {
            throw new ApiException();
        }
    }
}
