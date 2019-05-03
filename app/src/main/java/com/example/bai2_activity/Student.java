package com.example.bai2_activity;


import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {

    private String hoten;
    private String diachi;
    private String gioitinh;
    private String ngaysinh;
    private String lop;
    private String khoahoc;


    public Student(){}
    public Student(Parcel source) {
        this.hoten      = source.readString();
        this.diachi     = source.readString();
        this.gioitinh   = source.readString();
        this.ngaysinh   = source.readString();
        this.lop        = source.readString();
        this.khoahoc    = source.readString();

    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoahoc() {
        return khoahoc;
    }

    public void setKhoahoc(String khoahoc) {
        this.khoahoc = khoahoc;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(hoten);
        dest.writeString(diachi);
        dest.writeString(gioitinh);
        dest.writeString(ngaysinh);
        dest.writeString(lop);
        dest.writeString(khoahoc);

    }
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator<Student>(){

        @Override
        public Student createFromParcel(Parcel source) {
            return new Student(source);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };
}
