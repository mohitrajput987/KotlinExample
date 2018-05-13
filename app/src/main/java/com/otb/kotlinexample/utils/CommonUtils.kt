package com.otb.kotlinexample.utils

import java.util.regex.Pattern

/**
 * Created by Mohit Rajput on 12/5/18.
 * It contains common utility methods for this project
 */
class CommonUtils {
    fun getEvenNumbers(size: Int): Array<Int> {
        return Array(size, { i -> i * 2 });
    }

    companion object isValidEmail{
        fun isValidEmail(email: String): Boolean {
            return Pattern.compile(
                    "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]|[\\w-]{2,}))@"
                            + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                            + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                            + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                            + "[0-9]{1,2}|25[0-5]|2[0-4][0-9]))|"
                            + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$"
            ).matcher(email).matches()
        }
    }
}