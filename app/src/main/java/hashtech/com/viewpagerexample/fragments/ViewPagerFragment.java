package hashtech.com.viewpagerexample.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import hashtech.com.viewpagerexample.R;

/**
 * Created by MFQ on 11/15/16.
 */

public class ViewPagerFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    public ViewPagerFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static ViewPagerFragment newInstance(int sectionNumber) {
        ViewPagerFragment fragment = new ViewPagerFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);

        String pagerNumber = String.valueOf(getArguments().getInt(ARG_SECTION_NUMBER));
        textView.setText(pagerNumber);

        return rootView;
    }

}
