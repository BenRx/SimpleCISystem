package com.rx.ben.myapplication

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.rx.ben.myapplication.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val formattedDate = if (LocaleUtils.getLocale() == "en_US") DateUtils.getUSFormattedDate(Calendar.getInstance().time) else DateUtils.getEUFormattedDate(Calendar.getInstance().time)
        binding.mainDate.text = String.format("Date : $formattedDate")
    }
}
