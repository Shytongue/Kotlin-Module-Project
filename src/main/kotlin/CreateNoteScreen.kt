class CreateNoteScreen(val noteApp : NoteApp, val archive: Archive) : CreateScreen(
    "Введите имя новой заметки: ",
    "Имя заметки не может быть пустым", {
    noteApp.currentScreen = WriteNoteScreen(noteApp, archive, it)
}) {
    init {
        show()
    }
}