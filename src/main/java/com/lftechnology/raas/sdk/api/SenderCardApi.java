package com.lftechnology.raas.sdk.api;

import com.lftechnology.raas.sdk.dto.SenderCard;
import com.lftechnology.raas.sdk.exception.ApiException;
import com.lftechnology.raas.sdk.pojo.ListResponse;
import com.lftechnology.raas.sdk.service.SenderCardApiService;
import com.lftechnology.raas.sdk.service.SenderCardApiService;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

public class SenderCardApi {

    private RequestApi requestApi;

    public SenderCardApi(String baseUrl, Map<String, String> headerMap) {
        this.requestApi = new RequestApi(baseUrl, headerMap);
    }

    public ListResponse<SenderCard> list(String senderId, String type) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        SenderCardApiService service = retrofit.create(SenderCardApiService.class);
        Call<ListResponse<SenderCard>> call = service.listSenderCards(senderId, type);
        try {
            Response<ListResponse<SenderCard>> response = call.execute();
            if (!response.isSuccessful()) {
                throw new ApiException(response.errorBody().string());
            }
            return response.body();
        } catch (IOException e) {
            throw new ApiException();
        }
    }

    public void delete(String senderId, String cardId) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        SenderCardApiService service = retrofit.create(SenderCardApiService.class);
        Call<Void> call = service.deleteSenderCard(senderId,cardId);
        try {
            Response<Void> response = call.execute();
            if (!response.isSuccessful()) {
                throw new ApiException(response.errorBody().string());
            }
        } catch (IOException e) {
            throw new ApiException("Could not delete Sender Card. Error in Raas SDK.");
        }
    }

    public SenderCard getSenderCard(String senderId, String cardId) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        SenderCardApiService service = retrofit.create(SenderCardApiService.class);
        Call<SenderCard> call = service.getSenderCard(senderId, cardId);
        try {
            Response<SenderCard> response = call.execute();
            if (!response.isSuccessful()) {
                throw new ApiException(response.errorBody().string());
            }
            return response.body();
        } catch (IOException e) {
            throw new ApiException();
        }
    }
}
