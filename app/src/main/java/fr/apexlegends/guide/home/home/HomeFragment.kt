package fr.apexlegends.guide.home.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import fr.apexlegends.guide.R
import fr.apexlegends.guide.databinding.HomeFragmentBinding
import fr.apexlegends.guide.home.home.adapter.GameItemAdapter
import fr.apexlegends.guide.manager.LegendsManager
import fr.apexlegends.guide.manager.WeaponsManager
import fr.apexlegends.guide.model.GameItem

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
        binding.weaponsAdapter.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
            adapter = GameItemAdapter(WeaponsManager(context).getList()) {
                Navigation.findNavController(this).navigate(
                    HomeFragmentDirections.actionHomeFragmentToDetailsFragment(
                        it.id, getString(R.string.type_weapons)
                    )
                )
            }
        }
        binding.legendsAdapter.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
            adapter = GameItemAdapter(
                LegendsManager(context).getList()
            ) {
                Navigation.findNavController(this).navigate(
                    HomeFragmentDirections.actionHomeFragmentToDetailsFragment(
                        it.id, getString(R.string.type_legends)
                    )
                )
            }
        }
        binding.mapAdapter.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
            adapter = GameItemAdapter(
                listOf(
                    GameItem(R.drawable.carte, R.drawable.carte, "", "Respawn : Entertainement", "", "", "", "")
                )
            ) {

            }
        }

    }
}