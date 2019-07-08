package com.lcs.minecomponent;

import android.content.Context;
import android.content.Intent;

import com.lcs.componentlib.IMineInterface;

public class MineService implements IMineInterface {
    @Override
    public void launch(Context context) {
        Intent intent = new Intent(context, MineActivity.class);
        context.startActivity(intent);
    }
}
