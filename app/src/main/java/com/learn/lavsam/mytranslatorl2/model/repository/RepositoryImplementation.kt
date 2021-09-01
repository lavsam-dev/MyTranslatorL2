package com.learn.lavsam.mytranslatorl2.model.repository

import com.learn.lavsam.mytranslatorl2.model.data.DataModel
import com.learn.lavsam.mytranslatorl2.model.datasource.DataSource
import io.reactivex.Observable

class RepositoryImplementation(private val dataSource: DataSource<List<DataModel>>) :
    Repository<List<DataModel>> {

    override fun getData(word: String): Observable<List<DataModel>> {
        return dataSource.getData(word)
    }
}