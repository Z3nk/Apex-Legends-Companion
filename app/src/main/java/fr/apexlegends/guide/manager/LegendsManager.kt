package fr.apexlegends.guide.manager

import android.content.Context
import fr.apexlegends.guide.R
import fr.apexlegends.guide.model.GameItem
import fr.apexlegends.guide.model.Spell

class LegendsManager(val context: Context) : IManager {

    private val legends = listOf(
        GameItem(
            R.drawable.bangalore,
            R.drawable.bangalore,
            "",
            "Bangalore",
            context.getString(R.string.damage),
            context.getString(R.string.legend_bangalore),
            spells = listOf(
                Spell(
                    context.getString(R.string.double_time),
                    R.string.description_double_time,
                    R.drawable.double_time
                ),
                Spell(
                    context.getString(R.string.smoke_launcher),
                    R.string.description_smoke_launcher,
                    R.drawable.smoke_launcher
                ),
                Spell(
                    context.getString(R.string.rolling_thunder),
                    R.string.description_rolling_thunder,
                    R.drawable.rolling_thunder
                )
            )
        ),
        GameItem(
            R.drawable.bloodhound,
            R.drawable.bloodhound,
            "",
            "Bloodhound",
            context.getString(R.string.radar),
            context.getString(R.string.legend_bloodhount),
            spells = listOf(
                Spell(
                    context.getString(R.string.tracker),
                    R.string.description_tracker,
                    R.drawable.tracker
                ),
                Spell(
                    context.getString(R.string.eye_allfather),
                    R.string.description_eye_allfather,
                    R.drawable.eye_father
                ),
                Spell(
                    context.getString(R.string.beast_hunt),
                    R.string.description_beast_hunt,
                    R.drawable.beast_of_hunt
                )
            )
        ),
        GameItem(
            R.drawable.caustic,
            R.drawable.caustic,
            "",
            "Caustic",
            context.getString(R.string.tank),
            context.getString(R.string.legend_caustic),
            spells = listOf(
                Spell(
                    context.getString(R.string.nox_vision),
                    R.string.description_nox_vision,
                    R.drawable.nox_vision
                ),
                Spell(
                    context.getString(R.string.gas_trap),
                    R.string.description_gas_trap,
                    R.drawable.nox_gas_trap
                ),
                Spell(
                    context.getString(R.string.nox_gas_grenade),
                    R.string.description_nox_gas_grenade,
                    R.drawable.nox_gas_grenade
                )
            )
        ),
        GameItem(
            R.drawable.gibraltar,
            R.drawable.gibraltar,
            "",
            "Gibraltar",
            context.getString(R.string.tank),
            context.getString(R.string.legend_gibraltar),
            spells = listOf(
                Spell(
                    context.getString(R.string.gun_shield),
                    R.string.description_gun_shield,
                    R.drawable.gun_shield
                ),
                Spell(
                    context.getString(R.string.dome_protection),
                    R.string.description_dome_protection,
                    R.drawable.dome_protection
                ),
                Spell(
                    context.getString(R.string.defensive_bombardment),
                    R.string.description_defensive_bombardment,
                    R.drawable.defensive_bombardment
                )
            )
        ),
        GameItem(
            R.drawable.lifeline,
            R.drawable.lifeline,
            "",
            "Lifeline",
            context.getString(R.string.support),
            context.getString(R.string.legend_lifeline),
            spells = listOf(
                Spell(
                    context.getString(R.string.combat_medic),
                    R.string.description_combat_medic,
                    R.drawable.combat_medic
                ),
                Spell(
                    context.getString(R.string.heal_drone),
                    R.string.description_heal_drone,
                    R.drawable.heal_drone
                ),
                Spell(
                    context.getString(R.string.care_package),
                    R.string.description_care_package,
                    R.drawable.care_package
                )
            )
        ),
        GameItem(
            R.drawable.mirage,
            R.drawable.mirage,
            "",
            "Mirage",
            context.getString(R.string.damage),
            context.getString(R.string.legend_mirage),
            spells = listOf(
                Spell(
                    context.getString(R.string.encore),
                    R.string.description_encore,
                    R.drawable.encore
                ),
                Spell(
                    context.getString(R.string.psyche_out),
                    R.string.description_psyche_out,
                    R.drawable.psyche_put
                ),
                Spell(
                    context.getString(R.string.vanishing_act),
                    R.string.description_vanishing_act,
                    R.drawable.vanishing_act
                )
            )
        ),
        GameItem(
            R.drawable.pathfinder,
            R.drawable.pathfinder,
            "",
            "Pathfinder",
            context.getString(R.string.support),
            context.getString(R.string.legend_pathfinder),
            spells = listOf(
                Spell(
                    context.getString(R.string.insider_knowledge),
                    R.string.description_insider_knowledge,
                    R.drawable.insider_knowledge
                ),
                Spell(
                    context.getString(R.string.grappling_hook),
                    R.string.description_grappling_hook,
                    R.drawable.grappling_hook
                ),
                Spell(
                    context.getString(R.string.zipline_gun),
                    R.string.description_zipline_gun,
                    R.drawable.zipline_gun
                )
            )
        ),
        GameItem(
            R.drawable.wraith,
            R.drawable.wraith, "",
            "Wraith",
            context.getString(R.string.damage),
            context.getString(R.string.legend_wraith),
            spells = listOf(
                Spell(
                    context.getString(R.string.voice_void),
                    R.string.description_voice_void,
                    R.drawable.voice_void
                ),
                Spell(
                    context.getString(R.string.into_void),
                    R.string.description_into_void,
                    R.drawable.into_void
                ),
                Spell(
                    context.getString(R.string.dimensional_rift),
                    R.string.description_dimensional_rift,
                    R.drawable.dimensional_rift
                )
            )
        )
    )

    override fun getList(): List<GameItem> {
        return legends
    }

    override fun getItem(id: Int?): GameItem {
        return legends.first { it.id == id }
    }


}