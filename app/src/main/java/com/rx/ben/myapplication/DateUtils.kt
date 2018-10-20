package com.rx.ben.myapplication

import java.text.SimpleDateFormat
import java.util.*

class DateUtils {
    companion object {
        fun getDate(): Date {
            return Calendar.getInstance().time
        }

        fun getEUFormattedDate(date: Date): String {
            return SimpleDateFormat("dd/MM/yyyy").format(date)
        }

        fun getUSFormattedDate(date: Date): String {
            return SimpleDateFormat("MM/dd/yyyy").format(date)
        }
    }
}