package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class bookAppointment extends AppCompatActivity {
    private static final String FILE_NAME = "userData.json";
    EditText e1, e2, e3, e4, e5;
    Button subBtn;
    TextView textView;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_appointment);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.dashboard);

        e1 = findViewById(R.id.firstName);
        e2 = findViewById(R.id.lastName);
        e3 = findViewById(R.id.age);
        e4 = findViewById(R.id.lastVist);
        e5 = findViewById(R.id.visitReason);

        textView = findViewById(R.id.selectedI);

        subBtn = findViewById(R.id.submitBtn);

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
            }
        });


        //navigation

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.dashboard:

                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                , MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.about:
                        startActivity(new Intent(getApplicationContext()
                                , HealthEducation.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.doc:
                        startActivity(new Intent(getApplicationContext()
                                , DoctorsAdmin.class));
                        Intent intent = new Intent(bookAppointment.this, DoctorsAdmin.class);
                        intent.putExtra("message", message);
                        startActivity(intent);
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
    }

    public void save() {
        String fname = e1.getText().toString();
        String lname = e2.getText().toString();
        String age = e3.getText().toString();
        String lastDate = e4.getText().toString();
        String reasnVisit = e5.getText().toString();
        final Random rand = new Random();
        String date = (String.valueOf(rand.nextInt(31)) + "-" + String.valueOf(rand.nextInt(12)) + "-2020");

        String text =
                "    FirstName:" + fname + ",\n" +
                "    LastName:" + lname + ",\n" +
                "    Age:" + age + ",\n" +
                "    Last Visit:" + lastDate + ",\n" +
                "    Appointment:" + date + ",\n" +
                "    Reason:" + reasnVisit + "\n"
               ;
        FileOutputStream fos = null;
        textView.setText(String.valueOf("Dear " + fname + " you " + "appointment \nDate is " + date));

        message = text;

        try {

            fos = openFileOutput(FILE_NAME, MODE_PRIVATE);
            fos.write(text.getBytes());

            //clear things
            e1.getText().clear();
            e2.getText().clear();
            e3.getText().clear();
            e4.getText().clear();
            e5.getText().clear();

            Toast.makeText(this, "Saved", Toast.LENGTH_LONG);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }


}
