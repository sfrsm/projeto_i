package exercicio_3;

import java.util.List;

/**
 * Implementação da classe que faz a manipulação do objeto na base de dados.
 * 
 * @author samuel
 *
 */
public class APIVehicleFakeDb {

	/**
	 * Parametro para simular conexão com a base de dados
	 */
	private FakeDb connection = null;

	/**
	 * Construtor da API
	 * 
	 * @param connection objeto {@link FakeDb}.
	 */
	public APIVehicleFakeDb(FakeDb connection) {
		this.connection = connection;
	}

	/**
	 * Retorna todos as entradas de veículos da base
	 * 
	 * @return um {@link List} de {@link Vehicle}.
	 */
	public List<Vehicle> get() {
		return connection.getAll();
	}

	/**
	 * Retorna o veículo com o id buscado
	 * 
	 * @param id identificador do veículo
	 * @return {@link Vehicle} com o identificador informado
	 */
	public Vehicle get(Long id) {
		return connection.getVehicle(id);
	}

	/**
	 * Adiciona um veículo
	 * 
	 * @param vehicle {@link Vehicle} a ser inserido.
	 * @return o identificador do veículo, -1 em caso de falha.
	 */
	public Long post(Vehicle vehicle) {
		Long retCode = -1L;
		Vehicle temp = connection.insert(vehicle);
		if (temp != null) {
			retCode = temp.getId();
		}
		return retCode;
	}

	/**
	 * Atualiza um veículo
	 * 
	 * @param id      identificador do veículo a ser atualizado.
	 * @param vehicle {@link Vehicle} a ser atualizado.
	 * @return o identificador do veículo, -1 em caso de falha.
	 */
	public Long post(Long id, Vehicle vehicle) {
		Long retCode = -1L;
		if (id != vehicle.getId()) {
			return retCode;
		}

		Vehicle temp = connection.update(vehicle);
		if (temp != null) {
			retCode = temp.getId();
		}

		return retCode;
	}

	/**
	 * Atualiza um veículo
	 * 
	 * @param id      identificador do veículo a ser atualizado.
	 * @param vehicle {@link Vehicle} a ser atualizado.
	 * @return o identificador do veículo, -1 em caso de falha.
	 */
	public Long patch(Long id, Vehicle vehicle) {
		Long retCode = post(id, vehicle);

		return retCode;
	}
	
	/**
	 * Remove o veículo com o id especificado
	 * @param identificador id do veículo a ser removido
	 * @return true em caso de remoção, false em caso de não remoção.
	 */
	public boolean delete(Long id) {
		return connection.delete(id);
	}
	
	/**
	 * Valida se o veículo está criado de forma correta
	 * @param vehicle objeto a ser validado
	 * @return true se objeto válido, false se objeto inválido
	 */
	private boolean Validate(Vehicle vehicle) {
		String pattern = "Volkswagen, Ford, Chevrolet, Honda, Fiat";
		
		return vehicle.getMarca().matches(pattern);
	}

}
