package com.learn.lavsam.mytranslatorl2.view.base

import androidx.appcompat.app.AppCompatActivity
import com.learn.lavsam.mytranslatorl2.model.data.AppState
import com.learn.lavsam.mytranslatorl2.viewmodel.BaseViewModel
import com.learn.lavsam.mytranslatorl2.viewmodel.Interactor

abstract class BaseActivity<T : AppState, I : Interactor<T>> : AppCompatActivity() {

    abstract val model: BaseViewModel<T>

    abstract fun renderData(dataModel: T)
}
