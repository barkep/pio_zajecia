package pio_zajecia;



public class Kod {

	public static void main(String[] args) {
		
		 Player player=new PlayerComp("Janusz"); 
		 Game game=new Game();
		 game.addPlayer(player); 
		 game.addPlayer(new PlayerComp("Janusz"));
		 for(int i=0;i<10000;i++) {
		 game.play();
		 }
		 game.printStats();
	}
}

// REFAKTORYZACJA
// REGRESJA
// ZASADA OTWARTE-ZAMKNIETE
// ABSTRAKCJA, HERMETYZACJA, POLIMORFIZM, DZIEDZICZENIE
// TRY CATCH
// KONSTRUKTOR PARAMETROWY/ BEZPARAMETROWY
// FINAL
// ITERATOR
/*ARRAY LIST
ArrayList<String> list = new ArrayList();
list.add("pierwszy");
list.add("drugi");
list.add("pierwszy1");
list.add("drugi1");
for (int i = 0; i < list.size(); i++) {
	System.out.println(list.get(i));
}
System.out.println("------------------------------");
for (String element : list) { // petla for each, nie wolno w niej modyfikowac listy
	System.out.println(element);
}
System.out.println("------------------------------");
Iterator<String> ite = list.iterator();
while (ite.hasNext() == true) {
	String element = ite.next();
	System.out.println(element);
}
System.out.println("------------------------------");
Iterator<String> it = list.iterator();
while (it.hasNext() == true) {
	System.out.println(it.next());
}
System.out.println("------------------------------");
System.out.println(list.toString());
System.out.println("------------------------------");
System.out.println(list);
*/