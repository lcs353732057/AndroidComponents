package com.lcs.logincomponent;

import android.content.Context;
import android.content.Intent;

import com.lcs.componentlib.ILoginInterface;

public class LoginService implements ILoginInterface {
    @Override
    public void launch(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }
}
