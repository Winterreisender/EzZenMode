package me.winterreisender.ezzenmode

import javafx.application.Application
import javafx.event.EventHandler
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage
import kotlin.system.exitProcess

class ZenApplication : Application() {

    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(ZenApplication::class.java.getResource("zen-view.fxml"))
        val scene = Scene(fxmlLoader.load())
        stage.title = "EzZenMode"
        stage.scene = scene
        //stage.initStyle(StageStyle.UNDECORATED)
        stage.isFullScreen = true
        stage.onCloseRequest = EventHandler {
            exitProcess(0)
        }
        stage.show()
    }
}