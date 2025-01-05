

# SettingsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**projectPrefix** | **String** | A string value to include in the Project name. |  [optional] |
|**projectNameTemplate** | **String** | The template string to use when generating Project names.  The available template options are:  - **today** - Today&#39;s date. Formatted as YYYY-MM-DD. - **trglocale** - The target locale for the given project. - **filename** - The name of the current file being uploaded. - **project_prefix** - The project_prefix value provided in the   configuration. - **project_name** - The project_name value assigned to the file in   the code. - **connector_id** - The Connector ID. - **connector_type** - The Connector Type (e.g. \&quot;xtm\&quot;, \&quot;salesforce\&quot;).  |  [optional] |
|**liltTranslationWorkflow** | [**LiltTranslationWorkflowEnum**](#LiltTranslationWorkflowEnum) | This indicates the translation workflow being used. UNKNOWN will only be displayed in exceptional cases.  |  [optional] |



## Enum: LiltTranslationWorkflowEnum

| Name | Value |
|---- | -----|
| INSTANT | &quot;INSTANT&quot; |
| VERIFIED | &quot;VERIFIED&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



