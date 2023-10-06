package com.example.mvvmarchitecturedemo.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvvmarchitecturedemo.presentation.paging.ProductPageAdapter
import com.example.mvvmarchitecturedemo.databinding.ActivityMainBinding
import com.example.mvvmarchitecturedemo.presentation.paging.LoadAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    lateinit var mainViewModal: MainViewModal
    lateinit var adapter: ProductPageAdapter
//    private val mainViewModel: MainViewModal by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter= ProductPageAdapter(this@MainActivity)

        mainViewModal= ViewModelProvider(this)[MainViewModal::class.java]

        binding.RvView.layoutManager=LinearLayoutManager(this)
        binding.RvView.setHasFixedSize(true)
        binding.RvView.adapter=adapter.withLoadStateHeaderAndFooter(
            header = LoadAdapter(),
            footer = LoadAdapter()
        )

        mainViewModal.list.observe(this,Observer{
            adapter.submitData(lifecycle,it)
        })

//        val mLayoutManager = LinearLayoutManager(this@MainActivity)
//        binding.RvView.layoutManager = mLayoutManager
//
//        val detailApi= ServiceGen.getIntance().create(DocumentApi::class.java)
//        val documentrepo= DocumentRepository(detailApi)
//        mainViewModal=ViewModelProvider(this,MainViewModalFactory(documentrepo)).get(MainViewModal::class.java)
//
//        mainViewModal.docs.observe(this, Observer{
//            Log.d("TAG11",it.events.toString())
//            binding.RvView.adapter= ProductAdapter(this@MainActivity,it.events)
//
//        })

    }
}