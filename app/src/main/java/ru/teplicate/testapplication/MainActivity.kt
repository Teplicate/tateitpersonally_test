package ru.teplicate.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.PhoneNumberUtils
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.AdapterView
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.spinner_item.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        val spinner = findViewById<Spinner>(R.id.flagSpinner)
        spinner.adapter = ImageSpinnerAdapter(this)
    }


}
