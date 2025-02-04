# JobsApi

All URIs are relative to *https://connectors-admin.lilt.com/api/v1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**servicesApiJobsAddFile**](JobsApi.md#servicesApiJobsAddFile) | **POST** /jobs/{id}/files | Add a file to a Job. |
| [**servicesApiJobsCreateJob**](JobsApi.md#servicesApiJobsCreateJob) | **POST** /jobs | Create a Connector Job. |
| [**servicesApiJobsDeleteJobById**](JobsApi.md#servicesApiJobsDeleteJobById) | **DELETE** /jobs/{id} | Delete a Connector Job. |
| [**servicesApiJobsGetJobById**](JobsApi.md#servicesApiJobsGetJobById) | **GET** /jobs/{id} | Retrieve a Connector Job. |
| [**servicesApiJobsGetJobTranslations**](JobsApi.md#servicesApiJobsGetJobTranslations) | **GET** /jobs/translations | Retrieve a list of Translations with their Job information. |
| [**servicesApiJobsGetJobs**](JobsApi.md#servicesApiJobsGetJobs) | **GET** /jobs | Retrieve a list of Connector Jobs. |
| [**servicesApiJobsStartJob**](JobsApi.md#servicesApiJobsStartJob) | **POST** /jobs/{id}/start | Start a Job. |
| [**servicesApiJobsSyncJob**](JobsApi.md#servicesApiJobsSyncJob) | **POST** /jobs/{id}/sync | Start a Sync. |
| [**servicesApiJobsUpdateJob**](JobsApi.md#servicesApiJobsUpdateJob) | **PUT** /jobs/{id} | Update a Connector Job. |


<a id="servicesApiJobsAddFile"></a>
# **servicesApiJobsAddFile**
> servicesApiJobsAddFile(id, name, trglang, srclang, due, body)

Add a file to a Job.

Add files to a job to submit them for translation. 

### Example
```java
// Import classes:
import com.lilt.connectors.ApiClient;
import com.lilt.connectors.ApiException;
import com.lilt.connectors.Configuration;
import com.lilt.connectors.auth.*;
import com.lilt.connectors.models.*;
import com.lilt.connectors.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://connectors-admin.lilt.com/api/v1.0");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    JobsApi apiInstance = new JobsApi(defaultClient);
    Integer id = 12345; // Integer | The Job ID.
    String name = "sample.txt"; // String | The file name.
    List<String> trglang = Arrays.asList(); // List<String> | The target language. Many target languages can be added to a source file. To add more than one target language pass in the trglang query parameter multiple times. For example: ?trglang=fr-FR&trglang=es-ES. 
    String srclang = "en-US"; // String | The source language.
    OffsetDateTime due = OffsetDateTime.parse("2022-05-20T04:09:39Z"); // OffsetDateTime | The due date for the file as an ISO-8601 string.
    File body = new File("/path/to/file"); // File | 
    try {
      apiInstance.servicesApiJobsAddFile(id, name, trglang, srclang, due, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#servicesApiJobsAddFile");
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
| **id** | **Integer**| The Job ID. | |
| **name** | **String**| The file name. | |
| **trglang** | [**List&lt;String&gt;**](String.md)| The target language. Many target languages can be added to a source file. To add more than one target language pass in the trglang query parameter multiple times. For example: ?trglang&#x3D;fr-FR&amp;trglang&#x3D;es-ES.  | |
| **srclang** | **String**| The source language. | [optional] [default to en-US] |
| **due** | **OffsetDateTime**| The due date for the file as an ISO-8601 string. | [optional] |
| **body** | **File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/octet-stream
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

<a id="servicesApiJobsCreateJob"></a>
# **servicesApiJobsCreateJob**
> JobResponse servicesApiJobsCreateJob(newJobOptions)

Create a Connector Job.

The general workflow for a job is as follows.  1. Create a job. 1. Add files to a job. 1. Start the job. 1. Poll for translation completion. 1. Download the translated files. 

### Example
```java
// Import classes:
import com.lilt.connectors.ApiClient;
import com.lilt.connectors.ApiException;
import com.lilt.connectors.Configuration;
import com.lilt.connectors.auth.*;
import com.lilt.connectors.models.*;
import com.lilt.connectors.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://connectors-admin.lilt.com/api/v1.0");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    JobsApi apiInstance = new JobsApi(defaultClient);
    NewJobOptions newJobOptions = new NewJobOptions(); // NewJobOptions | 
    try {
      JobResponse result = apiInstance.servicesApiJobsCreateJob(newJobOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#servicesApiJobsCreateJob");
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
| **newJobOptions** | [**NewJobOptions**](NewJobOptions.md)|  | [optional] |

### Return type

[**JobResponse**](JobResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The job response. |  -  |
| **400** | The Bad Request response. |  -  |
| **401** | The Unauthorized response. |  -  |
| **403** | The Forbidden response. |  -  |
| **500** | The Server Error response. |  -  |

<a id="servicesApiJobsDeleteJobById"></a>
# **servicesApiJobsDeleteJobById**
> servicesApiJobsDeleteJobById(id)

Delete a Connector Job.

### Example
```java
// Import classes:
import com.lilt.connectors.ApiClient;
import com.lilt.connectors.ApiException;
import com.lilt.connectors.Configuration;
import com.lilt.connectors.auth.*;
import com.lilt.connectors.models.*;
import com.lilt.connectors.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://connectors-admin.lilt.com/api/v1.0");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    JobsApi apiInstance = new JobsApi(defaultClient);
    Integer id = 12345; // Integer | The Job ID.
    try {
      apiInstance.servicesApiJobsDeleteJobById(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#servicesApiJobsDeleteJobById");
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
| **id** | **Integer**| The Job ID. | |

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

<a id="servicesApiJobsGetJobById"></a>
# **servicesApiJobsGetJobById**
> JobResponse servicesApiJobsGetJobById(id)

Retrieve a Connector Job.

### Example
```java
// Import classes:
import com.lilt.connectors.ApiClient;
import com.lilt.connectors.ApiException;
import com.lilt.connectors.Configuration;
import com.lilt.connectors.auth.*;
import com.lilt.connectors.models.*;
import com.lilt.connectors.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://connectors-admin.lilt.com/api/v1.0");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    JobsApi apiInstance = new JobsApi(defaultClient);
    Integer id = 12345; // Integer | The Job ID.
    try {
      JobResponse result = apiInstance.servicesApiJobsGetJobById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#servicesApiJobsGetJobById");
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
| **id** | **Integer**| The Job ID. | |

### Return type

[**JobResponse**](JobResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The job response. |  -  |
| **400** | The Bad Request response. |  -  |
| **401** | The Unauthorized response. |  -  |
| **403** | The Forbidden response. |  -  |
| **404** | The Not Found response. |  -  |
| **500** | The Server Error response. |  -  |

<a id="servicesApiJobsGetJobTranslations"></a>
# **servicesApiJobsGetJobTranslations**
> JobsResponse servicesApiJobsGetJobTranslations(limit, start, order, filterOutCompleted, liltTranslationWorkflow, orderStatus)

Retrieve a list of Translations with their Job information.

### Example
```java
// Import classes:
import com.lilt.connectors.ApiClient;
import com.lilt.connectors.ApiException;
import com.lilt.connectors.Configuration;
import com.lilt.connectors.auth.*;
import com.lilt.connectors.models.*;
import com.lilt.connectors.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://connectors-admin.lilt.com/api/v1.0");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    JobsApi apiInstance = new JobsApi(defaultClient);
    Integer limit = 25; // Integer | the query limit
    Integer start = 0; // Integer | where to start
    String order = "asc"; // String | how to order the returned results
    Boolean filterOutCompleted = false; // Boolean | Weather it should filter out completed translations
    String liltTranslationWorkflow = "HITL"; // String | Filter by selected translation workflow
    String orderStatus = "complete,draft"; // String | Filter by list of order level statuses
    try {
      JobsResponse result = apiInstance.servicesApiJobsGetJobTranslations(limit, start, order, filterOutCompleted, liltTranslationWorkflow, orderStatus);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#servicesApiJobsGetJobTranslations");
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
| **order** | **String**| how to order the returned results | [optional] [default to asc] [enum: asc, desc] |
| **filterOutCompleted** | **Boolean**| Weather it should filter out completed translations | [optional] [default to false] |
| **liltTranslationWorkflow** | **String**| Filter by selected translation workflow | [optional] [enum: HITL, MT] |
| **orderStatus** | **String**| Filter by list of order level statuses | [optional] |

### Return type

[**JobsResponse**](JobsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The jobs response. |  -  |
| **400** | The Bad Request response. |  -  |
| **401** | The Unauthorized response. |  -  |
| **403** | The Forbidden response. |  -  |
| **500** | The Server Error response. |  -  |

<a id="servicesApiJobsGetJobs"></a>
# **servicesApiJobsGetJobs**
> JobsResponse servicesApiJobsGetJobs(limit, start, order)

Retrieve a list of Connector Jobs.

### Example
```java
// Import classes:
import com.lilt.connectors.ApiClient;
import com.lilt.connectors.ApiException;
import com.lilt.connectors.Configuration;
import com.lilt.connectors.auth.*;
import com.lilt.connectors.models.*;
import com.lilt.connectors.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://connectors-admin.lilt.com/api/v1.0");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    JobsApi apiInstance = new JobsApi(defaultClient);
    Integer limit = 25; // Integer | the query limit
    Integer start = 0; // Integer | where to start
    String order = "asc"; // String | how to order the returned results
    try {
      JobsResponse result = apiInstance.servicesApiJobsGetJobs(limit, start, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#servicesApiJobsGetJobs");
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
| **order** | **String**| how to order the returned results | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**JobsResponse**](JobsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The jobs response. |  -  |
| **400** | The Bad Request response. |  -  |
| **401** | The Unauthorized response. |  -  |
| **403** | The Forbidden response. |  -  |
| **500** | The Server Error response. |  -  |

<a id="servicesApiJobsStartJob"></a>
# **servicesApiJobsStartJob**
> servicesApiJobsStartJob(id)

Start a Job.

Start a job once all of the source files have been added. Use the Job ID to poll for completion to ensure everything has been well received by Lilt. 

### Example
```java
// Import classes:
import com.lilt.connectors.ApiClient;
import com.lilt.connectors.ApiException;
import com.lilt.connectors.Configuration;
import com.lilt.connectors.auth.*;
import com.lilt.connectors.models.*;
import com.lilt.connectors.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://connectors-admin.lilt.com/api/v1.0");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    JobsApi apiInstance = new JobsApi(defaultClient);
    Integer id = 12345; // Integer | The Job ID.
    try {
      apiInstance.servicesApiJobsStartJob(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#servicesApiJobsStartJob");
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
| **id** | **Integer**| The Job ID. | |

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
| **204** | Upon success a response with an empty body is returned. Use the job ID to poll for subsequent status changes.  |  -  |
| **400** | The Bad Request response. |  -  |
| **401** | The Unauthorized response. |  -  |
| **403** | The Forbidden response. |  -  |
| **404** | The Not Found response. |  -  |
| **500** | The Server Error response. |  -  |

<a id="servicesApiJobsSyncJob"></a>
# **servicesApiJobsSyncJob**
> servicesApiJobsSyncJob(id)

Start a Sync.

Checks for updates to the translations. Use the Job ID to poll for successful completion of the sync. When the sync is complete the translations endpoint can be used to view the translation status for the job. 

### Example
```java
// Import classes:
import com.lilt.connectors.ApiClient;
import com.lilt.connectors.ApiException;
import com.lilt.connectors.Configuration;
import com.lilt.connectors.auth.*;
import com.lilt.connectors.models.*;
import com.lilt.connectors.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://connectors-admin.lilt.com/api/v1.0");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    JobsApi apiInstance = new JobsApi(defaultClient);
    Integer id = 12345; // Integer | The Job ID.
    try {
      apiInstance.servicesApiJobsSyncJob(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#servicesApiJobsSyncJob");
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
| **id** | **Integer**| The Job ID. | |

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
| **204** | Upon success a response with an empty body is returned. Use the job ID to poll for subsequent status changes.  |  -  |
| **400** | The Bad Request response. |  -  |
| **401** | The Unauthorized response. |  -  |
| **403** | The Forbidden response. |  -  |
| **404** | The Not Found response. |  -  |
| **500** | The Server Error response. |  -  |

<a id="servicesApiJobsUpdateJob"></a>
# **servicesApiJobsUpdateJob**
> JobResponse servicesApiJobsUpdateJob(id, updateJobOptions)

Update a Connector Job.

Update a job to change the status or error message. 

### Example
```java
// Import classes:
import com.lilt.connectors.ApiClient;
import com.lilt.connectors.ApiException;
import com.lilt.connectors.Configuration;
import com.lilt.connectors.auth.*;
import com.lilt.connectors.models.*;
import com.lilt.connectors.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://connectors-admin.lilt.com/api/v1.0");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    JobsApi apiInstance = new JobsApi(defaultClient);
    Integer id = 12345; // Integer | The Job ID.
    UpdateJobOptions updateJobOptions = new UpdateJobOptions(); // UpdateJobOptions | 
    try {
      JobResponse result = apiInstance.servicesApiJobsUpdateJob(id, updateJobOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#servicesApiJobsUpdateJob");
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
| **id** | **Integer**| The Job ID. | |
| **updateJobOptions** | [**UpdateJobOptions**](UpdateJobOptions.md)|  | [optional] |

### Return type

[**JobResponse**](JobResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The job response. |  -  |
| **400** | The Bad Request response. |  -  |
| **401** | The Unauthorized response. |  -  |
| **403** | The Forbidden response. |  -  |
| **500** | The Server Error response. |  -  |

