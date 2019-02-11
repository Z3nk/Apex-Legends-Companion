package fr.apexlegends.guide.home.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import fr.apexlegends.guide.R
import fr.apexlegends.guide.model.Spell


class SpellItemAdapter(
    private val data: List<Spell>
) : RecyclerView.Adapter<SpellItemAdapter.VH>() {

    class VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val picture: ImageView? = itemView.findViewById(R.id.iv_spell)
        val name: TextView? = itemView.findViewById(R.id.tv_spell_name)
        val description: TextView? = itemView.findViewById(R.id.tv_spell_desc)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.picture?.setImageResource(data[position].picture)
        holder.name?.text = data[position].name
        holder.description?.text = holder.description?.context?.getString(data[position].description)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return SpellItemAdapter.VH(LayoutInflater.from(parent.context).inflate(R.layout.row_spell, parent, false))
    }

}