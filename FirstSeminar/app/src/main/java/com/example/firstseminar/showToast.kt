package com.example.firstseminar

import android.app.Activity
import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast


fun Activity.showToast(msg: String){
    val inflater : LayoutInflater = this.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    val layout = inflater.inflate(R.layout.custom_toast,this.findViewById(R.id.cl_toast_container))

    Toast(this).apply {
        layout.findViewById<TextView>(R.id.tv_toast_msg).text = msg
        view = layout
        duration = Toast.LENGTH_SHORT
        setGravity(Gravity.BOTTOM,0,100)
        show()
    }
}