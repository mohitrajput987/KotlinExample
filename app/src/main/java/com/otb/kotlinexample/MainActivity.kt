package com.otb.kotlinexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.otb.kotlinexample.utils.CommonUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val VALID_EMAILS = arrayOf("abc1@gmail.com", "abc2@gmail.com")
    private val VALID_PASSWORD = "abc123"
    private val rawString = """
        Hey dear,
        This is mohit Rajput
        """

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    fun init() {
        btnLogin.setOnClickListener({
            if (areFieldsValid()) {
                Toast.makeText(this, R.string.logged_in_success, Toast.LENGTH_SHORT).show()
            }
        })
    }

    fun areFieldsValid(): Boolean {
        var email: String = etEmail.text.toString()
        var password: String = etPassword.text.toString()
        val areFieldsValid: Boolean = if (email.isEmpty()) {
            etEmail.setError(getString(R.string.enter_email))
            etEmail.requestFocus()
            false
        } else if (!CommonUtils.isValidEmail(email)) {
            etEmail.setError(getString(R.string.enter_valid_email))
            etEmail.requestFocus()
            false
        } else if (password.isEmpty()) {
            etPassword.setError(getString(R.string.enter_password))
            etPassword.requestFocus()
            false
        } else if (!password.equals(VALID_PASSWORD)) {
            etPassword.setError(getString(R.string.invalid_password))
            etPassword.requestFocus()
            false
        } else {
            true
        }
        return areFieldsValid;
    }
}
