package Projects.ProjectSeven;

import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.control.Label;  
import javafx.scene.control.TextField;  
import javafx.scene.layout.GridPane;  
import javafx.stage.Stage;  


import javafx.event.EventHandler;
import javafx.event.ActionEvent;


/*
Convert distances from US measurements to metric 
4 fields: miles, yards, feet, inch
4 buttons: -    ,   -   ,   - ,  - 

miles -> km 
yards -> metersyards -> meters

feet -> centimeter
inches - millimeter


--
Convert different US weights to metric (2) 
(e.g. tons, pounds, ounces) to metric equivalent

pounds -> kilogram 
ounces -> grams


--
Convert volume from US measurement to metric (2) 
(e.g. galloms, cups, tablespoons, teaspoons)

gallons -> liters
cups -> milliliters 

 */


public class Conversions extends Application {
    
    @Override  
    public void start(Stage primaryStage) {  
        GridPane gridPane = new GridPane();  
          
    
     
        
          
        Label milesLabel = new Label("Miles:");  
        Label yardsLabel = new Label("Yards:");  
        Label feetLabel = new Label("Feet:");  
        Label inchesLabel = new Label("Inches:");  

        TextField milesField = new TextField();  
        TextField yardsField = new TextField();  
        TextField feetField = new TextField();  
        TextField inchesField = new TextField();  

          
        Label kmLabel = new Label("Kilometers:");  
        Label mLabel = new Label("Meters:");  
        Label cmLabel = new Label("Centimeters:");  
        Label mmLabel = new Label("Millimeters:");  


        Label kilogramsLabel = new Label("Kilograms");
        Label gramsLabel = new Label("Grams");
        Label litersLabel = new Label("Liters");
        Label millilitersLabel = new Label("Milliliters");

        TextField kmField = new TextField(); kmField.setEditable(false);  
        TextField mField = new TextField();  mField.setEditable(false);  
        TextField cmField = new TextField();  cmField.setEditable(false);  
        TextField mmField = new TextField();  mmField.setEditable(false);  


        
        //- US mass/vol
        Label poundsLabel = new Label("Pounds");
        Label ouncesLabel = new Label("Ounces");
        Label gallonsLabel = new Label("Gallons");
        Label cupsLabel = new Label("Cups");
        
        //- US mass/vol textfields
        TextField poundsField = new TextField(); 
        TextField ouncesField = new TextField(); 
        TextField gallonsField = new TextField();
        TextField cupsField = new TextField();


        //- metric mass/vol textfields
        TextField kgField = new TextField(); kgField.setEditable(false);  
        TextField gramsField = new TextField();  gramsField.setEditable(false);  
        TextField litersField = new TextField();  litersField.setEditable(false);  
        TextField milliLiterField = new TextField();  milliLiterField.setEditable(false);  

       
       
       
       


          
        
        
      
        Button milesToKMButton = new Button("Convert Miles");  
        milesToKMButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                milesToKM(milesField,kmField);
            }
        });  

        Button yardsToMetersButton = new Button("Convert Yards");
        yardsToMetersButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                yardsToMeters(yardsField, mField);
            }
        });

        Button feetToCMButton = new Button("Convert Feet");
        feetToCMButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                feetToCM( feetField, cmField);
            }
        });

        Button inchesToMMButton = new Button("Convert Inches");
        inchesToMMButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                inchesToMillimeters( inchesField, mmField);
            }
        });


        //----


      
        Button poundsToKgButton = new Button("Convert Pounds");  
        poundsToKgButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                poundsToKilograms(poundsField,kgField);
            }
        });  


        Button ouncesToGramsButtom = new Button("Convert Ounces");  
        ouncesToGramsButtom.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ouncesToGrams(ouncesField,gramsField);
            }
        });  


        //---

        /////*************** */
        Button gallonsToLitersButton = new Button("Convert Gallons");  
        gallonsToLitersButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                gallonsToLiters(gallonsField,litersField);
            }
        });  


        Button cupsToMillilitersButton = new Button("Convert Cups");  
        cupsToMillilitersButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cupsToMilliliters(cupsField,milliLiterField);
            }
        });  


        //---


          
        // Miles to KM 
        gridPane.add(milesLabel, 0, 0);  
        gridPane.add(milesField, 1, 0);  
        gridPane.add(milesToKMButton, 2, 0);  
        gridPane.add(kmLabel, 3, 0);  
        gridPane.add(kmField, 4, 0);  
          
        // Yards to Meters 
        gridPane.add(yardsLabel, 0, 1);  
        gridPane.add(yardsField, 1, 1);  
        gridPane.add(yardsToMetersButton, 2, 1);  
        gridPane.add(mLabel, 3, 1);  
        gridPane.add(mField, 4, 1);  
          
        // Feet to Centimeter
        gridPane.add(feetLabel, 0, 2);  
        gridPane.add(feetField, 1, 2);  
        gridPane.add(feetToCMButton, 2, 2);  
        gridPane.add(cmLabel, 3, 2);  
        gridPane.add(cmField, 4, 2);  
          
        // Inches to Millimeter
        gridPane.add(inchesLabel, 0, 3);  
        gridPane.add(inchesField, 1, 3);  
        gridPane.add(inchesToMMButton, 2, 3);  
        gridPane.add(mmLabel, 3, 3);  
        gridPane.add(mmField, 4, 3);  


        //--
        gridPane.add(poundsLabel, 0, 4);
        gridPane.add(poundsField, 1, 4); 
        gridPane.add(poundsToKgButton, 2, 4);
        gridPane.add(kilogramsLabel, 3, 4);
        gridPane.add(kgField, 4, 4);

        gridPane.add(ouncesLabel, 0, 5);
        gridPane.add(ouncesField, 1, 5);
        gridPane.add(ouncesToGramsButtom, 2, 5);
        gridPane.add(gramsLabel, 3, 5);
        gridPane.add(gramsField, 4, 5);
        
        
        gridPane.add(gallonsLabel, 0, 6);
        gridPane.add(gallonsField, 1, 6);
        gridPane.add(gallonsToLitersButton, 2, 6);
        gridPane.add(litersLabel, 3, 6);
        gridPane.add(litersField, 4, 6);
        
        gridPane.add(cupsLabel, 0, 7);
        gridPane.add(cupsField, 1, 7);
        gridPane.add(cupsToMillilitersButton, 2, 7);
        gridPane.add(millilitersLabel, 3, 7);
        gridPane.add(milliLiterField, 4, 7);

        
          
        
        Scene scene = new Scene(gridPane, 400, 200);  

        primaryStage.setScene(scene);  
        primaryStage.setTitle("Conversions");  
        primaryStage.show();  
    }  
      



    private void milesToKM(TextField milesField, TextField kmField) {  
        double miles = Double.parseDouble(milesField.getText());  
        double km = miles * 1.60934; 
        kmField.setText(String.format("%.2f", km)); // format to 2 dec  
    }  
      
    private void yardsToMeters(TextField yardsField, TextField mField) {  
        double yd = Double.parseDouble(yardsField.getText());  
        double m = yd * 0.9144;
        mField.setText(String.format("%.2f", m)); 
    }  
      
    private void feetToCM(TextField feetField, TextField cmField) {  
        double ft = Double.parseDouble(feetField.getText());  
        double cm = ft * 30.48; 
        cmField.setText(String.format("%.2f", cm));   
    }  
      
    private void inchesToMillimeters(TextField inchesField, TextField mmField) {  
        double in = Double.parseDouble(inchesField.getText());  
        double mm = in * 25.4;
        mmField.setText(String.format("%.2f", mm));  
    } 
    
    public void poundsToKilograms(TextField poundsField, TextField kgField ) {
        double pounds = Double.parseDouble(poundsField.getText());
        double kg = pounds  * 0.45359237;
        kgField.setText(String.format("%.2f", kg));

    }

    public void ouncesToGrams(TextField ouncesField, TextField gramsField) {
        double ounces = Double.parseDouble(ouncesField.getText());
        double grams = ounces * 28.3495;
        gramsField.setText(String.format("%.2f", grams));
    }

    public void gallonsToLiters(TextField gallonsField, TextField litersField) {
        double gallons = Double.parseDouble(gallonsField.getText());
        double liters  = gallons * 3.78541; 
        litersField.setText(String.format("%.2f", liters)); 
    }

    public void cupsToMilliliters (TextField cupsField, TextField milliLiterField) {
        double cups = Double.parseDouble(cupsField.getText());
        double milliliters = cups* 236.588;
        milliLiterField.setText(String.format("%.2f", milliliters));
    }
      
    public static void main(String[] args) {  
        launch(args);  
    }  
    
}
