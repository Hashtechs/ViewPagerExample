package hashtech.com.viewpagerexample.activity;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;

import hashtech.com.viewpagerexample.OnFragmmentCommnicate;
import hashtech.com.viewpagerexample.R;

public class ActivityWithFragment extends AppCompatActivity implements OnFragmmentCommnicate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainer, new FragmentExample(), "tag")
                .commit();





    }

    @Override
    protected void onResume() {
        super.onResume();

        // get Fragment Instance


        FragmentExample fragmentExample = (FragmentExample) getSupportFragmentManager().findFragmentByTag("tag");
        fragmentExample.setOnFragmmentCommnicate(this);
    }

    @Override
    public void onMessageSent(String message) {
        Snackbar.make(findViewById(R.id.parent), message, Snackbar.LENGTH_LONG).show();
    }
}
