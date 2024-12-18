package com.teka.kmp_sample.util.extensions

import com.teka.kmp_sample.util.DateFormatHelper.getFormattedDate

fun Long?.toStringFormat(): String {
    if (this == null) return ""
    return getFormattedDate(this, "dd MMM yyyy, HH:mm")
}