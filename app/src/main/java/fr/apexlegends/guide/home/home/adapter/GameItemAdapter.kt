package fr.apexlegends.guide.home.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import fr.apexlegends.guide.R
import fr.apexlegends.guide.model.GameItem


class GameItemAdapter(
    private val data: List<GameItem>,
    val onClick: (gameItem: GameItem) -> Unit
) : RecyclerView.Adapter<GameItemAdapter.VH>() {

    class VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView? = itemView.findViewById(R.id.tv_title)
        val subtitle: TextView? = itemView.findViewById(R.id.tv_subtitle)
        val name: TextView? = itemView.findViewById(R.id.tv_name)
        val picture: ImageView? = itemView.findViewById(R.id.iv_game_item)
        val container: View? = itemView.findViewById(R.id.container)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.title?.text = data[position].title
        holder.subtitle?.text = data[position].subTitle
        holder.name?.text = data[position].name
        holder.picture?.setImageResource(data[position].picture)
        holder.container?.setOnClickListener {
            onClick(data[position])
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return GameItemAdapter.VH(LayoutInflater.from(parent.context).inflate(R.layout.row_game_item, parent, false))
    }

}