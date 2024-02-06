package com.myself223.card.data.room.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "Category")
data class CategoryModel(
    val name: ArrayList<CategoryModel>,
    val image: Int
): Serializable


