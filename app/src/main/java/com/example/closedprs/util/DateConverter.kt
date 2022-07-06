package com.example.closedprs.util

import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import kotlin.jvm.internal.Intrinsics

object DateConverter {

    fun convertDate(date: String): String {
        val parser =  SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'")
        val formatter = SimpleDateFormat("dd MMM yyyy HH:mm")
        val formattedDate = formatter.format(parser.parse(date))

        return formattedDate

    }
}