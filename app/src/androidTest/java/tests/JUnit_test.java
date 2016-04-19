package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.dlee.lab3_exercise.MainActivity;
import com.dlee.lab3_exercise.R;

/**
 * Created by darien on 4/19/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnit_test() {
        super(MainActivity.class);
    }
    public void test_first()
    {
        mainActivity = getActivity();
        TextView textView = (TextView) mainActivity.findViewById(R.id.textView);
        String tester = textView.getText().toString();

        assertEquals("", tester);
    }
}
