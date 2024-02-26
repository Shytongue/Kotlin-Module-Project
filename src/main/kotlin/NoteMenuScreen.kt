class NoteMenuScreen(noteApp: NoteApp, archive : Archive,
                        actionsList: MutableMap<String, Pair<String, () -> Unit>> = mutableMapOf(
                            "0" to Pair("Создать заметку") {
                                noteApp.currentScreen = CreateNoteScreen(noteApp, archive)
                            }
                        )
) : MenuScreen(actionsList) {
    init {
        archive.notes.forEachIndexed{index, note ->
            actionsList[(index+1).toString()] = Pair(note.name) {
                noteApp.currentScreen = ShowNoteScreen(noteApp, archive, note)}
        }
        actionsList[(archive.notes.size + 1).toString()] = Pair("Выход") {
            noteApp.currentScreen = ArchiveMenuScreen(noteApp)
        }
        println("Архив ${archive.name}")
        show()
    }
}