package fr.apexlegends.guide.home.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import fr.apexlegends.guide.databinding.HomeFragmentBinding

class HomeFragment : Fragment() {
    companion object {
        const val TAG = "HomeFragment"
    }

    lateinit var binding: HomeFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(TAG, "onCreateView")
        binding = HomeFragmentBinding.inflate(inflater, container, false)
        subscribeUI()
        return binding.root
    }

    private fun subscribeUI() {

    }
}