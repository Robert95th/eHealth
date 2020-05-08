package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final String FILE_NAME = "userData.json";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.home);


        TextView overV=findViewById(R.id.overView);
        overV.setText("The Hospital Referral system is a system that  that offers a one-stop mobile" +
                "medical services platform among patients, hospitals and doctorsThe app should allow booking of appointments to shorten waiting times\n" +
                "and hospital stays.\n" +
                "\n"+
                "-The App allows symptom-based self-assessment and health\n" +
                "education. ");




        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch(menuItem.getItemId()){
                    case R.id.dashboard:
                        startActivity(new Intent(getApplicationContext()
                                , bookAppointment.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.home:

                        return true;
                    case R.id.about:
                        startActivity(new Intent(getApplicationContext()
                                , HealthEducation.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.doc:
                        Intent intent = new Intent(MainActivity.this, DoctorsAdmin.class);
                        intent.putExtra("message", "");
                        startActivity(intent);
                        return true;
                }
                return false;
            }
        });



    }
    public void save() {



String text=" ";
        FileOutputStream fos = null;

        try {

            fos = openFileOutput(FILE_NAME, MODE_PRIVATE);
            fos.write(text.getBytes());

            //clear things


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
