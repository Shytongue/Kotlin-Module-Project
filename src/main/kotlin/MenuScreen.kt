open class MenuScreen(val actionsList : MutableMap<String, Pair<String, () -> Unit>>) : Screen {
    override fun show() = actionsList.forEach { element -> println("${element.key}. ${element.value.first}") }
    override fun doAction(action : String) : () -> Unit = actionsList[action]?.second ?: { println("Такого пункта нет в списке, повторите ввод")}
}