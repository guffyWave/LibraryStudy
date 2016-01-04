package libstudy.guffy.com.librarystudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * The MainActivity program implements an application that
 * simply displays "Main Activity!" to the standard output.
 *
 * @author  Gufran Khurshid
 * @version 1.0
 * @since   2014-03-31
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
