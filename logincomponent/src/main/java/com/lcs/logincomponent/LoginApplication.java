package com.lcs.logincomponent;

import android.app.Application;

import com.lcs.componentlib.IAppInterface;
import com.lcs.componentlib.ServiceFactory;

public class LoginApplication extends Application implements IAppInterface {
    private static Application application;

    public static Application getApplication() {
        return application;
    }

    @Override
    public void initializa(Application app) {
        application = app;
        ServiceFactory.getInstance().setmLogin(new LoginService());
    }
}
