package com.example.foodapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.example.foodapp.R
import com.example.foodapp.activities.MainActivity
import com.example.foodapp.adapters.CategoriesAdapter
import com.example.foodapp.databinding.FragmentCategoriesBinding
import com.example.foodapp.viewModel.HomeViewModel


class CategoriesFragment : Fragment() {

//    private lateinit var binding:FragmentCategoriesBinding
//    private lateinit var categoriesAdapter: CategoriesAdapter
//    private lateinit var viewModel:HomeViewModel
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        viewModel = (activity as MainActivity).homeMvvm
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        binding = FragmentCategoriesBinding.inflate(layoutInflater)
//        return binding.root
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        prepareRecyclerView()
//        observeCategories()
//    }
//
//    private fun observeCategories() {
//        viewModel.observeCategoryLiveData().observe(viewLifecycleOwner, Observer{ categories ->
//            categoriesAdapter.setCategories(categories)
//
//        })
//    }
//
//    private fun prepareRecyclerView() {
//        categoriesAdapter = CategoriesAdapter()
//        binding.rvCategories.apply {
//            layoutManager = GridLayoutManager(context,3,GridLayoutManager.VERTICAL, false)
//            adapter = categoriesAdapter
//        }
//    }

}