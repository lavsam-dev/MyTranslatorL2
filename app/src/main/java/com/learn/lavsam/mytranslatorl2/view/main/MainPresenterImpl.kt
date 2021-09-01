package com.learn.lavsam.mytranslatorl2.view.main

import com.learn.lavsam.mytranslatorl2.model.data.AppState
import com.learn.lavsam.mytranslatorl2.model.datasource.DataSourceLocal
import com.learn.lavsam.mytranslatorl2.model.datasource.DataSourceRemote
import com.learn.lavsam.mytranslatorl2.model.repository.RepositoryImplementation
import com.learn.lavsam.mytranslatorl2.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver

//class MainPresenterImpl<T : AppState, V : View>(
//    private val interactor: MainInteractor = MainInteractor(
//        RepositoryImplementation(DataSourceRemote()),
//        RepositoryImplementation(DataSourceLocal())
//    ),
//    protected val compositeDisposable: CompositeDisposable = CompositeDisposable(),
//    protected val schedulerProvider: SchedulerProvider = SchedulerProvider()
//) : Presenter<T, V> {
//
//    private var currentView: V? = null
//
//    override fun attachView(view: V) {
//        if (view != currentView) {
//            currentView = view
//        }
//    }
//
//    override fun detachView(view: V) {
//        compositeDisposable.clear()
//        if (view == currentView) {
//            currentView = null
//        }
//    }
//
//    override fun getData(word: String, isOnline: Boolean) {
//        compositeDisposable.add(
//            interactor.getData(word, isOnline)
//                .subscribeOn(schedulerProvider.io())
//                .observeOn(schedulerProvider.ui())
//                .doOnSubscribe { currentView?.renderData(AppState.Loading(null)) }
//                .subscribeWith(getObserver())
//        )
//    }
//
//    private fun getObserver(): DisposableObserver<AppState> {
//        return object : DisposableObserver<AppState>() {
//
//            override fun onNext(appState: AppState) {
//                currentView?.renderData(appState)
//            }
//
//            override fun onError(e: Throwable) {
//                currentView?.renderData(AppState.Error(e))
//            }
//
//            override fun onComplete() {
//            }
//        }
//    }
//}