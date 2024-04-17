# OOP.20232.21

Config JavaFX:

Download: https://gluonhq.com/products/javafx/

```bash
sudo mv javafx-sdk-xx /usr/lib/
```
Replace xx with version

```bash
nano ~/.zshrc
export PATH_TO_FX='/usr/lib/javafx-sdk-xx/lib'
source ~/.zshrc
```

```bash
javac --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml YourJavaFXApp.java
java --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml YourJavaFXApp
```

https://openjfx.io/openjfx-docs/
