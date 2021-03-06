package ht.qtstudio.base.utils.controller

import android.view.View

interface ViewModelObservable {
    //methods to register and unregister observers
    fun register(obj: OnEventController?)

    fun unregister(obj: OnEventController?)

    //method to notify observers of change
    fun notifyObservers(
        @OnEventController.Companion.EventDef eventType: Int, view: View?,
        data: Any?
    )

    // post message to observer
    fun postMessage(@OnEventController.Companion.EventDef eventType: Int, msg: Any?)
}
