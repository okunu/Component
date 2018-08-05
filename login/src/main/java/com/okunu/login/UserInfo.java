package com.okunu.login;

public class UserInfo {
    private String accountId;
    private String userName;

    public UserInfo(){};

    public UserInfo(String account, String userName){
        this.accountId = account;
        this.userName = userName;
    }

    public String getAccountId(){
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
