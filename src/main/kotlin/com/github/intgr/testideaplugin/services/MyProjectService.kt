package com.github.intgr.testideaplugin.services

import com.intellij.openapi.project.Project
import com.github.intgr.testideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
