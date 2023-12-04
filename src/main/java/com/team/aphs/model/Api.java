package com.team.aphs.model;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 接口表
 * api
 */
@Data
public class Api implements Serializable {
    private Long id;

    private String apiMethod;

    private String apiUrl;

    private String apiRequest;

    private String apiResponse;

    private Long creatorId;

    private Long projectId;

    private Date ctime;

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
        Api other = (Api) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getApiMethod() == null ? other.getApiMethod() == null : this.getApiMethod().equals(other.getApiMethod()))
            && (this.getApiUrl() == null ? other.getApiUrl() == null : this.getApiUrl().equals(other.getApiUrl()))
            && (this.getApiRequest() == null ? other.getApiRequest() == null : this.getApiRequest().equals(other.getApiRequest()))
            && (this.getApiResponse() == null ? other.getApiResponse() == null : this.getApiResponse().equals(other.getApiResponse()))
            && (this.getCreatorId() == null ? other.getCreatorId() == null : this.getCreatorId().equals(other.getCreatorId()))
            && (this.getProjectId() == null ? other.getProjectId() == null : this.getProjectId().equals(other.getProjectId()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getApiMethod() == null) ? 0 : getApiMethod().hashCode());
        result = prime * result + ((getApiUrl() == null) ? 0 : getApiUrl().hashCode());
        result = prime * result + ((getApiRequest() == null) ? 0 : getApiRequest().hashCode());
        result = prime * result + ((getApiResponse() == null) ? 0 : getApiResponse().hashCode());
        result = prime * result + ((getCreatorId() == null) ? 0 : getCreatorId().hashCode());
        result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", apiMethod=").append(apiMethod);
        sb.append(", apiUrl=").append(apiUrl);
        sb.append(", apiRequest=").append(apiRequest);
        sb.append(", apiResponse=").append(apiResponse);
        sb.append(", creatorId=").append(creatorId);
        sb.append(", projectId=").append(projectId);
        sb.append(", ctime=").append(ctime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}