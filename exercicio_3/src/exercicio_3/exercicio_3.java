package exercicio_3;

public class exercicio_3 {

	public static void main(String[] args) {

		// Criando DB
		FakeDb db = new FakeDb();
		APIVehicleFakeDb api = new APIVehicleFakeDb(db);

		// Carregando DB (POST)
		Long id = api.post(new Vehicle("City", "Honda", 1990, "City Descrição", false));
		Long id2 = api.post(new Vehicle("Civic", "Honda", 1991, "Civic Descrição", false));
		Long id3 = api.post(new Vehicle("Gol", "Volkswagen", 1992, "Gol Descrição", false));
		api.post(new Vehicle("Palio", "Fiat", 1993, "Palio Descrição", false));
		api.post(new Vehicle("Celta", "Chevrolet", 1994, "Celta Descrição", false));

		// Visualizando o DB (GET)
		System.out.println(api.get().toString());

		// Criando um veiculo (POST)
		Vehicle vehicle = new Vehicle("Corsa", "Chevrolet", 2005, "Corsa Descrição", false);
		id = api.post(vehicle);
		vehicle = api.get(id);
		// Visualizando a atualização
		System.out.println(vehicle.toString());

		// Atualizando um veiculo (POST com id)
		vehicle = api.get(id2);
		vehicle.setAno(2001);
		vehicle = api.get(api.post(id2, vehicle));
		// Visualizando a atualização
		System.out.println(vehicle.toString());

		// Atualizando um veiculo (PATCH)
		vehicle = api.get(id3);
		vehicle.setAno(2005);
		vehicle = api.get(api.patch(id3, vehicle));
		// Visualizando a atualização
		System.out.println(vehicle.toString());

		// Visualizando o DB (GET)
		System.out.println(api.get().toString());

		// Deletando um elemento
		api.delete(id3);
		// Visualizando o DB (GET)
		System.out.println(api.get().toString());

	}

}
