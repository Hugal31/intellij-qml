package name.kropp.intellij.qml.preview

enum class QmlSceneSize(override val option: String, override val description: String) : QmlSceneOption {
  None("", "Normal window"),
  Maximized("--maximized", "Maximized window"),
  Fullscreen("--fullscreen", "Fullscreen window");

  override val tooltip: String
    get() = ""
}