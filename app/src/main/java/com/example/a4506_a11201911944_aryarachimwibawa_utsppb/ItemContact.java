package com.example.a4506_a11201911944_aryarachimwibawa_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ItemContact {
    //Deklarasi Variabel
    private String name;
    private String phone;

    //Konstruktor
    public ItemContact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    //Getter dan Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}