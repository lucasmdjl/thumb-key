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

val KB_EN_ES_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = TWO_WAY_DIAGONAL_BACKWARD,
                    bottomRight = KeyC("d"),
                    topLeft = KeyC("c"),
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
                    swipeType = TWO_WAY_DIAGONAL_FORWARD,
                    topRight = KeyC("j"),
                    bottomLeft = KeyC("f"),
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
                    swipeType = TWO_WAY_DIAGONAL_FORWARD,
                    topRight = KeyC("p"),
                    bottomLeft = KeyC("q"),
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
                    swipeType = TWO_WAY_DIAGONAL_BACKWARD,
                    topLeft = KeyC("z"),
                    bottomRight = KeyC("x"),
                    longPress = CommitText("ü"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("'", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("!"),
                    topRight = KeyC("?"),
                    bottomLeft = KeyC("~"),
                    bottomRight = KeyC(":"),
                    longPress = CommitText("^"),
                ),
                KB_EN_ES_SPACEBAR_KEY_ITEM_MAIN,
                KeyItemC(
                    center = KeyC("*", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("."),
                    topLeft = KeyC(","),
                    bottomRight = KeyC("-"),
                    bottomLeft = KeyC("_"),
                    longPress = CommitText("..."),
                ),
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_ES_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = TWO_WAY_DIAGONAL_BACKWARD,
                    bottomRight = KeyC("D"),
                    topLeft = KeyC("C"),
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
                    swipeType = TWO_WAY_DIAGONAL_FORWARD,
                    topRight = KeyC("J"),
                    bottomLeft = KeyC("F"),
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
                    swipeType = TWO_WAY_DIAGONAL_FORWARD,
                    topRight = KeyC("P"),
                    bottomLeft = KeyC("Q"),
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
                    swipeType = TWO_WAY_DIAGONAL_BACKWARD,
                    topLeft = KeyC("Z"),
                    bottomRight = KeyC("X"),
                    longPress = CommitText("Ü"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("'", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("!"),
                    topRight = KeyC("?"),
                    bottomLeft = KeyC("~"),
                    bottomRight = KeyC(":"),
                    longPress = CommitText("^"),
                ),
                KB_EN_ES_SPACEBAR_KEY_ITEM_SHIFTED,
                KeyItemC(
                    center = KeyC("*", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("."),
                    topLeft = KeyC(","),
                    bottomRight = KeyC("-"),
                    bottomLeft = KeyC("_"),
                    longPress = CommitText("..."),
                ),
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_ES_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "english español 12-key thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_ES_THUMBKEY_MAIN,
                shifted = KB_EN_ES_THUMBKEY_SHIFTED,
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
