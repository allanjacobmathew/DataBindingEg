package com.example.allanjacob.databindingeg;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by allan.jacob on 2/18/2018.
 */

public class User extends BaseObservable {

    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(com.example.allanjacob.databindingeg.BR.email);
    }
}
