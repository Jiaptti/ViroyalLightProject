package com.lightproject.entity;


/**
 * Created by hanjiaqi on 2017/12/20.
 */

public class SysUser {
    private int id;
    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户姓名
     */
    private String username;

    /**
     * 手机号码
     */
    private String phone;
    /**
     * 邮箱|登录帐号
     */
    private String email;
    /**
     * 密码
     */
    private String pswd;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 最后登录时间
     */
    private String lastLoginTime;
    /**
     * 1:有效，0:禁止登录
     */
    private Object status;

    /**
     * 角色ID
     */
    private Long roleId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
