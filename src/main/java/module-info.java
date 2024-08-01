module kroryi.demo4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens kroryi.demo4 to javafx.fxml;
    exports kroryi.demo4;
}