package Ejercicio;

public class Cadena {

	private Object contenido;
	
	
	public Cadena(Object contenido) {
		this.contenido = contenido;
	}
	
	
	
	public boolean esAnagrama() {
		
		boolean anagrama = false;
		String content = this.contenido instanceof String? (String) contenido: null;
		
		//Refactorización del codigo para CaseSensitive
		if(content!=null) {
			content = content.toLowerCase();			
		}
		
		if(content!=null && !content.isEmpty()	&& !content.trim().isEmpty()) {
			anagrama = true;
			for(int i=0; i<Integer.valueOf(content.length()/2); i++) {
				if(!Character.isAlphabetic(content.charAt(i)) || content.charAt(i)!=content.charAt(content.length()-i-1)) {
					anagrama = false;
				}
			}
		}
		return anagrama;
		
	}
	
	//Metodo eliminado que era repetido
	
	
	public boolean esCapicua() {
		String content = null;
		if (this.contenido instanceof Double) {
			content = this.contenido instanceof Double? String.valueOf(this.contenido): null;
		}
		else if (this.contenido instanceof Integer) {
			content = this.contenido instanceof Integer? String.valueOf(this.contenido): null;
		}
		else if (this.contenido instanceof Long) {
			content = this.contenido instanceof Long? String.valueOf(this.contenido): null;
		}
		
		boolean capicua = content!=null && !content.isEmpty() && !content.trim().isEmpty();
		
		if(capicua) {

			for(int i=0; i<Integer.valueOf(content.length()/2); i++) {
				if(!Character.isDigit(content.charAt(i)) || content.charAt(i)!=content.charAt(content.length()-i-1)) {
					capicua = false;
				}
			}
		}
		return capicua;
		
	}
	//Metodos eliminados que eran repetidos
}
