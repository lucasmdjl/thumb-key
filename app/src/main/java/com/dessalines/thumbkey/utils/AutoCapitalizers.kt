package com.dessalines.thumbkey.utils

import com.dessalines.thumbkey.IMEService

typealias AutoCapitalizers = Array<(IMEService) -> Unit>

fun autoCapitalizeI(ime: IMEService) {
    // Capitalizes 'i'
    val textBefore = ime.currentInputConnection.getTextBeforeCursor(3, 0)
    if (!textBefore.isNullOrEmpty()) {
        if (textBefore.trimStart() == "i ") {
            ime.currentInputConnection.deleteSurroundingText(2, 0)
            ime.currentInputConnection.commitText(
                "I ",
                1,
            )
        }
    }
}

fun autoCapitalizeIApostrophe(ime: IMEService) {
    // Capitalizes "i'"
    val textBefore = ime.currentInputConnection.getTextBeforeCursor(3, 0)
    if (!textBefore.isNullOrEmpty()) {
        if (textBefore.trimStart() == "i\'") {
            ime.currentInputConnection.deleteSurroundingText(2, 0)
            ime.currentInputConnection.commitText(
                "I\'",
                1,
            )
        }
    }
}

fun autoCapitalizeIApostropheLL(ime: IMEService) {
    // Capitalizes "i'll"
    val textBefore = ime.currentInputConnection.getTextBeforeCursor(5, 0)
    if (!textBefore.isNullOrEmpty()) {
        if (textBefore.trimStart() == "i\'ll") {
            ime.currentInputConnection.deleteSurroundingText(4, 0)
            ime.currentInputConnection.commitText(
                "I\'ll",
                1,
            )
        }
    }
}

fun autoCapitalizeStarI(ime: IMEService) {
    // Capitalizes "*i"
    val textBefore = ime.currentInputConnection.getTextBeforeCursor(3, 0)
    if (!textBefore.isNullOrEmpty()) {
        if (textBefore.trimStart() == "*i") {
            ime.currentInputConnection.deleteSurroundingText(2, 0)
            ime.currentInputConnection.commitText(
                "*I",
                1,
            )
        }
    }
}

fun autoCorrectZou(ime: IMEService) {
    val textBefore = ime.currentInputConnection.getTextBeforeCursor(4, 0)
    if (!textBefore.isNullOrEmpty()) {
        if (textBefore.trimStart() == "zou") {
            ime.currentInputConnection.deleteSurroundingText(3, 0)
            ime.currentInputConnection.commitText(
                "you",
                1,
            )
        } else if (textBefore.trimStart() == "Zou") {
            ime.currentInputConnection.deleteSurroundingText(3, 0)
            ime.currentInputConnection.commitText(
                "You",
                1,
            )
        }
    }
}

fun autoCorrectNn(ime: IMEService) {
    val textBefore = ime.currentInputConnection.getTextBeforeCursor(2, 0)
    if (!textBefore.isNullOrEmpty()) {
        if (textBefore.trimStart() == "ñn") {
            ime.currentInputConnection.deleteSurroundingText(1, 0)
        }
    }
}

private val autocorrect7pattern = Regex("[a-z]7[a-z]")

fun autoCorrect7(ime: IMEService) {
    val textBefore = ime.currentInputConnection.getTextBeforeCursor(3, 0)
    if (!textBefore.isNullOrEmpty()) {
        if (textBefore.trimStart().matches(autocorrect7pattern)) {
            val lastChar = textBefore.last()
            ime.currentInputConnection.deleteSurroundingText(2, 0)
            ime.currentInputConnection.commitText("r $lastChar", 1)
        }
    }
}
