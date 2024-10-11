package pe.idat.ec1ejercicio4

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import pe.idat.ec1ejercicio4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btncalcular.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val pares = StringBuilder()
        for (numero in 20 downTo 10){
            if(numero %2 ==0){
                pares.append("$numero ")
            }
        }
        binding.tvresultado.text = "Números pares entre 20 y 10: $pares"
    }
}