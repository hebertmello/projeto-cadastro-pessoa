package br.com.hfdm.projetocadastropessoa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entidade Pessoa
 *
 * @author Hebert Falcão (<a href="mailto:hebert.mello@gmail.com</a>)
 * @since 9 de out de 2018
 */
@Entity(name = "Pessoa")
public class Person {

	/** Identificador. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/** Nome. */
	private String nome;

	/** CPF. */
	private String cpf;

	/** Tipo Logradouro (Rua, Avenida). */
	private String tipoLogradouro;

	/** Logradouro. */
	private String logradouro;

	/** Numero do Logradouro */
	private Integer numeroLogradouro;

	/** Bairro. */
	private String bairro;

	/** Cidade. */
	private String cidade;

	/** Estado. */
	private String estado;

	/** Telefone Celular. */
	private String telefoneCelular;

	/** Telefone Fixo. */
	private String telefoneFixo;

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(final String cpf) {
		this.cpf = cpf;
	}

	public String getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(final String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(final String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumeroLogradouro() {
		return numeroLogradouro;
	}

	public void setNumeroLogradouro(final Integer numeroLogradouro) {
		this.numeroLogradouro = numeroLogradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(final String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(final String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(final String estado) {
		this.estado = estado;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(final String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(final String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

}
