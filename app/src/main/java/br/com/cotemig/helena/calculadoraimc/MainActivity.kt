package br.com.cotemig.helena.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import br.com.cotemig.helena.calculadoraimc.R.id.lblResultado
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalc.setOnClickListener {
            val altura = (txtAltura.text).toString().toFloat()
            val peso = (txtPeso.text).toString().toFloat()
            val resultado = peso/(altura*altura)

            if (resultado < 17 ) lblResultado.text = "Muito abaixo do peso"
            else if (resultado >= 17 && resultado < 18.49 ) lblResultado.text = "Abaixo do peso"
            else if (resultado >= 18.50 && resultado < 24.99 ) lblResultado.text = "Peso normal"
            else if (resultado >= 25 && resultado < 29.99 ) lblResultado.text = "Acima do peso"
            else if (resultado >= 30 && resultado < 34.99 ) lblResultado.text = "Obesidade I"
            else if (resultado >= 35 && resultado < 39.99 ) lblResultado.text = "Obesidade II (severa)"
            else if (resultado > 40 ) lblResultado.text = "Obesidade III (mórbida)"
        }
    }
}
