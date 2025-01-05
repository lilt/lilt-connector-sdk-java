

# NewJobOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**projectPrefix** | **String** | A string value to include in the Project name. |  [optional] |
|**projectNameTemplate** | **String** | The template string to use when generating Project names.  The available template options are:  - **today** - Today&#39;s date. Formatted as YYYY-MM-DD. - **trglocale** - The target locale for the given project. - **filename** - The name of the current file being uploaded. - **project_prefix** - The project_prefix value provided in the   configuration. - **project_name** - The project_name value assigned to the file in   the code. - **connector_id** - The Connector ID. - **connector_type** - The Connector Type (e.g. \&quot;xtm\&quot;, \&quot;salesforce\&quot;).  |  [optional] |
|**liltTranslationWorkflow** | [**LiltTranslationWorkflowEnum**](#LiltTranslationWorkflowEnum) |  |  [optional] |
|**liltDefaultDueDate** | **String** | The due date to use when creating Lilt Jobs/Projects if no specific due date is specified on the file level.  |  [optional] |
|**liltTargetLanguages** | **List&lt;String&gt;** | The list of target languages to use for the new job. The values provided should be present in the target_memories section of the configuration.  |  [optional] |
|**handleCreditTransactions** | **Boolean** | If true, credit transactions will be handled by the connector. If false, no credit transactions will be created for the job.  |  [optional] |
|**sourceWordCount** | **BigDecimal** | The source word count to use when creating credits transaction for instant transaltion jobs.  |  [optional] |



## Enum: LiltTranslationWorkflowEnum

| Name | Value |
|---- | -----|
| INSTANT | &quot;INSTANT&quot; |
| VERIFIED | &quot;VERIFIED&quot; |



