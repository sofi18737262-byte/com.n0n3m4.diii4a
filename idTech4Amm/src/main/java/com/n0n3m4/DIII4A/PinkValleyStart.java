package com.n0n3m4.DIII4A;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

public class PinkValleyStart extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        String dir = "/storage/emulated/0/diii4a/uzdoom/";
        StringBuilder cmd = new StringBuilder("game.arm -iwad " + dir + "freedoom2.wad -file");
        for (int i = 1; i <= 9; i++)
        {
            cmd.append(" ").append(dir).append("pinkvalley_0").append(i).append(".pk3");
        }

        Intent intent = new Intent();
        intent.setComponent(new ComponentName(getPackageName(), "com.n0n3m4.q3e.Q3EMain"));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.putExtra("game", "zdoom");
        intent.putExtra("command", cmd.toString());
        startActivity(intent);
        finish();
    }
}
