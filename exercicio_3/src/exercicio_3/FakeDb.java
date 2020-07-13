package exercicio_3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FakeDb {

	private Long id = 0L;
	private Map<Long, Vehicle> db = new HashMap<Long, Vehicle>();

	/**
	 * Realiza a inserção de um veiculo
	 * 
	 * @param vehicle objeto do tipo {@link Vehicle}.
	 * @return objeto inserido ou null em caso de falha.
	 */
	Vehicle insert(Vehicle vehicle) {
		vehicle.setId(++id);
		Date created = new Date();
		vehicle.setCreated(created);
		vehicle.setUpdated(created);
		db.put(id, vehicle);
		return db.get(vehicle.getId());
	}

	/**
	 * Realiza a remoção de um veiculo
	 * 
	 * @return true em caso de sucesso, false em caso de falha.
	 */
	boolean delete(Long id) {
		return (db.remove(id) != null) ? true : false;
	}

	/**
	 * Busca um veículo na base
	 * 
	 * @param id identificador na base do objeto {@link Vehicle}.
	 * @return um objeto {@link Vehicle} ou null caso não encontre.
	 */
	Vehicle getVehicle(Long id) {
		return db.get(id);
	}

	/**
	 * Função para ler todos as entradas de base
	 * 
	 * @return um {@link List} de {@link Vehicle}.
	 */
	List<Vehicle> getAll() {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();

		vehicles.addAll(db.values());

		return vehicles;
	}

	/**
	 * Atualiza um veículo na base
	 * 
	 * @param vehicle objeto do tipo {@link Vehicle} a ser atualizado
	 * @return objeto inserido ou null em caso de falha.
	 */
	Vehicle update(Vehicle vehicle) {
		vehicle.setUpdated(new Date());
		return db.put(vehicle.getId(), vehicle);
	}

}
