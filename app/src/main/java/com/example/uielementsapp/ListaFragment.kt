package com.example.uielementsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import android.view.ViewGroup

class ListaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_lista, container, false)

        val lista = view.findViewById<ListView>(R.id.listaEjemplo)

        val tecnologias = arrayOf(
            "Python",
            "Java",
            "Kotlin",
            "C++",
            "JavaScript",
            "HTML",
            "CSS",
            "SQL",
            "Android Studio",
            "Git",
            "Docker",
            "Node.js"
        )

        val adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_1,
            tecnologias
        )

        lista.adapter = adapter

        lista.setOnItemClickListener { _, _, position, _ ->

            Toast.makeText(
                context,
                "Seleccionaste: ${tecnologias[position]}",
                Toast.LENGTH_SHORT
            ).show()

        }

        return view
    }
}