# TranslationsApi

All URIs are relative to *https://connectors-admin.lilt.com/api/v1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**servicesApiDeliveriesCompleteDelivery**](TranslationsApi.md#servicesApiDeliveriesCompleteDelivery) | **POST** /translations/{id}/complete | Complete a Translation. |
| [**servicesApiDeliveriesDownloadDelivery**](TranslationsApi.md#servicesApiDeliveriesDownloadDelivery) | **GET** /translations/{id}/download | Download a Translation. |
| [**servicesApiDeliveriesDownloadDeliverySource**](TranslationsApi.md#servicesApiDeliveriesDownloadDeliverySource) | **GET** /translations/{id}/source | Download a Translation Source. |
| [**servicesApiDeliveriesGetDeliveriesByJobId**](TranslationsApi.md#servicesApiDeliveriesGetDeliveriesByJobId) | **GET** /translations | Retrieve a list of Translations. |
| [**servicesApiDeliveriesGetDeliveryById**](TranslationsApi.md#servicesApiDeliveriesGetDeliveryById) | **GET** /translations/{id} | Retrieve a Translation. |
| [**servicesApiDeliveriesPreviewDelivery**](TranslationsApi.md#servicesApiDeliveriesPreviewDelivery) | **GET** /translations/{id}/preview | Get a Translation&#39;s source to target mapping. |
| [**servicesApiDeliveriesUpdateDelivery**](TranslationsApi.md#servicesApiDeliveriesUpdateDelivery) | **PUT** /translations/{id} | Update a Translation. |


<a id="servicesApiDeliveriesCompleteDelivery"></a>
# **servicesApiDeliveriesCompleteDelivery**
> servicesApiDeliveriesCompleteDelivery(id)

Complete a Translation.

### Example
```java
// Import classes:
import LiltConnectorSDK.ApiClient;
import LiltConnectorSDK.ApiException;
import LiltConnectorSDK.Configuration;
import LiltConnectorSDK.auth.*;
import LiltConnectorSDK.models.*;
import org.openapitools.client.api.TranslationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://connectors-admin.lilt.com/api/v1.0");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    Integer id = 12345; // Integer | The ID.
    try {
      apiInstance.servicesApiDeliveriesCompleteDelivery(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#servicesApiDeliveriesCompleteDelivery");
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
| **id** | **Integer**| The ID. | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Upon success a response with an empty body is returned.  |  -  |
| **400** | The Bad Request response. |  -  |
| **401** | The Unauthorized response. |  -  |
| **403** | The Forbidden response. |  -  |
| **404** | The Not Found response. |  -  |
| **500** | The Server Error response. |  -  |

<a id="servicesApiDeliveriesDownloadDelivery"></a>
# **servicesApiDeliveriesDownloadDelivery**
> String servicesApiDeliveriesDownloadDelivery(id)

Download a Translation.

### Example
```java
// Import classes:
import LiltConnectorSDK.ApiClient;
import LiltConnectorSDK.ApiException;
import LiltConnectorSDK.Configuration;
import LiltConnectorSDK.auth.*;
import LiltConnectorSDK.models.*;
import org.openapitools.client.api.TranslationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://connectors-admin.lilt.com/api/v1.0");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    Integer id = 12345; // Integer | The ID.
    try {
      String result = apiInstance.servicesApiDeliveriesDownloadDelivery(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#servicesApiDeliveriesDownloadDelivery");
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
| **id** | **Integer**| The ID. | |

### Return type

**String**

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The translation contents. |  -  |
| **400** | The Bad Request response. |  -  |
| **401** | The Unauthorized response. |  -  |
| **403** | The Forbidden response. |  -  |
| **404** | The Not Found response. |  -  |
| **500** | The Server Error response. |  -  |

<a id="servicesApiDeliveriesDownloadDeliverySource"></a>
# **servicesApiDeliveriesDownloadDeliverySource**
> String servicesApiDeliveriesDownloadDeliverySource(id)

Download a Translation Source.

### Example
```java
// Import classes:
import LiltConnectorSDK.ApiClient;
import LiltConnectorSDK.ApiException;
import LiltConnectorSDK.Configuration;
import LiltConnectorSDK.auth.*;
import LiltConnectorSDK.models.*;
import org.openapitools.client.api.TranslationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://connectors-admin.lilt.com/api/v1.0");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    Integer id = 12345; // Integer | The ID.
    try {
      String result = apiInstance.servicesApiDeliveriesDownloadDeliverySource(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#servicesApiDeliveriesDownloadDeliverySource");
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
| **id** | **Integer**| The ID. | |

### Return type

**String**

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The translation source contents. |  -  |
| **400** | The Bad Request response. |  -  |
| **401** | The Unauthorized response. |  -  |
| **403** | The Forbidden response. |  -  |
| **404** | The Not Found response. |  -  |
| **500** | The Server Error response. |  -  |

<a id="servicesApiDeliveriesGetDeliveriesByJobId"></a>
# **servicesApiDeliveriesGetDeliveriesByJobId**
> TranslationsResponse servicesApiDeliveriesGetDeliveriesByJobId(limit, start, jobId)

Retrieve a list of Translations.

### Example
```java
// Import classes:
import LiltConnectorSDK.ApiClient;
import LiltConnectorSDK.ApiException;
import LiltConnectorSDK.Configuration;
import LiltConnectorSDK.auth.*;
import LiltConnectorSDK.models.*;
import org.openapitools.client.api.TranslationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://connectors-admin.lilt.com/api/v1.0");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    Integer limit = 25; // Integer | the query limit
    Integer start = 0; // Integer | where to start
    Integer jobId = 12345; // Integer | The Job ID.
    try {
      TranslationsResponse result = apiInstance.servicesApiDeliveriesGetDeliveriesByJobId(limit, start, jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#servicesApiDeliveriesGetDeliveriesByJobId");
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
| **limit** | **Integer**| the query limit | [optional] [default to 25] |
| **start** | **Integer**| where to start | [optional] [default to 0] |
| **jobId** | **Integer**| The Job ID. | [optional] |

### Return type

[**TranslationsResponse**](TranslationsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The translations response. |  -  |
| **400** | The Bad Request response. |  -  |
| **401** | The Unauthorized response. |  -  |
| **403** | The Forbidden response. |  -  |
| **404** | The Not Found response. |  -  |
| **500** | The Server Error response. |  -  |

<a id="servicesApiDeliveriesGetDeliveryById"></a>
# **servicesApiDeliveriesGetDeliveryById**
> TranslationResponse servicesApiDeliveriesGetDeliveryById(id)

Retrieve a Translation.

### Example
```java
// Import classes:
import LiltConnectorSDK.ApiClient;
import LiltConnectorSDK.ApiException;
import LiltConnectorSDK.Configuration;
import LiltConnectorSDK.auth.*;
import LiltConnectorSDK.models.*;
import org.openapitools.client.api.TranslationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://connectors-admin.lilt.com/api/v1.0");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    Integer id = 12345; // Integer | The ID.
    try {
      TranslationResponse result = apiInstance.servicesApiDeliveriesGetDeliveryById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#servicesApiDeliveriesGetDeliveryById");
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
| **id** | **Integer**| The ID. | |

### Return type

[**TranslationResponse**](TranslationResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The translation response. |  -  |
| **400** | The Bad Request response. |  -  |
| **401** | The Unauthorized response. |  -  |
| **403** | The Forbidden response. |  -  |
| **404** | The Not Found response. |  -  |
| **500** | The Server Error response. |  -  |

<a id="servicesApiDeliveriesPreviewDelivery"></a>
# **servicesApiDeliveriesPreviewDelivery**
> List&lt;PreviewTranslationResponseInner&gt; servicesApiDeliveriesPreviewDelivery(id)

Get a Translation&#39;s source to target mapping.

### Example
```java
// Import classes:
import LiltConnectorSDK.ApiClient;
import LiltConnectorSDK.ApiException;
import LiltConnectorSDK.Configuration;
import LiltConnectorSDK.auth.*;
import LiltConnectorSDK.models.*;
import org.openapitools.client.api.TranslationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://connectors-admin.lilt.com/api/v1.0");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    Integer id = 12345; // Integer | The ID.
    try {
      List<PreviewTranslationResponseInner> result = apiInstance.servicesApiDeliveriesPreviewDelivery(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#servicesApiDeliveriesPreviewDelivery");
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
| **id** | **Integer**| The ID. | |

### Return type

[**List&lt;PreviewTranslationResponseInner&gt;**](PreviewTranslationResponseInner.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The translation response. |  -  |
| **400** | The Bad Request response. |  -  |
| **401** | The Unauthorized response. |  -  |
| **403** | The Forbidden response. |  -  |
| **404** | The Not Found response. |  -  |
| **500** | The Server Error response. |  -  |

<a id="servicesApiDeliveriesUpdateDelivery"></a>
# **servicesApiDeliveriesUpdateDelivery**
> TranslationResponse servicesApiDeliveriesUpdateDelivery(id, updateDeliveryOptions)

Update a Translation.

### Example
```java
// Import classes:
import LiltConnectorSDK.ApiClient;
import LiltConnectorSDK.ApiException;
import LiltConnectorSDK.Configuration;
import LiltConnectorSDK.auth.*;
import LiltConnectorSDK.models.*;
import org.openapitools.client.api.TranslationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://connectors-admin.lilt.com/api/v1.0");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    Integer id = 12345; // Integer | The ID.
    UpdateDeliveryOptions updateDeliveryOptions = new UpdateDeliveryOptions(); // UpdateDeliveryOptions | 
    try {
      TranslationResponse result = apiInstance.servicesApiDeliveriesUpdateDelivery(id, updateDeliveryOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#servicesApiDeliveriesUpdateDelivery");
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
| **id** | **Integer**| The ID. | |
| **updateDeliveryOptions** | [**UpdateDeliveryOptions**](UpdateDeliveryOptions.md)|  | [optional] |

### Return type

[**TranslationResponse**](TranslationResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The translation response. |  -  |
| **400** | The Bad Request response. |  -  |
| **401** | The Unauthorized response. |  -  |
| **403** | The Forbidden response. |  -  |
| **404** | The Not Found response. |  -  |
| **500** | The Server Error response. |  -  |

