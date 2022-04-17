package developer.osmanforhad.xmlanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Define Variable
    Button Mybtn;
    Animation ZoomIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initial the variable with XML UI ID
        Mybtn = (Button) findViewById(R.id.btnId);

        //Connect XML Animation file with this java class
        ZoomIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in_animation);

        //setup animation effect on the button
        Mybtn.startAnimation(ZoomIn);
    }
}