package com.example.uielementsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class BotonesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_botones, container, false)

        // Referencias a los botones del XML
        val btnNormal = view.findViewById<Button>(R.id.btnNormal)
        val btnIcono = view.findViewById<ImageButton>(R.id.btnIcono)
        val fabEjemplo = view.findViewById<FloatingActionButton>(R.id.fabEjemplo)

        // Acción: Botón Normal
        btnNormal.setOnClickListener {
            Toast.makeText(requireContext(), "Botón Estándar presionado", Toast.LENGTH_SHORT).show()
        }

        // Acción: ImageButton
        btnIcono.setOnClickListener {
            Toast.makeText(requireContext(), "¡Has activado la Cámara!", Toast.LENGTH_SHORT).show()
        }

        // Acción: Floating Action Button (FAB)
        fabEjemplo.setOnClickListener {
            // El Snackbar aparece en la parte inferior y es más elegante
            Snackbar.make(view, "Acción rápida añadida con éxito", Snackbar.LENGTH_LONG)
                .setAction("Deshacer") {
                    Toast.makeText(requireContext(), "Acción cancelada", Toast.LENGTH_SHORT).show()
                }
                .show()
        }

        return view
    }
}