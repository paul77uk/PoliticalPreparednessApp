package com.example.android.politicalpreparedness.election

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.android.politicalpreparedness.R
import com.example.android.politicalpreparedness.database.ElectionDatabase
import com.example.android.politicalpreparedness.databinding.FragmentElectionBinding
import com.example.android.politicalpreparedness.databinding.FragmentLaunchBinding
import com.example.android.politicalpreparedness.election.adapter.ElectionListAdapter
import com.example.android.politicalpreparedness.network.CivicsApi
import com.example.android.politicalpreparedness.network.jsonadapter.ElectionAdapter

class ElectionsFragment: Fragment() {

    //TODO: Declare ViewModel
    private val viewModel:  ElectionsViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
//
//        //TODO: Add ViewModel values and create ViewModel

//
//        //TODO: Add binding values
    val binding = FragmentElectionBinding.inflate(inflater)

        binding.viewModel = viewModel
//
//        //TODO: Link elections to voter info
//
//        //TODO: Initiate recycler adapters
        binding.lifecycleOwner = this
//
//        //TODO: Populate recycler adapters

//        binding.upcomingElectionRecyclerView.adapter = ElectionListAdapter()

//        viewModel.elections.observe(viewLifecycleOwner, Observer {
//            binding.upcomingElectionRecyclerView.adapter
//        })

        return binding.root
//
    }

    //TODO: Refresh adapters when fragment loads

}