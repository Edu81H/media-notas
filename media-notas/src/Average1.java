import javax.swing.JOptionPane;

//Class average program with repetition controlled by accountant.
//Programa de m�dia da turma com repeti��o contralada por contador.
public class Average1 {

	public static void main(String[] args) 
	{
		int total,     //soma da notas digitadas pelo usu�rio.
		gradeCounter,   //n�mero de notas lida.
		gradeValue,    //m�dia de todas as notas.
		average;       //valor da nota.  
		String grade;   //nota digitada pelo usu�rio.
	
      total = 0; //limpa a vari�vel
      gradeCounter = 1; //prepara para executar o la�o
      // Fase de processamento
      while (gradeCounter <= 10) { //executa o la�o 10 vezes
    	  // solicita entrada e l� a nota digitada pelo usu�rio
    	  grade = JOptionPane.showInputDialog("Enter integer grade:");
    	  //converte a nota de String para inteiro
    	  gradeValue = Integer.parseInt(grade);
    	  // adiciona gradeValue ao total
    	  total = total + gradeValue;
    	  //adiciona 1 ao gradeCounter
    	  gradeCounter = gradeCounter + 1;    	  
      } //fim da estrutura while
        average = total / 10;
        //exibe a m�dia das notas do teste
        JOptionPane.showMessageDialog(null, "Class average is" + average,
        		"Class Average",  JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);  // termina o programa
	}	// fim do m�todo main	  
} // fim da classe Average1
