package com.team.aphs.model;

import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

/**
 * 菜单权限表
 * menu_auth
 */
@Data
public class MenuAuth implements Serializable {
    private Long id;

    private String path;

    private String name;

    private String component;

    private String icon;

    private Boolean isLink;

    private Boolean isHide;

    private Boolean isFull;

    private Boolean isAffix;

    private Boolean isKeepAlive;

    private Integer parentId;

    private Integer userId;

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
        MenuAuth other = (MenuAuth) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPath() == null ? other.getPath() == null : this.getPath().equals(other.getPath()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getComponent() == null ? other.getComponent() == null : this.getComponent().equals(other.getComponent()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
            && (this.getIsLink() == null ? other.getIsLink() == null : this.getIsLink().equals(other.getIsLink()))
            && (this.getIsHide() == null ? other.getIsHide() == null : this.getIsHide().equals(other.getIsHide()))
            && (this.getIsFull() == null ? other.getIsFull() == null : this.getIsFull().equals(other.getIsFull()))
            && (this.getIsAffix() == null ? other.getIsAffix() == null : this.getIsAffix().equals(other.getIsAffix()))
            && (this.getIsKeepAlive() == null ? other.getIsKeepAlive() == null : this.getIsKeepAlive().equals(other.getIsKeepAlive()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPath() == null) ? 0 : getPath().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getComponent() == null) ? 0 : getComponent().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getIsLink() == null) ? 0 : getIsLink().hashCode());
        result = prime * result + ((getIsHide() == null) ? 0 : getIsHide().hashCode());
        result = prime * result + ((getIsFull() == null) ? 0 : getIsFull().hashCode());
        result = prime * result + ((getIsAffix() == null) ? 0 : getIsAffix().hashCode());
        result = prime * result + ((getIsKeepAlive() == null) ? 0 : getIsKeepAlive().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", path=").append(path);
        sb.append(", name=").append(name);
        sb.append(", component=").append(component);
        sb.append(", icon=").append(icon);
        sb.append(", isLink=").append(isLink);
        sb.append(", isHide=").append(isHide);
        sb.append(", isFull=").append(isFull);
        sb.append(", isAffix=").append(isAffix);
        sb.append(", isKeepAlive=").append(isKeepAlive);
        sb.append(", parentId=").append(parentId);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}