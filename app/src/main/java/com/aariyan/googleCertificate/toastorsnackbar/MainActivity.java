package com.aariyan.googleCertificate.toastorsnackbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Simple Toast :
        //Toast.makeText(this, "Simple Toast", Toast.LENGTH_SHORT).show();

        //Custom Toast
        showCustomToast();
    }

    private void showCustomToast() {

        //Instantiate Toast:
        Toast toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM,0,0);

        //Instantiate Custom created Layout for the Custom Toast :
        LayoutInflater inflater = getLayoutInflater();
        View customCreatedToastView = inflater.inflate(R.layout.custom_toast_layout,(ViewGroup)findViewById(R.id.rootLinearLayout));
        toast.setView(customCreatedToastView);
        toast.show();

    }
}
