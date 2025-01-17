package com.example.nextrack.utils

import android.app.Dialog
import android.widget.EditText
import android.widget.LinearLayout
import com.google.android.material.textfield.TextInputLayout

enum class Status{
    SUCCESS,
    ERROR,
    LOADING
}
fun Dialog.setupDialog(layoutRestId: Int){
    setContentView(layoutRestId)
    window!!.setLayout(
        LinearLayout.LayoutParams.MATCH_PARENT,
        LinearLayout.LayoutParams.WRAP_CONTENT
    )
    setCancelable(false)
}

fun validateEditText(editText: EditText, textTextInputLayout: TextInputLayout): Boolean {
    return when {
        editText.text.toString().trim().isEmpty() -> {
            textTextInputLayout.error = "Required"
            false
        }
        else -> {
            textTextInputLayout.error = null
            true
        }
    }
}