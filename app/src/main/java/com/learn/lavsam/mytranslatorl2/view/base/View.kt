package com.learn.lavsam.mytranslatorl2.view.base

import com.learn.lavsam.mytranslatorl2.model.data.AppState

interface View {

    fun renderData(appState: AppState)
}