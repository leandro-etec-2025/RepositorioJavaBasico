import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClasseRegEx {

	public static void main(String[] args) {

		String texto = "roberto2025@gmail.com";
		String password = "123456";
		Pattern subtextoPadrao = Pattern.compile("[a-zA-Z0-9_#-]{1}[a-zA-Z0-9_#-]+@gmail.com");
		Pattern padraoSenha = Pattern.compile("[0-9]{6}");
		Matcher combina = subtextoPadrao.matcher(texto);
		Matcher combina2 = padraoSenha.matcher(password);
		if(combina2.matches()) {
			System.out.println("Validado!");	
		} else{
			System.out.println("Não Validado!");
		}
		// git add .
		// git commit -m "Realizado RegEx"
		// git push -u origin main
		
	}
}

