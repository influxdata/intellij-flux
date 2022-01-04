package com.github.onelson.intellijflux.services

import com.intellij.openapi.project.Project
import com.github.onelson.intellijflux.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
