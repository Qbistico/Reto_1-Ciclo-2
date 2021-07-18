package co.edu.utp.misiontic2022.reto1.p61;

public class VentaProyecto {

    public int Tiempo=0;
    public double Monto=0;
    public double Interes=0;
    public double InteresSimple=0;
    public double InteresCompuesto=0;
    public double diferencia=0;





// Constructores
// -----------------------------------------------------------------
// ...
// -----------------------------------------------------------------
// Métodos
// -----------------------------------------------------------------
public double calcularInteresSimple(int pTiempo, double pMonto, double pInteres){

    return Math.round(InteresSimple=pMonto*(pInteres/100)*pTiempo);
    }



public double calcularInteresSimple(){

    return InteresSimple=0;
    }




public double calcularInteresCompuesto(int pTiempo, double pMonto, double pInteres ){

    return InteresCompuesto= pMonto * (Math.pow (  (1+(pInteres/100)  ) , pTiempo  )  -1);
    }



public double calcularInteresCompuesto(){

    return InteresCompuesto=0;
    }




public String compararInversion (int pTiempo, double pMonto, double pInteres){
    
    diferencia= (Math.round (InteresCompuesto= pMonto * (Math.pow (  (1+(pInteres/100)  ) , pTiempo  )  -1)) - 
    (Math.round(InteresSimple=pMonto*(pInteres/100)*pTiempo)));

    return  "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia ;

    }


public String compararInversion ( ){

    return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
  }

    
    
}
