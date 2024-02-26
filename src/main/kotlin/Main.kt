fun main(args: Array<String>) {
    val noteApp = NoteApp()
    noteApp.start()
}


data class Note(val name : String, val text : String)
data class Archive(val name : String) {
    val notes : MutableList<Note> = mutableListOf()
}
