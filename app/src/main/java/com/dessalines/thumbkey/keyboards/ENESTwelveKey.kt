@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val SUPER_KEY = KeyItemC(
    center = NOOP_KEYC,
    swipeType = FOUR_WAY_CROSS,
    left = BACKSPACE_KEYC.copy(size = SMALL, color = MUTED),
    right = RETURN_KEYC.copy(size = SMALL, color = MUTED),
    top = TOGGLE_EMOJI_MODE_TRUE_KEYC.copy(size = SMALL, color = MUTED),
    bottom = TOGGLE_NUMERIC_MODE_TRUE_KEYC.copy(size = SMALL, color = MUTED),
    longPress = DeleteWordBeforeCursor,
    backgroundColor = SURFACE_VARIANT,
)

val KB_EN_ES_SPACEBAR_KEY_ITEM_MAIN = KeyItemC(
    center = KeyC(" "),
    swipeType = FOUR_WAY_CROSS,
    left = SPACEBAR_LEFT_KEYC,
    right = SPACEBAR_RIGHT_KEYC,
    top = TOGGLE_SHIFT_TRUE_KEYC,
    bottom = NOOP_KEYC,
    longPress = CommitText("\n"),
    backgroundColor = SURFACE_VARIANT,
    sizeMultiplier = 3,
)

val KB_EN_ES_SPACEBAR_KEY_ITEM_SHIFTED = KB_EN_ES_SPACEBAR_KEY_ITEM_MAIN.copy(
    top = TOGGLE_CAPS_KEYC,
    bottom = TOGGLE_SHIFT_FALSE_KEYC,
)

val KB_NE_ES_TWELVE_KEY_MAIN = run {
    val s = KeyItemC(
        center = KeyC("s", size = LARGE),
        swipeType = THREE_WAY_SKEWED_TOP_LEFT,
        right = KeyC("d"),
        bottom = KeyC("c"),
        topLeft = KeyC("1", size = SMALLEST),
    )
    val n = KeyItemC(
        center = KeyC("n", size = LARGE),
        swipeType = TWO_WAY_VERTICAL,
        bottom = KeyC("m"),
        longPress = CommitText("ñ"),
        top = KeyC("2", size = SMALLEST),
    )
    val o = KeyItemC(
        center = KeyC("o", size = LARGE),
        swipeType = TWO_WAY_VERTICAL,
        bottom = KeyC("b"),
        longPress = CommitText("ó"),
        top = KeyC("3", size = SMALLEST),
    )
    val e = KeyItemC(
        center = KeyC("e", size = LARGE),
        swipeType = THREE_WAY_SKEWED_TOP_RIGHT,
        bottom = KeyC("j"),
        left = KeyC("f"),
        longPress = CommitText("é"),
        topRight = KeyC("4", size = SMALLEST),
    )
    val t = KeyItemC(
        center = KeyC("t", size = LARGE),
        swipeType = TWO_WAY_HORIZONTAL,
        right = KeyC("g"),
        left = KeyC("0", size = SMALLEST),
    )
    val l = KeyItemC(
        center = KeyC("l", size = LARGE),
        swipeType = TWO_WAY_HORIZONTAL,
    )
    val a = KeyItemC(
        center = KeyC("a", size = LARGE),
        swipeType = TWO_WAY_HORIZONTAL,
        longPress = CommitText("á"),
    )
    val i = KeyItemC(
        center = KeyC("i", size = LARGE),
        swipeType = TWO_WAY_HORIZONTAL,
        left = KeyC("v"),
        longPress = CommitText("í"),
        right = KeyC("5", size = SMALLEST),
    )
    val h = KeyItemC(
        center = KeyC("h", size = LARGE),
        swipeType = THREE_WAY_SKEWED_BOTTOM_LEFT,
        right = KeyC("q"),
        top = KeyC("p"),
        bottomLeft = KeyC("9", size = SMALLEST),
    )
    val r = KeyItemC(
        center = KeyC("r", size = LARGE),
        swipeType = TWO_WAY_VERTICAL,
        top = KeyC("k"),
        bottom = KeyC("8", size = SMALLEST),
    )
    val u = KeyItemC(
        center = KeyC("u", size = LARGE),
        swipeType = TWO_WAY_VERTICAL,
        top = KeyC("w"),
        longPress = CommitText("ú"),
        bottom = KeyC("7", size = SMALLEST),
    )
    val y = KeyItemC(
        center = KeyC("y", size = LARGE),
        swipeType = THREE_WAY_SKEWED_BOTTOM_RIGHT,
        left = KeyC("x"),
        top = KeyC("z"),
        longPress = CommitText("ü"),
        bottomRight = KeyC("6", size = SMALLEST),
    )
    val apostrophe = KeyItemC(
        center = KeyC("'", size = LARGE),
        swipeType = FOUR_WAY_CROSS,
        top = KeyC("!"),
        right = KeyC("?"),
        left = KeyC("~"),
        bottom = KeyC("¿"),
        longPress = CommitText("^"),
    )
    val parLeft = KeyItemC(
        center = KeyC("(", size = SMALL),
        swipeType = FOUR_WAY_CROSS,
        top = KeyC("/"),
        right = KeyC("["),
        left = KeyC("{"),
        bottom = KeyC(":"),
        longPress = CommitText("<"),
    )
    val parRight = KeyItemC(
        center = KeyC(")", size = SMALL),
        swipeType = FOUR_WAY_CROSS,
        top = KeyC("_"),
        right = KeyC("]"),
        left = KeyC("}"),
        bottom = KeyC(";"),
        longPress = CommitText(">"),
    )
    val space = KB_EN_ES_SPACEBAR_KEY_ITEM_MAIN
    val star = KeyItemC(
        center = KeyC("*", size = LARGE),
        swipeType = FOUR_WAY_CROSS,
        top = KeyC("."),
        left = KeyC(","),
        right = KeyC("-"),
        bottom = KeyC("@", size = SMALLEST),
        longPress = CommitText("..."),
    )
    val sup = SUPER_KEY
    KeyboardC(
        listOf(
            listOf(s, t, h, apostrophe),
            listOf(n, l, r, parLeft),
            listOf(space, sup),
            listOf(o, a, u, parRight),
            listOf(e, i, y, star)
        ),
        layoutType = LayoutType.ColLike,
    )
}

val KB_NE_ES_TWELVE_KEY_SHIFTED = run {
    val s = KeyItemC(
        center = KeyC("S", size = LARGE),
        swipeType = THREE_WAY_SKEWED_TOP_LEFT,
        right = KeyC("D"),
        bottom = KeyC("C"),
        topLeft = KeyC("1", size = SMALLEST),
    )
    val n = KeyItemC(
        center = KeyC("N", size = LARGE),
        swipeType = TWO_WAY_VERTICAL,
        bottom = KeyC("M"),
        longPress = CommitText("Ñ"),
        top = KeyC("2", size = SMALLEST),
    )
    val o = KeyItemC(
        center = KeyC("O", size = LARGE),
        swipeType = TWO_WAY_VERTICAL,
        bottom = KeyC("B"),
        longPress = CommitText("Ó"),
        top = KeyC("3", size = SMALLEST),
    )
    val e = KeyItemC(
        center = KeyC("E", size = LARGE),
        swipeType = THREE_WAY_SKEWED_TOP_RIGHT,
        bottom = KeyC("J"),
        left = KeyC("F"),
        longPress = CommitText("É"),
        topRight = KeyC("4", size = SMALLEST),
    )
    val t = KeyItemC(
        center = KeyC("T", size = LARGE),
        swipeType = TWO_WAY_HORIZONTAL,
        right = KeyC("G"),
        left = KeyC("0", size = SMALLEST),
    )
    val l = KeyItemC(
        center = KeyC("L", size = LARGE),
        swipeType = TWO_WAY_HORIZONTAL,
    )
    val a = KeyItemC(
        center = KeyC("A", size = LARGE),
        swipeType = TWO_WAY_HORIZONTAL,
        longPress = CommitText("Á"),
    )
    val i = KeyItemC(
        center = KeyC("I", size = LARGE),
        swipeType = TWO_WAY_HORIZONTAL,
        left = KeyC("V"),
        longPress = CommitText("Í"),
        right = KeyC("5", size = SMALLEST),
    )
    val h = KeyItemC(
        center = KeyC("H", size = LARGE),
        swipeType = THREE_WAY_SKEWED_BOTTOM_LEFT,
        right = KeyC("Q"),
        top = KeyC("P"),
        bottomLeft = KeyC("9", size = SMALLEST),
    )
    val r = KeyItemC(
        center = KeyC("R", size = LARGE),
        swipeType = TWO_WAY_VERTICAL,
        top = KeyC("K"),
        bottom = KeyC("8", size = SMALLEST),
    )
    val u = KeyItemC(
        center = KeyC("U", size = LARGE),
        swipeType = TWO_WAY_VERTICAL,
        top = KeyC("W"),
        longPress = CommitText("Ú"),
        bottom = KeyC("7", size = SMALLEST),
    )
    val y = KeyItemC(
        center = KeyC("Y", size = LARGE),
        swipeType = THREE_WAY_SKEWED_BOTTOM_RIGHT,
        left = KeyC("X"),
        top = KeyC("Z"),
        longPress = CommitText("Ü"),
        bottomRight = KeyC("6", size = SMALLEST),
    )
    val apostrophe = KeyItemC(
        center = KeyC("'", size = LARGE),
        swipeType = FOUR_WAY_CROSS,
        top = KeyC("!"),
        right = KeyC("?"),
        left = KeyC("~"),
        bottom = KeyC("¿"),
        longPress = CommitText("^"),
    )
    val parLeft = KeyItemC(
        center = KeyC("(", size = SMALL),
        swipeType = FOUR_WAY_CROSS,
        top = KeyC("/"),
        right = KeyC("["),
        left = KeyC("{"),
        bottom = KeyC(":"),
        longPress = CommitText("<"),
    )
    val parRight = KeyItemC(
        center = KeyC(")", size = SMALL),
        swipeType = FOUR_WAY_CROSS,
        top = KeyC("_"),
        right = KeyC("]"),
        left = KeyC("}"),
        bottom = KeyC(";"),
        longPress = CommitText(">"),
    )
    val space = KB_EN_ES_SPACEBAR_KEY_ITEM_SHIFTED
    val star = KeyItemC(
        center = KeyC("*", size = LARGE),
        swipeType = FOUR_WAY_CROSS,
        top = KeyC("."),
        left = KeyC(","),
        right = KeyC("-"),
        bottom = KeyC("@", size = SMALLEST),
        longPress = CommitText("..."),
    )
    val sup = SUPER_KEY
    KeyboardC(
        listOf(
            listOf(s, t, h, apostrophe),
            listOf(n, l, r, parLeft),
            listOf(space, sup),
            listOf(o, a, u, parRight),
            listOf(e, i, y, star)
        ),
        layoutType = LayoutType.ColLike,
    )
}

val KB_NE_ES_TWELVE_KEY: KeyboardDefinition = KeyboardDefinition(
    title = "english español 12-key",
    modes = KeyboardDefinitionModes(
        main = KB_NE_ES_TWELVE_KEY_MAIN,
        shifted = KB_NE_ES_TWELVE_KEY_SHIFTED,
        numeric = NUMERIC_KEYBOARD,
    ),
    settings = KeyboardDefinitionSettings(
        autoCapitalizers = arrayOf(
            ::autoCapitalizeI,
            ::autoCapitalizeStarI,
            ::autoCapitalizeIApostrophe,
            ::autoCorrectZou,
            ::autoCorrectNn,
            ::autoCorrect7
        ),
    ),
)
