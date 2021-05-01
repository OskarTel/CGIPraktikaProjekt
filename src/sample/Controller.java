package sample;

        import javafx.event.ActionEvent;
        import javafx.scene.control.Label;
        import javafx.scene.control.TextField;
        import javafx.scene.text.Text;


public class Controller {
    public Label coordinateLabel;
    public TextField longitudeField;
    public TextField latitudeField;
    public Text latitudeText;
    public Text longitudeText;
    public Text coordinatesText;
    public Text dateText;
    public TextField dateField;

    public void enterCoordinates(ActionEvent actionEvent) {
        Double longitude = Double.parseDouble(longitudeField.getText());
        Double latitude = Double.parseDouble(latitudeField.getText());
        String date = dateField.getText();
        longitudeField.clear();
        latitudeField.clear();
        dateField.clear();
        System.out.println(longitude);
        System.out.println(latitude);
        System.out.println(date);
        coordinatesText.setText("Entered coordinates: Longitude " + longitude+ " and Latitude " + latitude + ". The date is: "+ date + ".");

    }
}