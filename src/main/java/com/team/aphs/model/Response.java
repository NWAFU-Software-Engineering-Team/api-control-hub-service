package com.team.aphs.model;

import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

/**
 * 响应表
 * response
 */
@Data
public class Response implements Serializable {
    private Long id;

    private Long apiId;

    private String body;

    private String cookies;

    private String headers;

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
        Response other = (Response) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getApiId() == null ? other.getApiId() == null : this.getApiId().equals(other.getApiId()))
            && (this.getBody() == null ? other.getBody() == null : this.getBody().equals(other.getBody()))
            && (this.getCookies() == null ? other.getCookies() == null : this.getCookies().equals(other.getCookies()))
            && (this.getHeaders() == null ? other.getHeaders() == null : this.getHeaders().equals(other.getHeaders()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getApiId() == null) ? 0 : getApiId().hashCode());
        result = prime * result + ((getBody() == null) ? 0 : getBody().hashCode());
        result = prime * result + ((getCookies() == null) ? 0 : getCookies().hashCode());
        result = prime * result + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", apiId=").append(apiId);
        sb.append(", body=").append(body);
        sb.append(", cookies=").append(cookies);
        sb.append(", headers=").append(headers);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}