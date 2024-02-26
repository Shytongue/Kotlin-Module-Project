class CreateArchiveScreen(val noteApp : NoteApp) : CreateScreen(
    "Введите имя нового архива: ",
    "Имя архива не может быть пустым",{
    noteApp.archivesList.add(Archive(it))
    println("Архив успешно создан")
    noteApp.currentScreen = ArchiveMenuScreen(noteApp)
}) {
    init {
        show()
    }
}