package com.lftechnology.raas.sdk.api;

import com.lftechnology.raas.sdk.constants.CommonConstant;
import com.lftechnology.raas.sdk.dto.Document;
import com.lftechnology.raas.sdk.exception.ApiException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DocumentApiTest {
    private String baseUrl = "https://test.api.machpay.com/v2/";

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldThrowApiExceptionWhenForInvalidCredentials() {
        //Given
        CompanyCountryApi companyCountryApi = new CompanyCountryApi(this.baseUrl, getInvalidHeader());

        //When-Then
        thrown.expect(ApiException.class);
        companyCountryApi.list();
    }

    @Test
    public void testList() {
        //Given
        DocumentApi documentApi = new DocumentApi(this.baseUrl,getInvalidHeader());

        Document document = documentApi.getInvoiceLink(UUID.fromString("f9f27b82-b56b-4924-abf5-2db2f5df6965")
                ,UUID.fromString("28d01d75-ab81-4c43-b028-3d0756cf27d8"));

        System.out.println(document.toString());
        //Then
        Assert.assertNotNull(document);
    }

    private Map<String,String> getInvalidHeader(){
        Map<String,String> headers = new HashMap<>();
        headers.put(CommonConstant.HTTP_CLIENT_ID, "rebtel_id");
        headers.put(CommonConstant.HTTP_CLIENT_SECRET, "rebtel_secret");
        return headers;
    }
}
