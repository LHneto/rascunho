package com.meubolso.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.meubolso.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            startActivity(Intent(this, GanhosActivity::class.java))
        }

        btnExpenses.setOnClickListener {
            startActivity(Intent(this, GastosPorMesActivity::class.java))
        }

        btnIncome.setOnClickListener {
            startActivity(Intent(this, ReceitasPorMesActivity::class.java))
        }

        btnGoals.setOnClickListener {
            startActivity(Intent(this, MetasActivity::class.java))
        }
    }
}
