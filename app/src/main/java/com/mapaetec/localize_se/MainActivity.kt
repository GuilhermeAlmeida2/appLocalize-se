package com.mapaetec.localize_se

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mapaetec.localize_se.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btAcessarLogin.setOnClickListener{

            formlogin()
        }
        binding.btAcessarCadastrar.setOnClickListener{
            formCadastro()
        }
        binding.btAcessarApp.setOnClickListener{
            FormPaginaUm()
        }
    }
    private fun formlogin(){
        val formLogin= Intent(this,FormLogin::class.java)
        startActivity(formLogin)
    }
    private fun formCadastro(){
        val formCadastro= Intent(this,FormCadastro::class.java)
        startActivity(formCadastro)
    }
    private fun FormPaginaUm(){
        val FormPaginaUm= Intent(this,PageUm::class.java)
        startActivity(FormPaginaUm)
    }

}