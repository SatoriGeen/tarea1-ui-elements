package com.example.uielementsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class TextFieldsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_text_fields, container, false)

        val etName = view.findViewById<EditText>(R.id.etName)
        val etPhone = view.findViewById<EditText>(R.id.etPhone)
        val etPassword = view.findViewById<EditText>(R.id.etPassword)
        val btnSubmit = view.findViewById<Button>(R.id.btnSubmitText)

        btnSubmit.setOnClickListener {
            val name = etName.text.toString()
            if (name.isNotEmpty()) {
                Toast.makeText(requireContext(), "Hola $name, datos registrados", Toast.LENGTH_SHORT).show()
                // Limpiamos los campos para demostrar interactividad
                etName.text.clear()
                etPhone.text.clear()
                etPassword.text.clear()
            } else {
                Toast.makeText(requireContext(), "Por favor ingresa tu nombre", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }
}