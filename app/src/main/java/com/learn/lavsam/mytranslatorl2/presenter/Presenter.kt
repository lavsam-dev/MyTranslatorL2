package com.learn.lavsam.mytranslatorl2.presenter

import com.learn.lavsam.mytranslatorl2.model.data.AppState
import com.learn.lavsam.mytranslatorl2.view.base.View

interface Presenter<T : AppState, V : View> {

    fun attachView(view: V)

    fun detachView(view: V)

    fun getData(word: String, isOnline: Boolean)
}