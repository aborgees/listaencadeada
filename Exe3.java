import java.util.LinkedList;
public class Exe3 {

		public static void main (String[]args) {
			LinkedList<Integer>lista = new LinkedList<Integer>();
			Integer soma = 0;

			lista.add(1);
			lista.add(2);
			lista.add(3);
			lista.add(4);

			System.out.println("A posição do elemento na lista eh:" +lista);

			for (int contador =0;contador< lista.size();contador++) {
				soma=soma+lista.get(contador);
			}
			System.out.println("A soma do elemento da lista eh:" +soma);
		}
}
