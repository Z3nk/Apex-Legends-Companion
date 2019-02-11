package fr.apexlegends.guide.home.details

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import fr.apexlegends.guide.R
import fr.apexlegends.guide.databinding.DetailsFragmentBinding
import fr.apexlegends.guide.manager.IManager
import fr.apexlegends.guide.manager.LegendsManager
import fr.apexlegends.guide.manager.WeaponsManager
import fr.apexlegends.guide.model.GameItem

class DetailsFragment : Fragment() {
    companion object {
        const val TAG = "DetailsFragment"
    }

    lateinit var binding: DetailsFragmentBinding
    lateinit var manager: IManager
    lateinit var gameItem: GameItem

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(TAG, "onCreateView")
        binding = DetailsFragmentBinding.inflate(inflater, container, false)
        subscribeUI()
        return binding.root
    }

    private fun subscribeUI() {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val id = arguments?.getInt("id")
        val type = arguments?.getString("type")
        if (type == getString(R.string.type_weapons)) {
            manager = WeaponsManager(context!!)
        } else if (type == getString(R.string.type_legends)) {
            manager = LegendsManager(context!!)
        } else {
            Log.e(TAG, "This type is not handled yet")
        }

        gameItem = manager.getItem(id)

        binding.picture.setImageResource(gameItem.picture)
        binding.tvInformations.text = gameItem.description
    }
}