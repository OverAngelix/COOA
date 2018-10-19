package TP6;

public class CreationDessert {
	Dessert getDessert(String typeDessert) throws ExceptionCreation{
		switch(typeDessert) {
			case "Gaufre":
				return new Gaufre();
			case "Crepe":
				return new Crepe();
			default:
				throw new ExceptionCreation("TYPE INCONNU "+typeDessert);
		}

	}
}
