package com.example.uielementsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.Toast

class SeleccionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_seleccion, container, false)

        val pizza = view.findViewById<CheckBox>(R.id.checkPizza)
        val hamburguesa = view.findViewById<CheckBox>(R.id.checkHamburguesa)
        val radioGrupo = view.findViewById<RadioGroup>(R.id.radioGrupo)
        val notificaciones = view.findViewById<Switch>(R.id.switchNotificaciones)
        val tacos = view.findViewById<CheckBox>(R.id.checkTacos)

        tacos.setOnClickListener {
            Toast.makeText(context, "Seleccionaste Tacos", Toast.LENGTH_SHORT).show()
        }
        pizza.setOnClickListener {
            Toast.makeText(context, "Seleccionaste Pizza", Toast.LENGTH_SHORT).show()
        }

        hamburguesa.setOnClickListener {
            Toast.makeText(context, "Seleccionaste Hamburguesa", Toast.LENGTH_SHORT).show()
        }

        radioGrupo.setOnCheckedChangeListener { _, checkedId ->

            val mensaje = when (checkedId) {
                R.id.radioHombre -> "Seleccionaste Hombre"
                R.id.radioMujer -> "Seleccionaste Mujer"
                else -> ""
            }

            Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show()
        }

        notificaciones.setOnCheckedChangeListener { _, isChecked ->

            if (isChecked) {
                Toast.makeText(context, "Notificaciones activadas", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "Notificaciones desactivadas", Toast.LENGTH_SHORT).show()
            }

        }

        return view
    }
}