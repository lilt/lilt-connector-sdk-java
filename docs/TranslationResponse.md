

# TranslationResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  |
|**name** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | This value tracks the status of the delivery.  |  |
|**srcLang** | **String** |  |  |
|**srcLocale** | **String** |  |  [optional] |
|**trgLang** | **String** |  |  |
|**trgLocale** | **String** |  |  [optional] |
|**errorMsg** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| IMPORT_COMPLETE | &quot;import_complete&quot; |
| IMPORT_FAILED | &quot;import_failed&quot; |
| EXPORT_COMPLETE | &quot;export_complete&quot; |
| EXPORT_FAILED | &quot;export_failed&quot; |
| MT_COMPLETE | &quot;mt_complete&quot; |
| MT_FAILED | &quot;mt_failed&quot; |
| PLUGIN_COMPLETE | &quot;plugin_complete&quot; |



