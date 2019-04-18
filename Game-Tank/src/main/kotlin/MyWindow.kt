import javafx.application.Application
import javafx.scene.input.KeyEvent
import org.itheima.kotlin.game.core.Window

/**
 * Auther Aatoken
 * Date 2019/4/18
 * Des extend游戏引擎的窗体
 */
class MyWindow : Window() {



    override fun onDisplay() {
          //To change body of created functions use File | Settings | File Templates.
    }

    override fun onKeyPressed(event: KeyEvent) {
         //To change body of created functions use File | Settings | File Templates.
    }

    override fun onRefresh() {
         //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate() {
         //To change body of created functions use File | Settings | File Templates.
    }
}

fun main(args: Array<String>) {
    Application.launch(MyWindow::class.java)
}