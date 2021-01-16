package id.azizriza0608.uaslivescore.ui.detail


import id.azizriza0608.uaslivescore.data.model.EventDetail

interface EventDetailView{
    fun showLoading()
    fun hideLoading()
    fun showEventDetail(data: List<EventDetail>)
}