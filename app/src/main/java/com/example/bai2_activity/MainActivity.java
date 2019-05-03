package com.example.bai2_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText name;
    Button btnMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // anh xa
        btnMain = (Button) findViewById(R.id.btnMain);
        name    = (EditText) findViewById(R.id.edtName);

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten = name.getText().toString();
                if ( ten.length() != 0 ){
                    Intent intent = new Intent(MainActivity.this, StudentActivity.class);
                    // obj
                    Student student = new Student();
                    student.setHoten( ten );
                    // parcelabe
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("Student", student);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this, "Vui lòng điền tên.", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
