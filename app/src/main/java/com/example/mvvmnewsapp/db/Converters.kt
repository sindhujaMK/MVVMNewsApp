package com.example.mvvmnewsapp.db

import androidx.room.TypeConverter
import com.example.mvvmnewsapp.models.Source

class Converters {

    @TypeConverter
    //convert the list of Meaning to String:
    fun fromSource(source: Source) : String {
        return source.name
    }

    @TypeConverter
    //converting Json back to a list of Meaning:
    fun toSource(name  :String) : Source {
        return Source(name, name)
    }
}