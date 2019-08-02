
package com.pss.oneservice.$packageName$.integration.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.pss.oneservice.common.integration.model.ServiceRequest;


/**
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "JUR",
    "WC"
})
public class $serviceNamecc$Request
    extends ServiceRequest
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("JUR")
    private String jur;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("WC")
    private String wc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("JUR")
    public String getJur() {
        return jur;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("JUR")
    public void setJur(String jur) {
        this.jur = jur;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("WC")
    public String getWc() {
        return wc;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("WC")
    public void setWc(String wc) {
        this.wc = wc;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append($serviceNamecc$Request.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        int baseLength = sb.length();
        String superString = super.toString();
        if (superString!= null) {
            int contentStart = superString.indexOf('[');
            int contentEnd = superString.lastIndexOf(']');
            if ((contentStart >= 0)&&(contentEnd >contentStart)) {
                sb.append(superString, (contentStart + 1), contentEnd);
            } else {
                sb.append(superString);
            }
        }
        if (sb.length()>baseLength) {
            sb.append(',');
        }
        sb.append("jur");
        sb.append('=');
        sb.append(((this.jur == null)?"<null>":this.jur));
        sb.append(',');
        sb.append("wc");
        sb.append('=');
        sb.append(((this.wc == null)?"<null>":this.wc));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.wc == null)? 0 :this.wc.hashCode()));
        result = ((result* 31)+((this.jur == null)? 0 :this.jur.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof $serviceNamecc$Request) == false) {
            return false;
        }
        $serviceNamecc$Request rhs = (($serviceNamecc$Request) other);
        return (((super.equals(rhs)&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.wc == rhs.wc)||((this.wc!= null)&&this.wc.equals(rhs.wc))))&&((this.jur == rhs.jur)||((this.jur!= null)&&this.jur.equals(rhs.jur))));
    }

}
