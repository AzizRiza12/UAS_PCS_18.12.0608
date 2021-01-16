package id.azizriza0608.uaslivescore.ui.event

import id.azizriza0608.uaslivescore.data.model.Event

interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showEventList(data: List<Event>)
}