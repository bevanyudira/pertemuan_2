package com.example.pertemuan_2

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pertemuan_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //private lateinit var binding:ActivityMainBinding
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCount.setOnClickListener {
            val hasilAmbilText = binding.txtNumber.text
            val angka = hasilAmbilText.toString().toInt()
            binding.txtNumber.text = ((angka+1).toString())
        }

        binding.btnToast.setOnClickListener {
            val text = binding.txtNumber.text.toString()
            Toast.makeText(this, "Text yang muncul adalah " + text, Toast.LENGTH_SHORT).show()
        }
        binding.btnMinus.setOnClickListener {
            val hasilAmbilText = binding.txtNumber.text
            val angka = hasilAmbilText.toString().toInt()
            binding.txtNumber.text = ((angka-1).toString())
        }
    }
}