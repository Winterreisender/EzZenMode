package com.example.jfxplay

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage
import javafx.stage.StageStyle

class AboutApplication : Application() {

    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(AboutApplication::class.java.getResource("about-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 1920.0, 1080.0)
        stage.title = "Hello!"
        stage.scene = scene
        //stage.initStyle(StageStyle.UNDECORATED)
        stage.isFullScreen = true
        stage.show()
    }
}