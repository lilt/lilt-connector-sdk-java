# CreditTransactionsApi

All URIs are relative to *https://connectors-admin.lilt.com/api/v1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**servicesApiCreditTransactionCreateCreditTransaction**](CreditTransactionsApi.md#servicesApiCreditTransactionCreateCreditTransaction) | **POST** /credit-transaction | Create a credit transaction. Request is expected to contain credits information encoded in jwt_token payload. Request encoded should have info for instant_translation_credits_change value, verified_translation_credits_change value, source_metadata which contains any identifying information to attach to the transaction, email for the user starting the transaction, and optionally lilt_token for the connector configuration.  |


<a id="servicesApiCreditTransactionCreateCreditTransaction"></a>
# **servicesApiCreditTransactionCreateCreditTransaction**
> servicesApiCreditTransactionCreateCreditTransaction(servicesApiCreditTransactionCreateCreditTransactionRequest)

Create a credit transaction. Request is expected to contain credits information encoded in jwt_token payload. Request encoded should have info for instant_translation_credits_change value, verified_translation_credits_change value, source_metadata which contains any identifying information to attach to the transaction, email for the user starting the transaction, and optionally lilt_token for the connector configuration. 

### Example
```java
// Import classes:
import com.lilt.connectors.ApiClient;
import com.lilt.connectors.ApiException;
import com.lilt.connectors.Configuration;
import com.lilt.connectors.models.*;
import com.lilt.connectors.api.CreditTransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://connectors-admin.lilt.com/api/v1.0");

    CreditTransactionsApi apiInstance = new CreditTransactionsApi(defaultClient);
    ServicesApiCreditTransactionCreateCreditTransactionRequest servicesApiCreditTransactionCreateCreditTransactionRequest = new ServicesApiCreditTransactionCreateCreditTransactionRequest(); // ServicesApiCreditTransactionCreateCreditTransactionRequest | 
    try {
      apiInstance.servicesApiCreditTransactionCreateCreditTransaction(servicesApiCreditTransactionCreateCreditTransactionRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditTransactionsApi#servicesApiCreditTransactionCreateCreditTransaction");
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
| **servicesApiCreditTransactionCreateCreditTransactionRequest** | [**ServicesApiCreditTransactionCreateCreditTransactionRequest**](ServicesApiCreditTransactionCreateCreditTransactionRequest.md)|  | [optional] |

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
| **401** | The Unauthorized response. |  -  |
| **403** | The Forbidden response. |  -  |
| **500** | The Server Error response. |  -  |

