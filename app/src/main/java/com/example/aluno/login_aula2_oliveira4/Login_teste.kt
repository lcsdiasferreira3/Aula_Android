package com.example.aluno.login_aula2_oliveira4

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import kotlinx.android.synthetic.main.activity_login_teste.*
import java.sql.BatchUpdateException


class Login_teste : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_teste)
        setSupportActionBar(toolbar)


       //val btLogin : Button = findViewById<Button>(R.id.btLogin)

        //btLogin.setOnClickListener(View.OnClickListener { it
        //val textView


        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

}
