package hashtech.com.viewpagerexample.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import hashtech.com.viewpagerexample.OnFragmmentCommnicate;
import hashtech.com.viewpagerexample.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class FragmentExample extends Fragment implements View.OnClickListener {

    private TextView textActivity;
    OnFragmmentCommnicate mOnFragmmentCommnicate;


    public void setOnFragmmentCommnicate(OnFragmmentCommnicate onFragmmentCommnicate) {
        mOnFragmmentCommnicate = onFragmmentCommnicate;
    }

    public FragmentExample() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main2, container, false);

        // from Fragment
        Button buttonSend = (Button) v.findViewById(R.id.bSend);
        Button buttoFragment = (Button) v.findViewById(R.id.bFragment);

        // get view  from Activity
        textActivity = (TextView) getActivity().findViewById(R.id.tvActivity);

        buttoFragment.setOnClickListener(this);
        buttonSend.setOnClickListener(this);




        callMethod();








        return v;
    }

    private void callMethod() {

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.bFragment) {
            textActivity.setText("Fragment Changed Me");

        } else {
            if (mOnFragmmentCommnicate != null) {
                mOnFragmmentCommnicate.onMessageSent("I'm a message sent From Fragment");
            }
        }
    }
}
