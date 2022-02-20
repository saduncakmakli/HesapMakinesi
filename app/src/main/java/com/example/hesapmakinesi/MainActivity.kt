package com.example.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.example.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val counter = CounterClass()

    private lateinit var tasarim:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        tasarim.toolbar.title = "Hesap Makinesi"


        setContentView(tasarim.root)

        tasarim.button0.setOnClickListener {
            tasarim.textView.setText(counter.NumberButtonPressed(0))
        }
        tasarim.button1.setOnClickListener {
            tasarim.textView.setText(counter.NumberButtonPressed(1))
        }
        tasarim.button2.setOnClickListener {
            tasarim.textView.setText(counter.NumberButtonPressed(2))
        }
        tasarim.button3.setOnClickListener {
            tasarim.textView.setText(counter.NumberButtonPressed(3))
        }
        tasarim.button4.setOnClickListener {
            tasarim.textView.setText(counter.NumberButtonPressed(4))
        }
        tasarim.button5.setOnClickListener {
            tasarim.textView.setText(counter.NumberButtonPressed(5))
        }
        tasarim.button6.setOnClickListener {
            tasarim.textView.setText(counter.NumberButtonPressed(6))
        }
        tasarim.button7.setOnClickListener {
            tasarim.textView.setText(counter.NumberButtonPressed(7))
        }
        tasarim.button8.setOnClickListener {
            tasarim.textView.setText(counter.NumberButtonPressed(8))
        }
        tasarim.button9.setOnClickListener {
            tasarim.textView.setText(counter.NumberButtonPressed(9))
        }
        tasarim.buttonPlus.setOnClickListener {
            tasarim.textView.setText(counter.PlusButtonPressed())
        }
        tasarim.buttonEqual.setOnClickListener {
            tasarim.textView.setText(counter.EqualButtonPressed())
        }
    }
}