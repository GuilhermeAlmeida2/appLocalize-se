package com.mapaetec.localize_se

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.mapaetec.localize_se.databinding.ActivityFormLoginBinding


class FormLogin : AppCompatActivity() {

    private lateinit var binding :ActivityFormLoginBinding

    lateinit var text_tela_cadastro:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFormLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        binding.textTelaCadastrar.setOnClickListener {

            IniciarComponentes()
        }
    }

    private fun IniciarComponentes(){
        text_tela_cadastro= findViewById(R.id.text_tela_cadastrar)
        val IniciarComponentes= Intent(this,FormCadastro::class.java)
        startActivity(IniciarComponentes)
    }
}