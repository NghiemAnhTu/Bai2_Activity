package com.example.bai2_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StudentActivity extends AppCompatActivity {
    EditText edtAddress, edtGender, edtClass, edtCourse, edtDate;
    Button btnStudent;
    TextView viewName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        // anh xa
        anhxa();
        // lay intent tu MainActivity
        final Intent intentMain = getIntent();
        //Student student = new Student();
        // lay obj
        final Bundle bundle = intentMain.getExtras();
        final Student student = bundle.getParcelable("Student");
        viewName.setText( student.getHoten() );

        btnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String diachi, lop, gioitinh, khoahoc, ngaysinh;
                diachi      = edtAddress.getText().toString();
                lop         = edtClass.getText().toString();
                gioitinh    = edtGender.getText().toString();
                khoahoc     = edtCourse.getText().toString();
                ngaysinh    = edtDate.getText().toString();

                if ( diachi.length() == 0 || lop.length() == 0 || gioitinh.length() == 0 || khoahoc.length() == 0 || ngaysinh.length() == 0 ){
                    Toast.makeText(StudentActivity.this, "Vui lòng nhập đầy đủ thông tin của học sinh.", Toast.LENGTH_SHORT).show();
                }else {
                    // gan thong tin cho student
                    student.setGioitinh( gioitinh );
                    student.setKhoahoc( khoahoc );
                    student.setNgaysinh( ngaysinh );
                    student.setLop(lop);
                    student.setDiachi( diachi );

                    // chuyen qua activity studentInfor
                    Intent intentStudent = new Intent(StudentActivity.this, StudentInforActivity.class);
                    // obj
                    bundle.putParcelable("Student", student);
                    intentStudent.putExtras( bundle );
                    startActivity(intentStudent);
                }
            }
        });


    }

    public void anhxa(){

        viewName    = (TextView) findViewById(R.id.viewNameStudent) ;
        edtDate     = (EditText) findViewById(R.id.edtDateStudent1);
        edtAddress  = (EditText) findViewById(R.id.edtAddressStudent);
        edtClass    = (EditText) findViewById(R.id.edtClassStudent);
        edtCourse   = (EditText) findViewById(R.id.edtCourseStudent);
        edtGender   = (EditText) findViewById(R.id.edtGenderStudent);
        btnStudent  = (Button)   findViewById(R.id.btnStudent);
    }
}
