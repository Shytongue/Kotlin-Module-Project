class WriteNoteScreen(val noteApp : NoteApp, val archive: Archive, val name : String) : CreateScreen(
    "Введите текст заметки: ",
    "Текст заметки не может быть пустым",{
    archive.notes.add(Note(name, it))
    println("Заметка успешно создана")
    noteApp.currentScreen = NoteMenuScreen(noteApp, archive)
}) {
    init {
        show()
    }
}