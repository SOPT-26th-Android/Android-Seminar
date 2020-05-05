package com.example.firstseminar

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.firstseminar.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        init()
    }
    private fun init(){
        btn_register.setOnClickListener {
            if(et_id.text.isNullOrBlank() || et_pwd.text.isNullOrBlank() || et_name.text.isNullOrBlank() || et_email.text.isNullOrBlank()|| et_phone.text.isNullOrBlank()) {
                Toast.makeText(this, "모두 입력했는지 확인해주세요", Toast.LENGTH_SHORT).show()
            }

            else {
                val intent = Intent()
                intent.putExtra("email", et_id.text.toString())
                intent.putExtra("password", et_pwd.text.toString())
                setResult(Activity.RESULT_OK, intent)
                finish()
            }
        }
    }
}
