package com.rsk.kotlin

import com.rsk.java.Address
import com.rsk.java.Meeting

fun main(args: Array<String>) {
    val m= Meeting()
    //adding a title to the meeting
    //m.addTitle("Title")
    //m.addTitle(null) //will not compile
    //access title from the meeting
    //val title: String?=m.meetingTitle()
    //println(title)
    val title:String=m.titleCanBeNull()?:"nobody"// elvis operator removes the null exception
    println(title)
}
//specifies that the return type cannot be null
class HomeAddress:Address{
    override fun getFirstAddress(): String {
        return ""
    }
}
//specifies that the return type can be null
class WorkAddress:Address {
    override fun getFirstAddress(): String? {
        return ""
    }
}