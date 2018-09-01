package ph.edu.iicsust.santiano.nicolaskyle.myfirsttime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pressMeButton = (Button) findViewById(R.id.pressMeButton);
        Button pressMeButton2 = (Button) findViewById(R.id.pressMeButton2);
        pressMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputeditText1 = (EditText) findViewById(R.id.editText1);
                EditText inputeditText2 = (EditText) findViewById(R.id.editText2);
                TextView resultTextView = (TextView) findViewById(R.id.resulttextView);

                int firstNum, secondNum;

                firstNum = Integer.parseInt(inputeditText1.getText().toString());
                secondNum = Integer.parseInt(inputeditText2.getText().toString());

                if(firstNum>secondNum){
                    resultTextView.setText("First Number is greater.");
                }
                else if(secondNum>firstNum){
                    resultTextView.setText("Second Number is greater");
                }
                else {
                    resultTextView.setText("No greater value.");
                }


            }
        });
        pressMeButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                TextView resultTextView = (TextView) findViewById(R.id.resulttextView);
                int count = 0, current = 1;
                String result="";

                do {
                    if (current % 2 == 0) {
                        result+=" "+current;
                        count++;
                    }
                    current++;
                } while (count != 10);

                resultTextView.setText(result);
            }
        });
    }
}
