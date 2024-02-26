import java.util.Scanner

class NoteApp {
    val archivesList : MutableList<Archive> = mutableListOf()
    lateinit var currentScreen : Screen
    var exitFlag = false
    fun start() {
        println("Добро пожаловать!")
        currentScreen = ArchiveMenuScreen(this)
        while (true) {
            val input = Scanner(System.`in`).nextLine()
            currentScreen.doAction(input)()
            if (exitFlag) {
                println("Спасибо, что пользуетесь приложением!")
                break
            }
        }
    }
}