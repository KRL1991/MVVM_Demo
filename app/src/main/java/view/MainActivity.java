package view;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import test.project_cleanarchitecture.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button updateButton = (Button) findViewById(R.id.UpdateButton);
        updateButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                EditText userInputEditText = (EditText) findViewById(R.id.UserInputEditText);
                TextView savedTextTextView = (TextView) findViewById(R.id.SavedTextTextView);

               savedTextTextView.setText(userInputEditText.getText());


            }
        });


        }












    }
