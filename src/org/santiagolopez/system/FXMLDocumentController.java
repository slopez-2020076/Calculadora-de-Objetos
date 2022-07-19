package org.santiagolopez.system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;



public class FXMLDocumentController implements Initializable {
    
    double date1 = 0, date2 = 0, result = 0;
    int op;
    
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnDiez;
    @FXML private Button btnCero;
    @FXML private Button btnPunto;
    @FXML private Button btnRaiz;
    @FXML private Button btnPorciento;
    @FXML private Button btnAbs;
    @FXML private Button btnMas;
    @FXML private Button btnMenos;
    @FXML private Button btnMulti;
    @FXML private Button btnDividir;
    @FXML private Button btnBorrar;
    @FXML private Button btnBorrarUno;
    @FXML private Button btnMasMenos;
    @FXML private Button btnIgual;
    @FXML private Button btnXY;
   
    @FXML private TextField txtPantalla;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource()==btnUno)
            txtPantalla.setText(txtPantalla.getText()+"1");
        else if (event.getSource()==btnDos)
            txtPantalla.setText(txtPantalla.getText()+"2");
        else if (event.getSource()==btnTres)
            txtPantalla.setText(txtPantalla.getText()+"3");
        else if (event.getSource()==btnCuatro)
            txtPantalla.setText(txtPantalla.getText()+"4");
        else if (event.getSource()==btnCinco)
            txtPantalla.setText(txtPantalla.getText()+"5");
        else if (event.getSource()==btnSeis)
            txtPantalla.setText(txtPantalla.getText()+"6");
        else if (event.getSource()==btnSiete)
            txtPantalla.setText(txtPantalla.getText()+"7");
        else if (event.getSource()==btnOcho)
            txtPantalla.setText(txtPantalla.getText()+"8");
        else if (event.getSource()==btnNueve)
            txtPantalla.setText(txtPantalla.getText()+"9");
        else if (event.getSource()==btnCero)
            txtPantalla.setText(txtPantalla.getText()+"0");
        
        else if(event.getSource()==btnPunto){
            if (txtPantalla.getText().length()<=0)
                txtPantalla.setText("0.");
            else if (!(txtPantalla.getText().contains(".")))
                txtPantalla.setText(txtPantalla.getText()+".");

        }else if (event.getSource()==btnRaiz){
            date1= Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            result = Math.sqrt(date1);
            txtPantalla.setText(String.valueOf(result)); 
            
        }else if (event.getSource()==btnXY){
            date1=Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op=5;
        }
        else if (event.getSource()==btnBorrar){
            date1 = 0;
            date2 = 0;
            result = 0;
            txtPantalla.clear();
            
        }else if (event.getSource()==btnBorrarUno){
            txtPantalla.clear();
            
        } else if (event.getSource()==btnMasMenos){
            if(Double.parseDouble(txtPantalla.getText())> 0)
                txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText())*-1));
            else 
                txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText())*-1));
            
        }
        else if (event.getSource()==btnAbs){
            if(Double.parseDouble(txtPantalla.getText())> 0)
                txtPantalla.setText(txtPantalla.getText());
            else 
                txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText())*-1));
            
        }else if (event.getSource()==btnPorciento){
            date2 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            result = date1*date2/100;
            txtPantalla.setText(String.valueOf(result));
            
        } else if (event.getSource()==btnMas){
            date1=Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op=1;
            
        }else if (event.getSource()==btnMenos){
            date1=Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op=2;
           
        }else if (event.getSource()==btnMulti){
            date1=Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op=3;
            
        }else if (event.getSource()==btnDividir){
            date1=Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op=4;
            
        }else if (event.getSource()==btnIgual){
            date2= Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            switch(op){
                case 1:
                    result = date1 + date2;
                    txtPantalla.setText(String.valueOf(result));
                break;
                case 2:
                    result = date1 - date2;
                    txtPantalla.setText(String.valueOf(result));
                break;
                case 3:
                    result = date1 * date2;
                    txtPantalla.setText(String.valueOf(result));
                break;
                case 4:
                    result = date1 / date2;
                    txtPantalla.setText(String.valueOf(result));
                break;
                case 5:
                    result = Math.pow(date1, date2);
                    txtPantalla.setText(String.valueOf(result));
                break;
            }
            
          
        }    
            
            
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
