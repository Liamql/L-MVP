package com.example.administrator.l_mvp.MVP.model;


import java.util.List;

public class User {

    String name,pass;

    User(String name,String pass)
    {
        this.name = name;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return name + ":" + pass + "\n";
    }

}
