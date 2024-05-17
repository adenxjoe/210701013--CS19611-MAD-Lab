package org.rajalakshmi.dialog_box

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog.Builder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etmsg : EditText = findViewById(R.id.etmsg)
        val btsubmit : Button = findViewById(R.id.btsubmit)
        btsubmit.setOnClickListener{
            val alertDialog = Builder(this)
                .setTitle("Mad Lab")
                .setMessage(etmsg.text.toString())
                .setPositiveButton("Ok"){
                    dialog ,which ->
                    Toast.makeText(applicationContext,"You clicked ok",Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("Cancel"){
                        dialog ,which ->
                    Toast.makeText(applicationContext,"You clicked cancel",Toast.LENGTH_SHORT).show()
                }
                .create()
            alertDialog.show()

        }
    }
}