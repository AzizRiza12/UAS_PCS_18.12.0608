package id.azizriza0608.uaslivescore.ui.favorite

import id.azizriza0608.uaslivescore.data.db.entities.EventFavorite

interface ClickListener {
    fun onClickListener(eventFavorite: EventFavorite)
}