package core;

import core.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Validator {
    
    
    public static String nombre(String descr){
            
        String nclient=""; 
        boolean termi=true; 
        int numero;
             
        do {
            numero=0;
            nclient=JOptionPane.showInputDialog("Ingrese el "+descr);
             
            if (!nclient.equals("")){
               for(int i=0; i<nclient.length(); i++){ 

                    try{
                        Integer.parseInt(nclient.substring(i,i+1));
                        numero=1; 
                    }
                    catch( NumberFormatException e){}                  
            }      

            if (numero==0){
                termi=false;
            }
            else {
                JOptionPane.showMessageDialog(null, "Debe ingresar el "+descr+"  sin numeros");}
            }
        }while(termi);
            return nclient;
    }  
    
    public static String telefono(String desc){

        int numero=0;
        boolean termi=false;
        do{
            try{
                numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Telefono: "));
                termi=true;
            }
            catch( NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Debe ingresar el telefono sin letras");
                termi=false;
            }
        }
        while(!termi);
            String tel=String.valueOf(numero);
        return tel; 
    }
     
    public static int numero(String desc){

        int numero=0;        
        try{
            numero= Integer.parseInt(desc);
            return 0;
        }
        catch( NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Debe ingresar un numero y no letras");
        return 1;
        }
    }

    public static String fecha(String formatoFecha,String tipo){
        String fecha = "";
        boolean estado = false;
        
        do{
            fecha = JOptionPane.showInputDialog("Ingrese Fecha "+ tipo);
            
            if (!fecha.equals("")){
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date fechaIngresada = null;
                Date fechaHeredada = null;
                
                try{
                    fechaIngresada = dateFormat.parse(fecha);  
                    fechaHeredada = dateFormat.parse(formatoFecha);
                } catch (Exception e){ 
                    System.out.println(e);
                }
          
                if (!dateFormat.format(fechaIngresada).equals(fecha)){
                    JOptionPane.showMessageDialog(null, "Debe ingresar una fecha correcta");
                } else {           
                    if (fechaIngresada.compareTo(fechaHeredada) >= 0){ 
                        estado = true;
                    }else {
                        System.out.println("discontinuidad");
                    }         
                }
            }
        }while(estado == false);
        return fecha; 
    }   
    public static boolean validateAddClientForm(String id, String nombre, String apellido, String phone){
        boolean state = false;
        if(
                id.matches("\\d\\d\\d\\d-\\d\\d\\d\\d-\\d\\d\\d\\d\\d") &&
                nombre.matches("[a-zA-Z]*") &&
                apellido.matches("[a-zA-Z]*") &&
                phone.matches("\\d\\d\\d\\d-\\d\\d\\d\\d")
        ){
            state = true;
        }
        return state;
    }
    
    public static boolean validateDates(Date entry_date, Date out_date){
        Date actual_date = new Date();
        boolean state = false;
        
        if(entry_date.compareTo(actual_date) >= 0 ){
            if(out_date.compareTo(entry_date) >= 0 ){
                state = true;
            }
        }
        return state;
    }
    
    public static String habitacion(String fecha1,String tipo, int canre, String[][] dato){
        
        int ha[]=new int [101];
        int acuhab=0;
        int inihab=0;
        int control=1;
        
        System.out.println("\n"+String.valueOf(canre));
        String v1="";
        
        if (tipo=="Sencilla"){inihab=1;}
        else {inihab=51;}
        
        for (int j = inihab; j <= (inihab+10); j++) {
            for (int i = 0; i < canre; i++) {
                int numero = 0;
                System.out.println("\n"+dato[i][6]+"  "+String.valueOf(i));
                if ( dato[i][6].length()!=0){
                    numero = Integer.parseInt(dato[i][6]);

                    if (numero==j && (dato[i][7]=="Activo"|| dato[i][7]=="Pendiente") && (dato[i][4].length()!=0) ) { 
                        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                        Date fechar1 = null;
                        Date fechar2 = null;
                        Date fechai1 = null;

                        try{
                            fechar1 = df.parse(dato[i][4]);  
                            fechar2=df.parse(dato[i][5]);
                            fechai1 = df.parse(fecha1);  

                            if (fechai1.compareTo(fechar1)>=0 && fechai1.compareTo(fechar2)<=0){acuhab=1;}
                        } catch (Exception e){ }

               //if (fechaingresada.compareTo(fechaheredada)>0){System.out.println("fechas ingresa mayo");}
              // if (fechaingresada.compareTo(fechaheredada)<0){System.out.println("fechas ingresa menor");}
                    }
                }
            }

            if (acuhab==0){
                v1=v1 + j+"                   ";          
                if (control%4==0){
                    v1=v1 +"\n";  
                }
                control=control+1;
                ha[control]=j;
            }                                          
            else{
                acuhab=0;
            }

        }

        String re;
        
        do {
            re=(JOptionPane.showInputDialog( v1+"\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"+
                          "\nIngrese numero de habitacion" ));   
        }  while(numero(re)!=0);
        
        return re;
    }  
    
}
