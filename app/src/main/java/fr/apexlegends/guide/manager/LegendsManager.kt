package fr.apexlegends.guide.manager

import android.content.Context
import fr.apexlegends.guide.R
import fr.apexlegends.guide.model.GameItem

class LegendsManager(val context: Context) : IManager {

    private val legends = listOf(
        GameItem(
            R.drawable.bangalore,
            R.drawable.bangalore,
            "",
            "Bangalore",
            context.getString(R.string.damage),
            context.getString(R.string.legend_bangalore)
        ),
        GameItem(
            R.drawable.bloodhound,
            R.drawable.bloodhound,
            "",
            "Bloodhound",
            context.getString(R.string.radar),
            context.getString(R.string.legend_bloodhount)
        ),
        GameItem(
            R.drawable.caustic,
            R.drawable.caustic,
            "",
            "Caustic",
            context.getString(R.string.tank),
            context.getString(R.string.legend_caustic)
        ),
        GameItem(
            R.drawable.gibraltar,
            R.drawable.gibraltar,
            "",
            "Gibraltar",
            context.getString(R.string.tank),
            context.getString(R.string.legend_gibraltar)
        ),
        GameItem(
            R.drawable.lifeline,
            R.drawable.lifeline,
            "",
            "Lifeline",
            context.getString(R.string.support),
            context.getString(R.string.legend_lifeline)
        ),
        GameItem(
            R.drawable.mirage,
            R.drawable.mirage,
            "",
            "Mirage",
            context.getString(R.string.damage),

            context.getString(R.string.legend_mirage)
        ),
        GameItem(
            R.drawable.pathfinder,
            R.drawable.pathfinder,
            "",
            "Pathfinder",
            context.getString(R.string.support),
            context.getString(R.string.legend_pathfinder)
        ),
        GameItem(
            R.drawable.wraith,
            R.drawable.wraith, "",
            "Wraith",
            context.getString(R.string.damage),
            context.getString(R.string.legend_wraith)
        )
    )

    override fun getList(): List<GameItem> {
        return legends
    }

    override fun getItem(id: Int?): GameItem {
        return legends.first { it.id == id }
    }


}