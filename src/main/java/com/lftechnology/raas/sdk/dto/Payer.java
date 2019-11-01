package com.lftechnology.raas.sdk.dto;

import java.util.List;

public class Payer {
    private long id;

    private String name;

    private String receivingCurrency;

    private String code;

    private String country;

    private String address;

    private String phoneNumber;

    private String website;

    private String agentListUrl;

    private List<String> networkLimit;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReceivingCurrency() {
        return receivingCurrency;
    }

    public void setReceivingCurrency(String receivingCurrency) {
        this.receivingCurrency = receivingCurrency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAgentListUrl() {
        return agentListUrl;
    }

    public void setAgentListUrl(String agentListUrl) {
        this.agentListUrl = agentListUrl;
    }

    public List<String> getNetworkLimit() {
        return networkLimit;
    }

    public void setNetworkLimit(List<String> networkLimit) {
        this.networkLimit = networkLimit;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Payer{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", receivingCurrency='").append(receivingCurrency).append('\'');
        sb.append(", code='").append(code).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", agentListUrl='").append(agentListUrl).append('\'');
        sb.append(", networkLimit=").append(networkLimit);
        sb.append('}');
        return sb.toString();
    }
}
