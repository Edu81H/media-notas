import javax.swing.JOptionPane;

//Class average program with repetition controlled by accountant.
//Programa de média da turma com repetição contralada por contador.
public class Average1 {

	public static void main(String[] args) 
	{
		int total,     //soma da notas digitadas pelo usuário.
		gradeCounter,   //número de notas lida.
		gradeValue,    //média de todas as notas.
		average;       //valor da nota.  
		String grade;   //nota digitada pelo usuário.
	
      total = 0; //limpa a variável
      gradeCounter = 1; //prepara para executar o laço
      // Fase de processamento
      while (gradeCounter <= 10) { //executa o laço 10 vezes
    	  // solicita entrada e lê a nota digitada pelo usuário
    	  grade = JOptionPane.showInputDialog("Enter integer grade:");
    	  //converte a nota de String para inteiro
    	  gradeValue = Integer.parseInt(grade);
    	  // adiciona gradeValue ao total
    	  total = total + gradeValue;
    	  //adiciona 1 ao gradeCounter
    	  gradeCounter = gradeCounter + 1;    	  
      } //fim da estrutura while
        average = total / 10;
        //exibe a média das notas do teste
        JOptionPane.showMessageDialog(null, "Class average is" + average,
        		"Class Average",  JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);  // termina o programa
	}	// fim do método main	  
} // fim da classe Average1
