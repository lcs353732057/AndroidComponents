package com.lcs.androidcomponents;

import android.app.Application;

import com.lcs.componentlib.AppConfig;
import com.lcs.componentlib.IAppInterface;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        for (String component : AppConfig.COMPONENTS) {
            try {
                Class<?> classz = Class.forName(component);
                Object object = classz.newInstance();
                if (object instanceof IAppInterface) {
                    ((IAppInterface) object).initializa(this);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
