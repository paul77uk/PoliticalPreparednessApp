package com.example.android.politicalpreparedness.election

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.politicalpreparedness.database.ElectionDatabase
import com.example.android.politicalpreparedness.network.CivicsApi
import com.example.android.politicalpreparedness.network.models.ElectionResponse
import kotlinx.coroutines.launch

//TODO: Construct ViewModel and provide election datasource
class ElectionsViewModel(application: Application): ViewModel() {


    //TODO: Create live data val for upcoming elections
    private val _elections = MutableLiveData<List<ElectionResponse>>()
    val elections: LiveData<List<ElectionResponse>> = _elections

    //TODO: Create live data val for saved elections

    //TODO: Create val and functions to populate live data for upcoming elections from the API and saved elections from local database
    private fun getElectionResponse() {
        viewModelScope.launch {
            _elections.value = CivicsApi.retrofitService.getElections()
        }
    }
    //TODO: Create functions to navigate to saved or upcoming election voter info

}