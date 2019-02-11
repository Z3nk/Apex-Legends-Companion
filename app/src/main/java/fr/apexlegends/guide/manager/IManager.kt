package fr.apexlegends.guide.manager

import fr.apexlegends.guide.model.GameItem

interface IManager {
    fun getList(): List<GameItem>
    fun getItem(id: Int?): GameItem
}