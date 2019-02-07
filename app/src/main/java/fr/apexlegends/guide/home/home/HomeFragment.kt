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
            adapter = GameItemAdapter(
                listOf(
                    GameItem(R.drawable.flatline, "", "V-47 Flatline", context.getString(R.string.AR)),
                    GameItem(R.drawable.hemlok, "", "Hemlok", context.getString(R.string.AR)),
                    GameItem(R.drawable.r301, "", "R301", context.getString(R.string.AR)),
                    GameItem(R.drawable.alternator, "", "Alternator", context.getString(R.string.smg)),
                    GameItem(R.drawable.r99, "", "R-99", context.getString(R.string.smg)),
                    GameItem(R.drawable.prowler, "", "Pow Prowler Burst", context.getString(R.string.smg)),
                    GameItem(R.drawable.devotion, "", "Devotion", context.getString(R.string.heavy_ar)),
                    GameItem(R.drawable.spitfire, "", "M600 Spitfire", context.getString(R.string.heavy_ar)),
                    GameItem(R.drawable.g7, "", "G7 Scout", context.getString(R.string.sniper)),
                    GameItem(R.drawable.longbow, "", "Longbow-DMR", context.getString(R.string.sniper)),
                    GameItem(R.drawable.triple, "", "Fusil Triple", context.getString(R.string.sniper)),
                    GameItem(R.drawable.triple, "Légendaire", "Kraber", context.getString(R.string.sniper)),
                    GameItem(R.drawable.eva8, "", "Eva8 Auto", context.getString(R.string.shotgun)),
                    GameItem(R.drawable.peacekeeper, "", "Peacekeeper", context.getString(R.string.shotgun)),
                    GameItem(R.drawable.mastiff, "Légendaire", "Mastiff", context.getString(R.string.shotgun)),
                    GameItem(R.drawable.mozanbique, "", "Mozambique", context.getString(R.string.shotgun)),
                    GameItem(R.drawable.p2020, "", "P2020", context.getString(R.string.pistol)),
                    GameItem(R.drawable.re45, "", "RE-45", context.getString(R.string.pistol)),
                    GameItem(R.drawable.wingman, "", "Wingman", context.getString(R.string.pistol))
                )
            ) {

            }
        }
        binding.legendsAdapter.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
            adapter = GameItemAdapter(
                listOf(
                    GameItem(R.drawable.bangalore, "", "Bangalore", context.getString(R.string.damage)),
                    GameItem(R.drawable.bloodhound, "", "Bloodhound", context.getString(R.string.radar)),
                    GameItem(R.drawable.caustic, "", "Caustic", context.getString(R.string.tank)),
                    GameItem(R.drawable.gibraltar, "", "Gibraltar", context.getString(R.string.tank)),
                    GameItem(R.drawable.lifeline, "", "Lifeline", context.getString(R.string.support)),
                    GameItem(R.drawable.mirage, "", "Mirage", context.getString(R.string.damage)),
                    GameItem(R.drawable.pathfinder, "", "Pathfinder", context.getString(R.string.support)),
                    GameItem(R.drawable.wraith, "", "Wraith", context.getString(R.string.damage))
                )
            ) {
                HomeFragmentDirections.actionHomeFragmentToDetailsFragment(
                    R.id.action_homeFragment_to_detailsFragment, context.getString(
                        R.string.type_legends
                    )
                )
                Navigation.findNavController(this).navigate(
                    HomeFragmentDirections.actionHomeFragmentToDetailsFragment(
                        R.id.action_homeFragment_to_detailsFragment, context.getString(
                            R.string.type_legends
                        )
                    )
                )
            }
        }
        binding.mapAdapter.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
            adapter = GameItemAdapter(
                listOf(
                    GameItem(R.drawable.carte, "", "Respawn : Entertainement", "")
                )
            ) {

            }
        }

    }
}