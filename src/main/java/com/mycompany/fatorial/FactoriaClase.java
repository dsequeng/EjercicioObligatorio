package com.mycompany.fatorial;

public class FactoriaClase {
    private Object validacion (int numero ){
    
        if(numero<0){
            return "Esta función solo acepta números positivos o cero!!!";
        }
        else if(numero==100) 
        {
            long numerito =Long.parseLong("9999999999");            
            return numerito;
        }
        else if(numero<10)
        {
            String[] numeros ={"1","1","2","6","24","120","720","5040","40320","362880"};
            return numeros;
        }
        else{
                int resultado = 1;
                for (int i =1; i <=numero; i++)
                {
                resultado *=i;
                }
        return resultado;
        }
    }
        
        public Object Factorial(int[] listaNumeros)
        {
            Object[] Resultados = new Object[12];
        
            for(int a=0;a<=listaNumeros.length;a++) 
            {
                Resultados[a]=validacion(listaNumeros[a]);
            }
            
            return Resultados;
        }
    
}
