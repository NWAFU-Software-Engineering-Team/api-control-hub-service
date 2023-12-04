package com.team.aphs.model;

import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

/**
 * 请求头表
 * headers
 */
@Data
public class Headers implements Serializable {
    private Long id;

    private Boolean belongsToRequestResponse;

    private Long requestResponseId;

    private String key;

    private String value;

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Headers other = (Headers) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBelongsToRequestResponse() == null ? other.getBelongsToRequestResponse() == null : this.getBelongsToRequestResponse().equals(other.getBelongsToRequestResponse()))
            && (this.getRequestResponseId() == null ? other.getRequestResponseId() == null : this.getRequestResponseId().equals(other.getRequestResponseId()))
            && (this.getKey() == null ? other.getKey() == null : this.getKey().equals(other.getKey()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBelongsToRequestResponse() == null) ? 0 : getBelongsToRequestResponse().hashCode());
        result = prime * result + ((getRequestResponseId() == null) ? 0 : getRequestResponseId().hashCode());
        result = prime * result + ((getKey() == null) ? 0 : getKey().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", belongsToRequestResponse=").append(belongsToRequestResponse);
        sb.append(", requestResponseId=").append(requestResponseId);
        sb.append(", key=").append(key);
        sb.append(", value=").append(value);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}