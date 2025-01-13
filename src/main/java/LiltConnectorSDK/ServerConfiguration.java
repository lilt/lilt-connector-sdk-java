package LiltConnectorSDK;

/*-
 * #%L
 * com.lilt.connectors.client:lilt-connector-sdk-java
 * %%
 * Copyright (C) 2015 - 2025 Lilt
 * %%
 * Lilt Client Library License – Source Supplied, Permissive, Attribution, Noncommercial
 * 
 * THE LILT CLIENT LIBRARY SOFTWARE OR WORK (AS DEFINED BELOW) IS PROVIDED UNDER
 * THE TERMS OF THIS ("LICENSE"). THE WORK IS PROTECTED BY COPYRIGHT AND/OR OTHER
 * APPLICABLE LAW. ANY USE OF THE WORK OTHER THAN AS AUTHORIZED UNDER THIS LICENSE
 * OR COPYRIGHT LAW IS PROHIBITED. BY EXERCISING ANY RIGHTS TO THE WORK PROVIDED
 * HERE, YOU ACCEPT AND AGREE TO BE BOUND BY THE TERMS OF THIS LICENSE. TO THE
 * EXTENT THIS LICENSE MAY BE CONSIDERED TO BE A CONTRACT, THE LICENSOR GRANTS YOU
 * THE RIGHTS CONTAINED HERE IN CONSIDERATION OF YOUR ACCEPTANCE OF SUCH TERMS AND
 * CONDITIONS.
 * #L%
 */

import java.util.Map;

/**
 * Representing a Server configuration.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-05T09:10:14.232589379Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class ServerConfiguration {
    public String URL;
    public String description;
    public Map<String, ServerVariable> variables;

    /**
     * @param URL A URL to the target host.
     * @param description A description of the host designated by the URL.
     * @param variables A map between a variable name and its value. The value is used for substitution in the server's URL template.
     */
    public ServerConfiguration(String URL, String description, Map<String, ServerVariable> variables) {
        this.URL = URL;
        this.description = description;
        this.variables = variables;
    }

    /**
     * Format URL template using given variables.
     *
     * @param variables A map between a variable name and its value.
     * @return Formatted URL.
     */
    public String URL(Map<String, String> variables) {
        String url = this.URL;

        // go through variables and replace placeholders
        for (Map.Entry<String, ServerVariable> variable: this.variables.entrySet()) {
            String name = variable.getKey();
            ServerVariable serverVariable = variable.getValue();
            String value = serverVariable.defaultValue;

            if (variables != null && variables.containsKey(name)) {
                value = variables.get(name);
                if (serverVariable.enumValues.size() > 0 && !serverVariable.enumValues.contains(value)) {
                    throw new IllegalArgumentException("The variable " + name + " in the server URL has invalid value " + value + ".");
                }
            }
            url = url.replace("{" + name + "}", value);
        }
        return url;
    }

    /**
     * Format URL template using default server variables.
     *
     * @return Formatted URL.
     */
    public String URL() {
        return URL(null);
    }
}
