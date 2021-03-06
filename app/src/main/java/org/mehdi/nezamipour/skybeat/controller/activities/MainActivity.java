package org.mehdi.nezamipour.skybeat.controller.activities;

import android.content.Context;
import android.content.Intent;

import androidx.fragment.app.Fragment;

import org.mehdi.nezamipour.skybeat.controller.fragments.MainFragment;

public class MainActivity extends SingleFragmentActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, MainActivity.class);
    }


    @Override
    protected Fragment createFragment() {
        return MainFragment.newInstance();
    }
}