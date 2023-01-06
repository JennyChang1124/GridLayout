package com.example.gridlayout

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        card_users.setOnClickListener{
            val intent=Intent(this,UsersActivity::class.java);
            startActivity(intent);
        }
        card_add_users.setOnClickListener{
            val intent=Intent(this,AddUsersActivity::class.java);
            startActivity(intent);
    }
        card_report.setOnClickListener{
            val intent=Intent(this,ReportActivity::class.java);
            startActivity(intent);
        }
        settings.setOnClickListener{
            val intent=Intent(this,SettingsActivity::class.java);
            startActivity(intent);
        }

}
}