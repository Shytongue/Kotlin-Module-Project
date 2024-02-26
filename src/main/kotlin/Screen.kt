interface Screen {
    fun show()
    fun doAction(action: String) : () -> Unit
}