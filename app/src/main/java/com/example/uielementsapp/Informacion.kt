package com.example.uielementsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.Fragment

class InfoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_informacion, container, false)

        val progressBar = view.findViewById<ProgressBar>(R.id.pbCarga)
        val tvEstado = view.findViewById<TextView>(R.id.tvEstadoProgreso)
        val btnSimular = view.findViewById<Button>(R.id.btnSimularCarga)

        btnSimular.setOnClickListener {
            // Bloqueamos el botón para que no inicien múltiples cargas a la vez
            btnSimular.isEnabled = false
            progressBar.progress = 0

            // Creamos un hilo para simular el paso del tiempo
            Thread {
                var progressStatus = 0
                while (progressStatus < 100) {
                    progressStatus += 10
                    Thread.sleep(300) // Pausa de 300ms entre incrementos

                    // Actualizamos la interfaz desde el hilo principal (UI Thread)
                    activity?.runOnUiThread {
                        progressBar.progress = progressStatus
                        tvEstado.text = "Progreso: $progressStatus%"

                        if (progressStatus == 100) {
                            tvEstado.text = "¡Descarga Completada!"
                            btnSimular.isEnabled = true
                            btnSimular.text = "Reiniciar Carga"
                        }
                    }
                }
            }.start()
        }

        return view
    }
}