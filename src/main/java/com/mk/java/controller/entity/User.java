package com.mk.java.controller.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Administrator
 */
public class User {

    private String userguid;
    private String username;
    private Integer isadmin;
    private String regionguid;
    private Integer usertype;
    private String loginname;
    private String cakey;
    private Integer changepassword;


    public String getUserguid() {
        return userguid;
    }

    public void setUserguid(String userguid) {
        this.userguid = userguid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Integer isadmin) {
        this.isadmin = isadmin;
    }

    public String getRegionguid() {
        return regionguid;
    }

    public void setRegionguid(String regionguid) {
        this.regionguid = regionguid;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getCakey() {
        return cakey;
    }

    public void setCakey(String cakey) {
        this.cakey = cakey;
    }

    public Integer getChangepassword() {
        return changepassword;
    }

    public void setChangepassword(Integer changepassword) {
        this.changepassword = changepassword;
    }
}
