package com.example.arqdsis.chamadoapp;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by fernandat on 17/05/2017.
 */

public class LoginRequester {

    private Context context;
    //private RequesterInterface loginInterface;
    private ProgressDialog progress;

    public LoginRequester(Context context /*RequesterInterface loginInterface*/){
        this.context        = context;
        //this.loginInterface = loginInterface;
    }
}
