package com.team.aphs.model;

import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

/**
 * cookie 表
 * cookies
 */
@Data
public class Cookies implements Serializable {
    private Long id;

    private String name;

    private String value;

    private String path;

    private Long expires;

    private Integer belongsToRequest;

    private Long requestResponseId;

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
        Cookies other = (Cookies) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()))
            && (this.getPath() == null ? other.getPath() == null : this.getPath().equals(other.getPath()))
            && (this.getExpires() == null ? other.getExpires() == null : this.getExpires().equals(other.getExpires()))
            && (this.getBelongsToRequest() == null ? other.getBelongsToRequest() == null : this.getBelongsToRequest().equals(other.getBelongsToRequest()))
            && (this.getRequestResponseId() == null ? other.getRequestResponseId() == null : this.getRequestResponseId().equals(other.getRequestResponseId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getPath() == null) ? 0 : getPath().hashCode());
        result = prime * result + ((getExpires() == null) ? 0 : getExpires().hashCode());
        result = prime * result + ((getBelongsToRequest() == null) ? 0 : getBelongsToRequest().hashCode());
        result = prime * result + ((getRequestResponseId() == null) ? 0 : getRequestResponseId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", value=").append(value);
        sb.append(", path=").append(path);
        sb.append(", expires=").append(expires);
        sb.append(", belongsToRequest=").append(belongsToRequest);
        sb.append(", requestResponseId=").append(requestResponseId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}