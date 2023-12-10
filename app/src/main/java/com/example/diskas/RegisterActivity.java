package com.example.diskas;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class RegisterActivity extends AppCompatActivity {

    TextInputLayout passwordTextInputLayout, konfirmasiPasswordTextInputLayout;
    EditText editTextEmail, editTextNama, editTextPassword, editTextKonfirmasiPassword;
    Button buttonDaftar;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextNama = findViewById(R.id.editTextnama);
        passwordTextInputLayout = findViewById(R.id.passwordTextInputLayout);
        konfirmasiPasswordTextInputLayout = findViewById(R.id.konfirmasiPasswordTextInputLayout);
        editTextPassword = passwordTextInputLayout.getEditText();
        editTextKonfirmasiPassword = konfirmasiPasswordTextInputLayout.getEditText();

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

        // Tambahkan ikon untuk mengubah visibilitas pada EditText Konfirmasi Password
        if (editTextKonfirmasiPassword != null) {
            editTextKonfirmasiPassword.setCompoundDrawablesWithIntrinsicBounds(
                    0, 0, R.drawable.ic_visibility_off, 0);

            editTextKonfirmasiPassword.setOnTouchListener((v, event) -> {
                final int DRAWABLE_RIGHT = 2;
                if (event.getAction() == android.view.MotionEvent.ACTION_UP) {
                    if (event.getRawX() >= (editTextKonfirmasiPassword.getRight() - editTextKonfirmasiPassword.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                        togglePasswordVisibility(editTextKonfirmasiPassword);
                        return true;
                    }
                }
                return false;
            });
        }
    }

    // Method untuk mengubah visibilitas teks password
    private void togglePasswordVisibility(EditText editText) {
        int inputType = editText.getInputType();
        if (inputType == InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD) {
            editText.setInputType(InputType.TYPE_CLASS_TEXT |
                    InputType.TYPE_TEXT_VARIATION_PASSWORD);
            editText.setCompoundDrawablesWithIntrinsicBounds(
                    0, 0, R.drawable.ic_visibility_off, 0);
        } else {
            editText.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
            editText.setCompoundDrawablesWithIntrinsicBounds(
                    0, 0, R.drawable.ic_visibility, 0);
        }
        editText.setSelection(editText.length());
        buttonDaftar = findViewById(R.id.buttonDaftar);

        // Di sini Anda dapat menambahkan logika untuk tombol "Daftar", misalnya:
        buttonDaftar.setOnClickListener(view -> daftar());
    }

    private void daftar() {

        Intent intent = new Intent(RegisterActivity.this, BerhasilDaftar.class);
        startActivity(intent);

    }
}

