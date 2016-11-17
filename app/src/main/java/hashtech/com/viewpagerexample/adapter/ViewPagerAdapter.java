package hashtech.com.viewpagerexample.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import hashtech.com.viewpagerexample.fragments.ViewPagerFragment;

/**
 * Created by MFQ on 11/15/16.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.

        // Return a PlaceholderFragment (defined as a static inner class below).
        ViewPagerFragment fragment = new ViewPagerFragment();
        Bundle args = new Bundle();
        args.putInt("pos", position);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }



    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "SECTION 1";
            case 1:
                return "SECTION 2";
            case 2:
                return "SECTION 3";
        }
        return null;
    }
}
















