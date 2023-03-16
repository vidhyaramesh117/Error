package com.example.apiproject;

import com.google.gson.annotations.SerializedName;

public class data
{
    @SerializedName("name")
    private String role_name;

    public data(String name)
    {
        this.role_name = name;
    }

    public String getName()
    {
        return role_name;
    }
}
