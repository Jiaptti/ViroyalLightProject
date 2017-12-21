package com.lightproject.entity;

import java.util.List;

/**
 * Created by hanjiaqi on 2017/12/21.
 */

public class Test {

    /**
     * code : 200
     * message : 成功
     * list : [{"id":1,"nickname":"admin","username":"admin","phone":"15255257895","email":"admin@qq.com","pswd":"l9a0lajfwQ3VRSh4jUUJSQ==","createTime":"2016-06-16 11:15:33","lastLoginTime":"2017-12-21 14:21:45","status":"1","createNameId":null,"lastUpdateTime":null,"lastUpdateNameId":null,"roleId":null},{"id":2,"nickname":"root","username":"root","phone":"12332323232","email":"8446666@qq.com","pswd":"x16YjoF1LNE=","createTime":"2017-12-13 19:30:44","lastLoginTime":"2017-02-13 15:49:04","status":"1","createNameId":null,"lastUpdateTime":null,"lastUpdateNameId":null,"roleId":null},{"id":27,"nickname":"zhao","username":"zhao","phone":"15548548788","email":"123@123.com","pswd":"eC/MmhASeJDApVs80EUFtg==","createTime":"2017-12-20 16:02:26","lastLoginTime":"2017-12-20 17:39:04","status":"1","createNameId":null,"lastUpdateTime":null,"lastUpdateNameId":null,"roleId":null},{"id":28,"nickname":"luo","username":"luo","phone":"18616981234","email":"luo@163.com","pswd":"2VAatbK+bS2oD5LrkRnNpw==","createTime":"2017-12-20 16:25:31","lastLoginTime":"2017-12-21 11:28:05","status":"1","createNameId":null,"lastUpdateTime":null,"lastUpdateNameId":null,"roleId":null}]
     */

    private int code;
    private String message;
    private List<ListBean> list;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * id : 1
         * nickname : admin
         * username : admin
         * phone : 15255257895
         * email : admin@qq.com
         * pswd : l9a0lajfwQ3VRSh4jUUJSQ==
         * createTime : 2016-06-16 11:15:33
         * lastLoginTime : 2017-12-21 14:21:45
         * status : 1
         * createNameId : null
         * lastUpdateTime : null
         * lastUpdateNameId : null
         * roleId : null
         */

        private int id;
        private String nickname;
        private String username;
        private String phone;
        private String email;
        private String pswd;
        private String createTime;
        private String lastLoginTime;
        private String status;
        private Object createNameId;
        private Object lastUpdateTime;
        private Object lastUpdateNameId;
        private Object roleId;

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

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getLastLoginTime() {
            return lastLoginTime;
        }

        public void setLastLoginTime(String lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Object getCreateNameId() {
            return createNameId;
        }

        public void setCreateNameId(Object createNameId) {
            this.createNameId = createNameId;
        }

        public Object getLastUpdateTime() {
            return lastUpdateTime;
        }

        public void setLastUpdateTime(Object lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
        }

        public Object getLastUpdateNameId() {
            return lastUpdateNameId;
        }

        public void setLastUpdateNameId(Object lastUpdateNameId) {
            this.lastUpdateNameId = lastUpdateNameId;
        }

        public Object getRoleId() {
            return roleId;
        }

        public void setRoleId(Object roleId) {
            this.roleId = roleId;
        }
    }
}
