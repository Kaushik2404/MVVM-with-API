package com.example.mvvmarchitecturedemo.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmarchitecturedemo.data.remote.DocumentApi
import com.example.mvvmarchitecturedemo.databinding.ActivityMainBinding
import com.example.mvvmarchitecturedemo.domain.repository.DocumentRepository
import com.example.mvvmarchitecturedemo.network.ServiceGen

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    lateinit var mainViewModal: MainViewModal
//    private val mainViewModel: MainViewModal by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val detailApi= ServiceGen.getIntance().create(DocumentApi::class.java)
        val documentrepo= DocumentRepository(detailApi)
        mainViewModal=ViewModelProvider(this,MainViewModalFactory(documentrepo)).get(MainViewModal::class.java)

        mainViewModal.docs.observe(this, Observer{
            Log.d("TAG11",it.toString())
        })

//        val detailApi= ServiceGen.getIntance().create(DetailApi::class.java)
//        val movieRepo= MovieRepo(detailApi)
//        mainViewModal=ViewModelProvider(this,MainViewModalFactory(movieRepo)).get(MainViewModal::class.java)
//
//        mainViewModal.movies.observe(this, Observer{
//            Log.d("TAG11",it.results.toString())
//        })
    }
}