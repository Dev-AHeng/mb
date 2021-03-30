package com.github.xiaoheng666.mb.services

import com.github.xiaoheng666.mb.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
