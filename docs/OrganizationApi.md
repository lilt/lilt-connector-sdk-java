# OrganizationApi

All URIs are relative to *https://connectors-admin.lilt.com/api/v1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**servicesApiOrganizationGetOrganizationRecord**](OrganizationApi.md#servicesApiOrganizationGetOrganizationRecord) | **GET** /organization | Get information about the organization based on lilt_token  |


<a id="servicesApiOrganizationGetOrganizationRecord"></a>
# **servicesApiOrganizationGetOrganizationRecord**
> OrganizationResponse servicesApiOrganizationGetOrganizationRecord()

Get information about the organization based on lilt_token 

### Example
```java
// Import classes:
import LiltConnectorSDK.ApiClient;
import LiltConnectorSDK.ApiException;
import LiltConnectorSDK.Configuration;
import LiltConnectorSDK.auth.*;
import LiltConnectorSDK.models.*;
import org.openapitools.client.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://connectors-admin.lilt.com/api/v1.0");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    try {
      OrganizationResponse result = apiInstance.servicesApiOrganizationGetOrganizationRecord();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#servicesApiOrganizationGetOrganizationRecord");
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

[**OrganizationResponse**](OrganizationResponse.md)

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

