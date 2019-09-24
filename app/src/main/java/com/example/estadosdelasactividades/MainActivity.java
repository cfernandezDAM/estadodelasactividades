package com.example.estadosdelasactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static String TAG = "Principal";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast toast = Toast.makeText(getApplicationContext(), "Estoy on create", Toast.LENGTH_LONG);
        toast.show();

        Log.i(TAG, "Estoy en onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Estoy onStart", Toast.LENGTH_SHORT).show();

        Log.i(TAG, "Estoy en onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Estoy onStop", Toast.LENGTH_SHORT).show();

        Log.i(TAG, "Estoy en onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Estoy onDestroy", Toast.LENGTH_SHORT).show();

        Log.i(TAG, "Estoy en onDestroy");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(this, "Estoy onPostResume", Toast.LENGTH_SHORT).show();

        Log.i(TAG, "Estoy en onPostResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Estoy onRestart", Toast.LENGTH_SHORT).show();

        Log.i(TAG, "Estoy en onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Estoy onPause", Toast.LENGTH_SHORT).show();

        Log.i(TAG, "Estoy en onPause");
    }
}
