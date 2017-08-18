package com.mohammad.kotlinlearning.classes

/**
 * Created by mohammadmoradyar on 7/28/17.
 */
class DirectoryExplorer(val user: String) {

    inner class PermissionCheck {
        fun validatePermission() {
            if (user != "") {

            }
        }
    }

    fun listFolder(folder: String, user: String) {
        val permissionCheck = PermissionCheck()
        permissionCheck.validatePermission()
    }
}

fun main(args: Array<String>) {
    val de = DirectoryExplorer("Mohammad")
    val pc = DirectoryExplorer("Mohammad").PermissionCheck()
}
