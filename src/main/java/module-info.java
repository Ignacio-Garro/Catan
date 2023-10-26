module hr.algebra.catan {
    requires javafx.controls;
    requires javafx.fxml;


    opens hr.algebra.catan to javafx.fxml;
    exports hr.algebra.catan;
    exports hr.algebra.catan.Objects;
    opens hr.algebra.catan.Objects to javafx.fxml;
}