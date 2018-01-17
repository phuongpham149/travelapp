package com.example.phamthi.travel_app.base;

import android.app.Activity;
import android.app.Fragment;

public class BaseFragment extends Fragment {
    /**
     * Add Fragment to another fragment.
     *
     * @param activity     the activity parent of fragment
     * @param fragment     the fragment will be add
     * @param resContainId the id of resource component will be add content.
     */
    public void addFragment(Activity activity, Fragment fragment, int resContainId) {
        activity.getFragmentManager()
                .beginTransaction()
                .add(resContainId, fragment)
                .commit();
    }

    /**
     * Add Fragment to another fragment.
     *
     * @param activity       the activity parent of fragment
     * @param fragment       the fragment will be add
     * @param resContainId   the id of resource component will be add content.
     * @param addToBackStack decide add fragment will be add content to stack
     *                       and if add to back stack, when user press back, the content of old fragment will display.
     */
    public void addFragment(Activity activity, Fragment fragment, int resContainId, boolean addToBackStack) {
        if (addToBackStack) {
            activity.getFragmentManager()
                    .beginTransaction()
                    .add(resContainId, fragment)
                    .addToBackStack(fragment.getClass().getSimpleName())
                    .commit();
            return;
        }
        addFragment(activity, fragment, resContainId);
    }

    /**
     * Replace fragment to another fragment.
     *
     * @param activity     the activity parent of fragment
     * @param fragment     the fragment will be place.
     * @param resContainId the id of resource component will be add content.
     */
    public void replaceFragment(Activity activity, Fragment fragment, int resContainId) {
        activity.getFragmentManager()
                .beginTransaction()
                .replace(resContainId, fragment)
                .commit();
    }

    /**
     * Replace fragment to another fragment.
     *
     * @param activity       the activity parent of fragment
     * @param fragment       the fragment will be place.
     * @param resContainId   the id of resource component will be add content.
     * @param addToBackStack decide add fragment will be add content to stack
     *                       and if add to back stack, when user press back, the content of old fragment will display.
     */
    public void replaceFragment(Activity activity, Fragment fragment, int resContainId, boolean addToBackStack) {
        if (addToBackStack) {
            activity.getFragmentManager()
                    .beginTransaction()
                    .replace(resContainId, fragment)
                    .addToBackStack(fragment.getClass().getSimpleName())
                    .commit();
            return;
        }
        replaceFragment(activity, fragment, resContainId);
    }
}
