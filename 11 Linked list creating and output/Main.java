public class Main {
	
	public static void main(String [] args) {
		
		Elem head = null;
		
		//создать 1 элемент 901
		
		Elem p = new Elem();
		p.value = 901;
		p.next = head;
		head = p;
		
		//создать 2 элемент 11
		
		p = new Elem();
		p.value = 11;
		p.next = head;
		head = p;
		
		//создать 3 элемент 2020
		
		p = new Elem();
		p.value = 2020;
		p.next = head;
		head = p;
		
		// вывести на экран список:
		
		p = head;						// i = 0
		while (p != null){				// while (i < n)
			// что-то делаем с p.value	
			p = p.next;					// i += 1
		}
		
		
		
		
	}
	
	
	// hw: создание линейного одн.списка - в прямом и обратном порядке
	// вывести список на экран
	// сумма элементов списка
	// проверить наличие в списке четного числа
	
}