

# JobResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**projectPrefix** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | This value tracks the async processing status of the job.  |  [optional] |
|**orderStatus** | [**OrderStatusEnum**](#OrderStatusEnum) | This value tracks the completion status of the translation order.  |  [optional] |
|**targetLanguages** | **List&lt;String&gt;** |  |  [optional] |
|**translationWorkflow** | [**TranslationWorkflowEnum**](#TranslationWorkflowEnum) | This indicates the translation workflow being used. UNKNOWN will only be displayed in exceptional cases.  |  [optional] |
|**dueDate** | **OffsetDateTime** |  |  [optional] |
|**errorMsg** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;draft&quot; |
| QUEUED | &quot;queued&quot; |
| PROCESSING | &quot;processing&quot; |
| COMPLETE | &quot;complete&quot; |
| CANCELED | &quot;canceled&quot; |
| FAILED | &quot;failed&quot; |



## Enum: OrderStatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;Draft&quot; |
| STARTED | &quot;Started&quot; |
| IN_PROGRESS | &quot;In Progress&quot; |
| DELIVERED | &quot;Delivered&quot; |
| COMPLETE | &quot;Complete&quot; |
| NEEDS_ATTENTION | &quot;Needs Attention&quot; |



## Enum: TranslationWorkflowEnum

| Name | Value |
|---- | -----|
| INSTANT | &quot;INSTANT&quot; |
| VERIFIED | &quot;VERIFIED&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



