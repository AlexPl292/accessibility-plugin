package com.github.alexpl292.accessibilityplugin.services

import com.intellij.openapi.project.Project
import com.github.alexpl292.accessibilityplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
