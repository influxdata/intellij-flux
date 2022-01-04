package com.influxdata.intellijflux.services

import com.intellij.openapi.project.Project
import com.influxdata.intellijflux.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
