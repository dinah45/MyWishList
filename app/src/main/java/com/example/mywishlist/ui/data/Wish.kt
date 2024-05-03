package com.example.mywishlist.ui.data

data class Wish (
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Google Watch",
            description = "An android Watch"),
        Wish(title = "Iphone",
            description = "Iphone 15 pro max"),
        Wish(title = "Laptop",
            description = "32G Ram, 360 degrees, touch Screen"),
        Wish(title = " Air pods",
            description = "Orimo airpods"),
        Wish(title = "hand bags",
            description = "Red, Green, Yellow handbags"),
        Wish(title = "Shoes",
            description = "Black, White, maroon Shoes")
    )
}