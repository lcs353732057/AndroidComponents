package com.lcs.minecomponent;

import android.app.Application;

import com.lcs.componentlib.IAppInterface;
import com.lcs.componentlib.ServiceFactory;

public class MineApplication extends Application implements IAppInterface {
    private static Application application;

    public static Application getApplication() {
        return application;
    }

    @Override
    public void initializa(Application app) {
        application = app;
        ServiceFactory.getInstance().setmMine(new MineService());
    }
}
