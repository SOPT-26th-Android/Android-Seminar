package com.example.firstseminar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.firstseminar.data.RequestLogin
import com.example.firstseminar.data.ResponseLogin
import com.example.firstseminar.network.RequestToServer
import com.example.firstseminar.network.customEnqueue
import kotlinx.android.synthetic.main.activity_login.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {
    val requestToServer = RequestToServer//싱글톤 그대로 가져옴
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener {
            if(et_id.text.isNullOrBlank()||et_password.text.isNullOrBlank()){
                Toast.makeText(this,"아이디와 비밀번호를 확인하세요",Toast.LENGTH_SHORT).show()
            }else{
                requestToServer.service.requestLogin(
                    RequestLogin(
                        id = et_id.text.toString(),
                        password = et_password.text.toString()
                    )//로그인 정보를 전달
                ).customEnqueue(
                    onError = {showToast("올바르지 못한 요청입니다")},
                    onSuccess = {
                        if(it.success){
                            showToast("로그인 성공")
                            val intent = Intent(this@LoginActivity, MainActivity::class.java)
                            startActivity(intent)
                            finish()
                        }else{
                            showToast("아이디/비밀번호를 확인하세요!")
                        }
                    }
                )

            }
        }
        tv_register.setOnClickListener {
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
