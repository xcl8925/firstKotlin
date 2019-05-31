package com.example.kotlin.delegated

import java.lang.Exception
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class ResourceID {
    val image_id: String = "imageid101"
    val text_id: String = "textid102"
}

class ResourceLoader(val id: ResourceID) {
    operator fun provideDelegate(thisRef: MyUI, prop: KProperty<*>): ReadOnlyProperty<MyUI, String> {
        if (check(thisRef, prop.name)) {
            return DellImpl(id)
        } else {
            throw Exception("error ${prop.name}")
        }
    }

    private fun check(thisRef: MyUI, name: String): Boolean {
        return name == "image" || name == "text"
    }
}

class DellImpl(var id: ResourceID) : ReadOnlyProperty<MyUI, String> {
    override fun getValue(thisRef: MyUI, property: KProperty<*>): String {
        if (property.name == "image") {
            return property.name + ", " + id.image_id
        } else {
            return property.name + ", " + id.text_id
        }
    }
}

class MyUI {
    val image by ResourceLoader(ResourceID())
    val text by ResourceLoader(ResourceID())
}

fun main() {
    val myUI = MyUI()
    println(myUI.image)
    println(myUI.text)
}
