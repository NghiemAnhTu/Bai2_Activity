package com.example.bai2_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class StudentInforActivity extends AppCompatActivity {

    TextView view_hoten, view_diachi, view_gioitinh, view_lop, view_khoahoc, view_ngaysinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infor);
        anhxa();

        // lay doi tuong tu studentactivity
        Intent intent   = getIntent();
        Bundle bundle   = intent.getExtras();
        Student student = (Student) bundle.getParcelable("Student");
        //  hien thi len view
        view_diachi.setText( "Quê quán: " + student.getDiachi() + "");
        view_gioitinh.setText("Giới tính: " + student.getGioitinh() + "");
        view_hoten.setText(student.getHoten() + "");
        view_khoahoc.setText("Khóa học: "+ student.getKhoahoc() + "");
        view_lop.setText("Lớp: " + student.getLop() + "");
        view_ngaysinh.setText("Ngày sinh: "+ student.getNgaysinh() + "");
    }

    // anh xa view
    public void anhxa(){
        view_hoten      = (TextView) findViewById(R.id.viewname);
        view_gioitinh   = (TextView) findViewById(R.id.viewGender);
        view_diachi     = (TextView) findViewById(R.id.viewAddress);
        view_khoahoc    = (TextView) findViewById(R.id.viewCourse);
        view_lop        = (TextView) findViewById(R.id.viewClass);
        view_ngaysinh   = (TextView) findViewById(R.id.viewDate);
    }
}
