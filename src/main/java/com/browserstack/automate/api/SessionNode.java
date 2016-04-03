package com.browserstack.automate.api;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SessionNode {

    @JsonProperty("automation_session")
    private Session session;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The session
     */
    @JsonProperty("automation_session")
    public Session getSession() {
        return session;
    }

    /**
     * @param session The automation_session
     */
    @JsonProperty("automation_session")
    private void setSession(Session session) {
        this.session = session;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    private void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}