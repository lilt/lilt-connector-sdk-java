

# UpdateJobOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | This value tracks the async processing status of the job.  |  [optional] |
|**errorMessage** | **String** |  |  [optional] |
|**sourceWordCount** | **BigDecimal** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;draft&quot; |
| QUEUED | &quot;queued&quot; |
| PROCESSING | &quot;processing&quot; |
| COMPLETE | &quot;complete&quot; |
| CANCELED | &quot;canceled&quot; |
| FAILED | &quot;failed&quot; |



