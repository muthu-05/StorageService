package com.mbox.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:google.properties")
public class GoogleProperties {

    @Value("${googleProperties.clientId}")
    private String clientId;
    @Value("${googleProperties.clientSecret}")
    private String clientSecret;
    @Value("${googleProperties.redirectUrl}")
    private String redirectUrl;
    @Value("${googleProperties.responsetype}")
    private String responseType;
    @Value("${googleProperties.granttype}")
    private String grantType;
    @Value("${googleProperties.scope}")
    private String scope;
    @Value("${googleProperties.loginUrl}")
    private String loginUrl;
    @Value("${googleProperties.tokenUrl}")
    private String tokenUrl;
    @Value("${googleProperties.contenttype}")
    private String contentType;
    @Value("${googleProperties.profileurl}")
    private String profileUrl;

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getClientSecret() {
        return clientSecret;

    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String getTokenUrl() {
        return tokenUrl;
    }

    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }
}