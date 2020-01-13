package ir.akhbar;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

/**
 * Created by ParsService on 1/12/2020.
 */

public class fragmentnavigation {
    public static void navigat(FragmentActivity activity, Fragment fragmentshow){

        activity.getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_layout,fragmentshow)
                .commit();
    }
}
