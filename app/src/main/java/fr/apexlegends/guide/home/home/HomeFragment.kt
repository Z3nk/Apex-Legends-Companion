package fr.apexlegends.guide.home.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import fr.apexlegends.guide.R
import fr.apexlegends.guide.databinding.HomeFragmentBinding
import fr.apexlegends.guide.home.home.adapter.GameItemAdapter
import fr.apexlegends.guide.home.model.GameItem

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
            adapter = GameItemAdapter(
                listOf(
                    GameItem(R.drawable.flatline, "", "V-47 Flatline", "Fusil d'assault"),
                    GameItem(R.drawable.hemlok, "", "Hemlok", "Fusil d'assault"),
                    GameItem(R.drawable.r301, "", "R301", "Fusil d'assault"),
                    GameItem(R.drawable.alternator, "", "Alternator", "Mitraillette"),
                    GameItem(R.drawable.r99, "", "R-99", "Mitraillette"),
                    GameItem(R.drawable.prowler, "", "Pow Prowler Burst", "Mitraillette"),
                    GameItem(R.drawable.devotion, "", "Devotion", "Mitrailleuse"),
                    GameItem(R.drawable.spitfire, "", "M600 Spitfire", "Mitrailleuse"),
                    GameItem(R.drawable.g7, "", "G7 Scout", "Fusil de précision"),
                    GameItem(R.drawable.longbow, "", "Longbow-DMR", "Fusil de précision"),
                    GameItem(R.drawable.triple, "", "Fusil Triple", "Fusil de précision"),
                    GameItem(R.drawable.triple, "Légendaire", "Kraber", "Fusil de précision"),
                    GameItem(R.drawable.eva8, "", "Eva8 Auto", "Fusil à pompe"),
                    GameItem(R.drawable.peacekeeper, "", "Peacekeeper", "Fusil à pompe"),
                    GameItem(R.drawable.mastiff, "Légendaire", "Mastiff", "Fusil à pompe"),
                    GameItem(R.drawable.mozanbique, "", "Mozambique", "Fusil à pompe"),
                    GameItem(R.drawable.p2020, "", "P2020", "Pistolet"),
                    GameItem(R.drawable.re45, "", "RE-45", "Pistolet"),
                    GameItem(R.drawable.wingman, "", "Wingman", "Pistolet")
                )

            )
        }

    }
}