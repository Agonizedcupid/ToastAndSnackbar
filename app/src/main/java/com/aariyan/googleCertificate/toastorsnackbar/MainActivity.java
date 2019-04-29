package com.aariyan.googleCertificate.toastorsnackbar;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Simple Toast :
        //Toast.makeText(this, "Simple Toast", Toast.LENGTH_SHORT).show();

        coordinatorLayout = findViewById(R.id.coordinatorLayout);
        Snackbar.make(coordinatorLayout,R.string.snackBarText,Snackbar.LENGTH_LONG)
                .setAction(R.string.undo, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        //this is for Custom Toast show when click on Undo Button :
                        showCustomToast();
                    }
                }).show();
        //Custom Toast
        //showCustomToast();
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
