package com.okunu.componentbase;

import com.okunu.componentbase.empty_service.EmptyAccountService;
import com.okunu.componentbase.service.IAccountService;

public class ServiceFactory {

    private IAccountService accountService;

    private ServiceFactory(){
    }

    public static class Inner{
        private static ServiceFactory serviceFactory = new ServiceFactory();
    }

    public static ServiceFactory getInstance(){
        return Inner.serviceFactory;
    }

    public void setAccountService(IAccountService service){
        this.accountService = service;
    }

    public IAccountService getAccountService() {
        if (accountService == null){
            accountService = new EmptyAccountService();
        }
        return accountService;
    }
}
