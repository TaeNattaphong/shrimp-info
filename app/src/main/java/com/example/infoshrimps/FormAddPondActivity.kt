//package com.example.infoshrimps
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//import android.widget.AdapterView
//import android.widget.ArrayAdapter
//import android.widget.Spinner
//import kotlinx.android.synthetic.main.activity_form_add_pond.*
//import com.google.firebase.database.DatabaseReference
//import com.google.firebase.database.FirebaseDatabase
//import androidx.core.app.ComponentActivity.ExtraData
//import androidx.core.content.ContextCompat.getSystemService
//import android.icu.lang.UCharacter.GraphemeClusterBreak.T
//import com.ku.sa.shrimp.R
//import kotlinx.android.synthetic.main.pond_crate_dialog.*
//
//
//class FormAddPondActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_form_add_pond)
//
//        val work = arrayOf(
//            "กุ้งขาว",
//            "กุ้งก้ามกราม"
//        )
//        // Initializing an ArrayAdapter
//        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, work)
//        // Set the drop down view resource
//        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
//        // Finally, data bind the spinner object with dapter
//        spinner.adapter = adapter;
//        // Set an on item selected listener for spinner object
//        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(
//                parent: AdapterView<*>,
//                view: View,
//                position: Int,
//                id: Long
//            ) {
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>) {
//                // Another interface callback
//            }
//        }
//    }
//}
