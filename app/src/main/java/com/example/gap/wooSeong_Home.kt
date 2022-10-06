package com.example.gap

import MainNaviWS
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.gap.databinding.MainNaviWsBinding

class wooSeong_Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_woo_seong_home)

        var tv_LS = findViewById<TextView>(R.id.tv_LShow);

//        supportFragmentManager.beginTransaction()
//            .replace(R.id.ws_home, MainNaviWS())
//            .commit()

//        supportFragmentManager.commit {
//            replace(R.id.ws_home, LookFragment())
//        }

    }
}