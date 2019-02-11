package fr.apexlegends.guide.home.details

import android.os.Bundle
import android.text.Editable
import android.text.Html
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout
import fr.apexlegends.guide.R
import fr.apexlegends.guide.databinding.DetailsFragmentBinding
import fr.apexlegends.guide.manager.IManager
import fr.apexlegends.guide.manager.LegendsManager
import fr.apexlegends.guide.manager.WeaponsManager
import fr.apexlegends.guide.model.GameItem
import org.xml.sax.XMLReader


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

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.text) {
                    getString(R.string.tab_informations) -> {
                        binding.layoutInformations.visibility = View.VISIBLE
                        binding.layoutStats.visibility = View.GONE
                    }
                    getString(R.string.tab_stats) -> {
                        binding.layoutInformations.visibility = View.GONE
                        binding.layoutStats.visibility = View.VISIBLE
                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })

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
        binding.tvInformations.text = Html.fromHtml(gameItem.description, null, UlTagHandler())
        binding.tvStats.text = Html.fromHtml(gameItem.stats, null, UlTagHandler())
    }

    inner class UlTagHandler : Html.TagHandler {
        override fun handleTag(
            opening: Boolean, tag: String, output: Editable,
            xmlReader: XMLReader
        ) {
            if (tag == "ul" && !opening) output.append("\n")
            if (tag == "li" && opening) output.append("\n\t•")
        }
    }
}