package com.example.kotlin.delegated

import kotlin.properties.Delegates

class Site(map: Map<String, Any?>) {
    val name: String by map
    val url: String by map
}

class VarSite(map: MutableMap<String, Any?>) {
    var name: String by map
    var url: String by map

    var notNullValue: String by Delegates.notNull()
}

fun main() {
    var site = Site(
        mapOf(
            "name" to "菜鸟网站",
            "url" to "www.runoob.com"
        )
    )

    println(site.name)
    println(site.url)

    var varSite = VarSite(
        mutableMapOf(
            "name" to "googl",
            "url" to "www.gool.com"
        )
    )

    println(varSite.name)
    println(varSite.url)
    varSite.notNullValue= "not null com.example.kotlin.companion.getValue"
    println(varSite.notNullValue)
}