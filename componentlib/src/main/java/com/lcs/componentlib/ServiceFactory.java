package com.lcs.componentlib;

public class ServiceFactory {
    private static final ServiceFactory ourInstance = new ServiceFactory();

    public static ServiceFactory getInstance() {
        return ourInstance;
    }

    private ServiceFactory() {}

    private ILoginInterface mLogin;

    private IMineInterface mMine;

    public ILoginInterface getmLogin() {
        return mLogin;
    }

    public void setmLogin(ILoginInterface mLogin) {
        this.mLogin = mLogin;
    }

    public IMineInterface getmMine() {
        return mMine;
    }

    public void setmMine(IMineInterface mMine) {
        this.mMine = mMine;
    }
}
