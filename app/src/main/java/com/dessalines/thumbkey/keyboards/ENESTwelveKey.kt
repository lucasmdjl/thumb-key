@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_ES_SPACEBAR_KEY_ITEM_MAIN =
    KeyItemC(
        center = KeyC(" "),
        swipeType = FOUR_WAY_CROSS,
        left =
            KeyC(
                action =
                    SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_LEFT,
                        ),
                    ),
                display = null,
            ),
        right =
            KeyC(
                action =
                    SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_RIGHT,
                        ),
                    ),
                display = null,
            ),
        top =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                action = ToggleShiftMode(true),
                swipeReturnAction = ToggleCurrentWordCapitalization(true),
                color = MUTED,
            ),
        bottom =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.Keyboard),
                action = SwitchIME,
                color = MUTED,
            ),
        backgroundColor = SURFACE_VARIANT,
        widthMultiplier = 2,
    )

val KB_EN_ES_SPACEBAR_KEY_ITEM_SHIFTED =
    KB_EN_ES_SPACEBAR_KEY_ITEM_MAIN.copy(
        top =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                action = ToggleCapsLock,
                swipeReturnAction = ToggleCurrentWordCapitalization(true),
                color = MUTED,
            ),
        bottom =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                action = ToggleShiftMode(false),
                swipeReturnAction = ToggleCurrentWordCapitalization(false),
                color = MUTED,
            ),
    )

val KB_NE_ES_TWELVE_KEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("d"),
                    bottom = KeyC("c"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("m"),
                    longPress = CommitText("ñ"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("b"),
                    longPress = CommitText("ó"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("j"),
                    left = KeyC("f"),
                    longPress = CommitText("é"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    longPress = CommitText("á"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    left = KeyC("v"),
                    longPress = CommitText("í"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("q"),
                    top = KeyC("p"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("k"),
                ),
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("w"),
                    longPress = CommitText("ú"),
                ),
                KeyItemC(
                    center = KeyC("y", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("x"),
                    top = KeyC("z"),
                    longPress = CommitText("ü"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("'", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("!"),
                    right = KeyC("?"),
                    left = KeyC("~"),
                    bottom = KeyC("¿"),
                    longPress = CommitText("^"),
                ),
                KB_EN_ES_SPACEBAR_KEY_ITEM_MAIN,
                KeyItemC(
                    center = KeyC("*", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("."),
                    left = KeyC(","),
                    right = KeyC("-"),
                    bottom = KeyC("@"),
                    longPress = CommitText("..."),
                ),
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_NE_ES_TWELVE_KEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("D"),
                    bottom = KeyC("C"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("M"),
                    longPress = CommitText("Ñ"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("B"),
                    longPress = CommitText("Ó"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("J"),
                    left = KeyC("F"),
                    longPress = CommitText("É"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    longPress = CommitText("Á"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    left = KeyC("V"),
                    longPress = CommitText("Í"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("Q"),
                    top = KeyC("P"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("K"),
                ),
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    top = KeyC("W"),
                    longPress = CommitText("Ú"),
                ),
                KeyItemC(
                    center = KeyC("Y", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("X"),
                    top = KeyC("Z"),
                    longPress = CommitText("Ü"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("'", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("!"),
                    right = KeyC("?"),
                    left = KeyC("~"),
                    bottom = KeyC("¿"),
                    longPress = CommitText("^"),
                ),
                KB_EN_ES_SPACEBAR_KEY_ITEM_SHIFTED,
                KeyItemC(
                    center = KeyC("*", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("."),
                    left = KeyC(","),
                    right = KeyC("-"),
                    bottom = KeyC("@"),
                    longPress = CommitText("..."),
                ),
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_NE_ES_TWELVE_KEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "english español 12-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_NE_ES_TWELVE_KEY_MAIN,
                shifted = KB_NE_ES_TWELVE_KEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers =
                    arrayOf(
                        ::autoCapitalizeI,
                        ::autoCapitalizeStarI,
                        ::autoCapitalizeIApostrophe,
                    ),
            ),
    )
