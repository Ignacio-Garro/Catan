module hr.algebra.catan {
    requires javafx.controls;
    requires javafx.fxml;


    opens hr.algebra.catan to javafx.fxml;
    exports hr.algebra.catan;
    exports hr.algebra.catan.Model.Objects;
    opens hr.algebra.catan.Model.Objects to javafx.fxml;
    exports hr.algebra.catan.Controller;
    opens hr.algebra.catan.Controller to javafx.fxml;
    exports hr.algebra.catan.Model;
    opens hr.algebra.catan.Model to javafx.fxml;
}