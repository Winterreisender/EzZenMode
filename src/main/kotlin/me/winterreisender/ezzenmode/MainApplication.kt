package me.winterreisender.ezzenmode

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.event.EventHandler
import javafx.scene.Scene
import javafx.stage.Stage
import kotlin.system.exitProcess

class HelloApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("main-view.fxml"))
        val scene = Scene(fxmlLoader.load())
        stage.title = "EzZenMode"
        stage.scene = scene
        stage.onCloseRequest = EventHandler {
            exitProcess(0)
        }
        stage.show()
    }
}

fun main() {
    Application.launch(HelloApplication::class.java)
}