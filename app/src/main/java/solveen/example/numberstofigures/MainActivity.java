package solveen.example.numberstofigures;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.util.Log;

import android.view.View;

import android.widget.Button;

import android.widget.EditText;

import android.widget.TextView;

import android.widget.Toast;



public class MainActivity extends AppCompatActivity {



    TextView txtWords;

    Button btnConverter;

    EditText inputNumber;



    converter eng;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);





        txtWords = findViewById(R.id.txtFigures);

        btnConverter = findViewById(R.id.btnConvert);

        inputNumber = findViewById(R.id.iptNumber);



        eng = new converter();





        btnConverter.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {



                String number = inputNumber.getText().toString();



                Log.d("value", String.valueOf(number.length() + "" + number));



                if (number.isEmpty()) {



                    Toast.makeText(MainActivity.this, "Empty Fields", Toast.LENGTH_SHORT).show();

                } else {

                    String Inwords = eng.convertToWords(Integer.parseInt(number));



                    Toast.makeText(MainActivity.this, Inwords, Toast.LENGTH_SHORT).show();

                    txtWords.setText(Inwords);



                }

            }

        });





    }

}