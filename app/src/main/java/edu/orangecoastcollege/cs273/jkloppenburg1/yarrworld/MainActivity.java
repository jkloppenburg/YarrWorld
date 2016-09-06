package edu.orangecoastcollege.cs273.jkloppenburg1.yarrworld;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Define the botton as an instance variable (member variable)
    private Button speakButton;
    private Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Restoring user settings on previous settings
        super.onCreate(savedInstanceState);
        //Inflating (!) opening the layout from activity_main (activity_main.xml)
        setContentView(R.layout.activity_main);

        //Hook up the speakButton to the one in our view:
        speakButton = (Button) findViewById(R.id.speakButton);
        // Wire up the speakButton to perform an onClick event
        speakButton.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Toast.makeText(context, R.string.toast_text, Toast.LENGTH_LONG).show();
                    }
            }
        );
    }
}
