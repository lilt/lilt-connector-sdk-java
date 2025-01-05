# RegistrationApi

All URIs are relative to *https://connectors-admin.lilt.com/api/v1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**servicesApiRegistrationRegisterCreditsBasedOrganization**](RegistrationApi.md#servicesApiRegistrationRegisterCreditsBasedOrganization) | **POST** /register | Register a new Connectors Organization |


<a id="servicesApiRegistrationRegisterCreditsBasedOrganization"></a>
# **servicesApiRegistrationRegisterCreditsBasedOrganization**
> servicesApiRegistrationRegisterCreditsBasedOrganization(newOrganizationOptions)

Register a new Connectors Organization

This endpoint is used to register a connector organization in preparation to handle credits management. 

### Example
```java
// Import classes:
import LiltConnectorSDK.ApiClient;
import LiltConnectorSDK.ApiException;
import LiltConnectorSDK.Configuration;
import LiltConnectorSDK.models.*;
import org.openapitools.client.api.RegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://connectors-admin.lilt.com/api/v1.0");

    RegistrationApi apiInstance = new RegistrationApi(defaultClient);
    NewOrganizationOptions newOrganizationOptions = new NewOrganizationOptions(); // NewOrganizationOptions | 
    try {
      apiInstance.servicesApiRegistrationRegisterCreditsBasedOrganization(newOrganizationOptions);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistrationApi#servicesApiRegistrationRegisterCreditsBasedOrganization");
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
| **newOrganizationOptions** | [**NewOrganizationOptions**](NewOrganizationOptions.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Upon success a response with an empty body is returned.  |  -  |
| **400** | The Bad Request response. |  -  |
| **500** | The Server Error response. |  -  |

