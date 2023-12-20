package com.example.diskas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class login extends AppCompatActivity {

    TextInputLayout passwordTextInputLayout;
    EditText editTextEmail, editTextPassword;
    Button buttonLogin, buttonDaftar2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editTextEmail = findViewById(R.id.editTextEmailLogin);
        passwordTextInputLayout = findViewById(R.id.passwordTextInputLayout);
        editTextPassword = passwordTextInputLayout.getEditText();

        if (editTextPassword != null) {
            editTextPassword.setCompoundDrawablesWithIntrinsicBounds(
                    0, 0, R.drawable.ic_visibility_off, 0);

            editTextPassword.setOnTouchListener((v, event) -> {
                final int DRAWABLE_RIGHT = 2;
                if (event.getAction() == android.view.MotionEvent.ACTION_UP) {
                    if (event.getRawX() >= (editTextPassword.getRight() - editTextPassword.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                        togglePasswordVisibility(editTextPassword);
                        return true;
                    }
                }
                return false;
            });
        }

        buttonDaftar2 = findViewById(R.id.buttonDaftar2);
        buttonDaftar2.setOnClickListener(view -> daftar());

    }
    private void daftar(){
        Intent intent = new Intent(login.this, RegisterActivity.class);
        startActivity(intent);
    }


    private void togglePasswordVisibility(EditText editTextPassword) {
        int inputType = editTextPassword.getInputType();
        if (inputType == InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD) {
            editTextPassword.setInputType(InputType.TYPE_CLASS_TEXT |
                    InputType.TYPE_TEXT_VARIATION_PASSWORD);
            editTextPassword.setCompoundDrawablesWithIntrinsicBounds(
                    0, 0, R.drawable.ic_visibility_off, 0);
        } else {
            editTextPassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
            editTextPassword.setCompoundDrawablesWithIntrinsicBounds(
                    0, 0, R.drawable.ic_visibility, 0);
        }
    }
}