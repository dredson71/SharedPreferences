package com.app.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.txt_Mail);

        SharedPreferences preferences=getSharedPreferences("datos", Context.MODE_PRIVATE);
        et1.setText(preferences.getString("mail",""));
    }
    public void Guardar(View view){
        SharedPreferences preferences = getSharedPreferences("datos",Context.MODE_PRIVATE);
        SharedPreferences.Editor Obj_Editor=preferences.edit();
        Obj_Editor.putString("mail",et1.getText().toString());
        Obj_Editor.commit();
        finish();
    }
}
