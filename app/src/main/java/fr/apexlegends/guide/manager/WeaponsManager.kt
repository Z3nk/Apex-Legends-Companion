package fr.apexlegends.guide.manager

import android.content.Context
import fr.apexlegends.guide.R
import fr.apexlegends.guide.model.GameItem

class WeaponsManager(context: Context) : IManager {
    private val weapons = listOf(
        GameItem(
            R.drawable.flatline,
            R.drawable.flatline,
            "",
            "V-47 Flatline",
            context.getString(R.string.AR),
            context.getString(R.string.description_V47_flatline)
        ),
        GameItem(
            R.drawable.hemlok,
            R.drawable.hemlok,
            "",
            "Hemlok",
            context.getString(R.string.AR),
            context.getString(R.string.description_hemlok)
        ),
        GameItem(
            R.drawable.r301,
            R.drawable.r301,
            "",
            "R301",
            context.getString(R.string.AR),
            context.getString(R.string.description_R301_Carbine)
        ),
        GameItem(
            R.drawable.alternator,
            R.drawable.alternator,
            "",
            "Alternator",
            context.getString(R.string.smg),
            context.getString(R.string.description_alternator)
        ),
        GameItem(
            R.drawable.r99,
            R.drawable.r99,
            "",
            "R-99",
            context.getString(R.string.smg),
            context.getString(R.string.description_R99)
        ),
        GameItem(
            R.drawable.prowler,
            R.drawable.prowler,
            "",
            "Pow Prowler Burst",
            context.getString(R.string.smg),
            context.getString(R.string.description_prowler)
        ),
        GameItem(
            R.drawable.devotion,
            R.drawable.devotion,
            "",
            "Devotion",
            context.getString(R.string.heavy_ar),
            context.getString(R.string.description_devotion)
        ),
        GameItem(
            R.drawable.spitfire,
            R.drawable.spitfire,
            "",
            "M600 Spitfire",
            context.getString(R.string.heavy_ar),
            context.getString(R.string.description_spitfire)
        ),
        GameItem(
            R.drawable.g7,
            R.drawable.g7,
            "",
            "G7 Scout",
            context.getString(R.string.sniper),
            context.getString(R.string.description_G7)
        ),
        GameItem(
            R.drawable.longbow,
            R.drawable.longbow,
            "",
            "Longbow-DMR",
            context.getString(R.string.sniper),
            context.getString(R.string.description_longbow)
        ),
        GameItem(
            R.drawable.triple,
            R.drawable.triple,
            "",
            "Fusil Triple",
            context.getString(R.string.sniper),
            context.getString(R.string.description_triple_take)
        ),
        GameItem(
            R.drawable.kraber,
            R.drawable.kraber,
            "Légendaire",
            "Kraber",
            context.getString(R.string.sniper),
            context.getString(R.string.description_kraber)
        ),
        GameItem(
            R.drawable.eva8,
            R.drawable.eva8,
            "",
            "Eva8 Auto",
            context.getString(R.string.shotgun),
            context.getString(R.string.description_EVA8)
        ),
        GameItem(
            R.drawable.peacekeeper,
            R.drawable.peacekeeper,
            "",
            "Peacekeeper",
            context.getString(R.string.shotgun),
            context.getString(R.string.description_peacekeeper)
        ),
        GameItem(
            R.drawable.mastiff,
            R.drawable.mastiff,
            "Légendaire",
            "Mastiff",
            context.getString(R.string.shotgun),
            context.getString(R.string.description_mastiff)
        ),
        GameItem(
            R.drawable.mozanbique,
            R.drawable.mozanbique,
            "",
            "Mozambique",
            context.getString(R.string.shotgun),
            context.getString(R.string.description_mozambique)
        ),
        GameItem(
            R.drawable.p2020,
            R.drawable.p2020,
            "",
            "P2020",
            context.getString(R.string.pistol),
            context.getString(R.string.description_P2020)
        ),
        GameItem(
            R.drawable.re45,
            R.drawable.re45,
            "",
            "RE-45",
            context.getString(R.string.pistol),
            context.getString(R.string.description_RE_45)
        ),
        GameItem(
            R.drawable.wingman,
            R.drawable.wingman,
            "",
            "Wingman",
            context.getString(R.string.pistol),
            context.getString(R.string.description_wingman)
        )
    )


    override fun getList(): List<GameItem> {
        return weapons
    }

    override fun getItem(id: Int?): GameItem {
        return weapons.first { it.id == id }
    }
}