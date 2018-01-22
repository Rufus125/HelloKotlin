package es.voghdev.hellokotlin.global

import com.raizlabs.android.dbflow.annotation.Database

@Database(name = AppDatabase.NAME, version = AppDatabase.VERSION, generatedClassSeparator = "_")
object AppDatabase {
    const val NAME: String = "AppDB"
    const val VERSION: Int = 1

}