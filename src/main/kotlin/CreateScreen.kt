open class CreateScreen(private val message : String, private val onEmpty : String, val onCreate : (String) -> Unit) : Screen {
    override fun show() = println(message)
    override fun doAction(action: String): () -> Unit {
        if (action != "") return { onCreate(action) }
        else return {
            println(onEmpty)
        }
    }
}