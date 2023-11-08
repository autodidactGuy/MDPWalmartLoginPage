package edu.miu.cs473.mdpwalmartloginpage

import android.os.Bundle
import androidx.activity.ComponentActivity
import edu.miu.cs473.mdpwalmartloginpage.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}