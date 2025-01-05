# SettingsApi

All URIs are relative to *https://connectors-admin.lilt.com/api/v1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**servicesApiSettingsGetSettings**](SettingsApi.md#servicesApiSettingsGetSettings) | **GET** /settings | Retrieve the settings. |
| [**servicesApiSettingsUpdateSettings**](SettingsApi.md#servicesApiSettingsUpdateSettings) | **PUT** /settings | Update the settings. |


<a id="servicesApiSettingsGetSettings"></a>
# **servicesApiSettingsGetSettings**
> SettingsResponse servicesApiSettingsGetSettings()

Retrieve the settings.

### Example
```java
// Import classes:
import LiltConnectorSDK.ApiClient;
import LiltConnectorSDK.ApiException;
import LiltConnectorSDK.Configuration;
import LiltConnectorSDK.auth.*;
import LiltConnectorSDK.models.*;
import org.openapitools.client.api.SettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://connectors-admin.lilt.com/api/v1.0");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SettingsApi apiInstance = new SettingsApi(defaultClient);
    try {
      SettingsResponse result = apiInstance.servicesApiSettingsGetSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsApi#servicesApiSettingsGetSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SettingsResponse**](SettingsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The settings response. |  -  |
| **400** | The Bad Request response. |  -  |
| **401** | The Unauthorized response. |  -  |
| **403** | The Forbidden response. |  -  |
| **500** | The Server Error response. |  -  |

<a id="servicesApiSettingsUpdateSettings"></a>
# **servicesApiSettingsUpdateSettings**
> SettingsResponse servicesApiSettingsUpdateSettings(settingsResponse)

Update the settings.

### Example
```java
// Import classes:
import LiltConnectorSDK.ApiClient;
import LiltConnectorSDK.ApiException;
import LiltConnectorSDK.Configuration;
import LiltConnectorSDK.auth.*;
import LiltConnectorSDK.models.*;
import org.openapitools.client.api.SettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://connectors-admin.lilt.com/api/v1.0");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SettingsApi apiInstance = new SettingsApi(defaultClient);
    SettingsResponse settingsResponse = new SettingsResponse(); // SettingsResponse | 
    try {
      SettingsResponse result = apiInstance.servicesApiSettingsUpdateSettings(settingsResponse);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsApi#servicesApiSettingsUpdateSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **settingsResponse** | [**SettingsResponse**](SettingsResponse.md)|  | [optional] |

### Return type

[**SettingsResponse**](SettingsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The settings response. |  -  |
| **400** | The Bad Request response. |  -  |
| **401** | The Unauthorized response. |  -  |
| **403** | The Forbidden response. |  -  |
| **500** | The Server Error response. |  -  |

