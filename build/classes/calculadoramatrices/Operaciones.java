package calculadoramatrices;

import javax.swing.JOptionPane;

public class Operaciones  {

    public int[][] sumaMatriz(int m1[][], int m2[][]) {
        int[][] mResultado = new int[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                mResultado[i][j] = m1[i][j] + m2[i][j];
            }
        }
        String v1="";
    for (int i = 0; i <mResultado.length ; i++) {
        for (int j = 0; j < mResultado.length; j++) {
             v1+=" "+mResultado[i][j];
        }
        v1+="\n";
    }
     JOptionPane.showMessageDialog(null,"\t"+ v1);

        return mResultado;
    }
      public int[][] restaMatriz(int m1[][], int m2[][]) {
        int[][] mResultado = new int[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                mResultado[i][j] = m1[i][j] - m2[i][j];
            }
        }
        String v1="";
    for (int i = 0; i <mResultado.length ; i++) {
        for (int j = 0; j < mResultado.length; j++) {
             v1+=" "+mResultado[i][j];
        }
        v1+="\n";
    }
     JOptionPane.showMessageDialog(null,"\t"+ v1);

        return mResultado;
    }
  
   public int trazaMatriz1(int m1[][]) {
         int mResultado1=0;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                if(i==j){
                mResultado1 += m1[i][j] ;
                }
            }  
        } 
          JOptionPane.showMessageDialog(null,"La traza de la matriz 1 es: "+mResultado1); 
        return mResultado1;
   }
        public int trazaMatriz2( int m2[][]) {
        int mResultado2=0;
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                if(i==j){
                mResultado2 += m2[i][j] ;
                
                }
            }
            
        } 
        JOptionPane.showMessageDialog(null,"La traza de la matriz 2 es: "+mResultado2); 
        return mResultado2;
        
        }
                  
}
