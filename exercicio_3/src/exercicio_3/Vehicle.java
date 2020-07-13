package exercicio_3;

import java.util.Date;

/**
 * Classe para mapear o objeto veículo
 * 
 * @author samuel
 */
public class Vehicle {
	private Long id;
	private String veiculo;
	private String marca;
	private Integer ano;
	private String descricao;
	private Boolean vendido;
	private Date created;
	private Date updated;

	/**
	 * Construtor
	 * @param veiculo nome do veículo
	 * @param marca marca do veículo
	 * @param ano ano de fabricação
	 * @param descricao descrição do veículo
	 * @param vendido se foi vendido ou não
	 */
	public Vehicle(String veiculo, String marca, int ano, String descricao, boolean vendido) {
		this.veiculo = veiculo;
		this.marca = marca;
		this.ano = ano;
		this.descricao = descricao;
		this.vendido = vendido;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getVendido() {
		return vendido;
	}

	public void setVendido(Boolean vendido) {
		this.vendido = vendido;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		String toString = new String();
		
		toString = "ID: " + id;
		toString += " VEICULO: " + veiculo;
		toString += " MARCA: " + marca;
		toString += " ANO: " + ano;
		toString += " DESCRICAO: " + descricao;
		toString += " VENDIDO: " + vendido;
		toString += " CREATED: " + created.toString();
		toString += " UPDATED: " + updated.toString() + "\n";
		
		return toString;
	}
}
