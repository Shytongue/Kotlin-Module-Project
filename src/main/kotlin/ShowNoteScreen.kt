class ShowNoteScreen(noteApp: NoteApp, archive : Archive, note: Note,
                     actionsList: MutableMap<String, Pair<String, () -> Unit>> = mutableMapOf(
                         "0" to Pair("Просмотреть заметку ${note.name}") {
                             println(note.text)
                             noteApp.currentScreen.show()
                         },
                         "1" to Pair("Выход") {
                             noteApp.currentScreen = NoteMenuScreen(noteApp, archive)
                         }
                     )
) : MenuScreen(actionsList) {
    init {
        show()
    }
}