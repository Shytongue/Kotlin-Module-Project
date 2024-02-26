class ArchiveMenuScreen(noteApp: NoteApp,
                        actionsList: MutableMap<String, Pair<String, () -> Unit>> = mutableMapOf(
                            "0" to Pair("Создать архив") {
                                noteApp.currentScreen = CreateArchiveScreen(noteApp)
                            }
                            )
) : MenuScreen(actionsList) {
    init {
        noteApp.archivesList.forEachIndexed{index, archive ->
            actionsList[(index+1).toString()] = Pair(archive.name) {
                noteApp.currentScreen = NoteMenuScreen(noteApp, archive)}
        }
        actionsList[(noteApp.archivesList.size + 1).toString()] = Pair("Выход") {
            noteApp.exitFlag = true
        }
        println("Главное меню")
        show()
    }
}