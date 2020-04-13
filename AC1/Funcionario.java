//notações novas: @entity - indica que é uma entidade
//@id - fica antes da chave primaria
//Serializable - necessário em todas as entidades para cirar o serial id do JPA

package projeto.banco.demo.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

//MAPEAR ESTA CLASSE COMO UMA TABELA DO BANCO DE DADOS
//INDICA QUE NOSSA CLASSE É UMA ENTIDADE JPA
//TODA ENTIDADE POSSUI UM MAPEAMENTO PARA UMA TABELA NO BANCO
//PRECISA INDICAR QUAL ATRIBUTO VAI SER UMA CHAVE PRIMARIA
@Entity
public class Funcionario implements Serializable { //SERIALIZABLE É SOLICITADO DENTRO DO JPA, É OBRIGATÓRIO QUE TODAS AS ENTIDADES SEJAM MARCADAS
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    // TODAS AS VEZES QUE MARCAMOS UMA ENTIDADE COMO SERIALIZABLE PRECISAMOS MARCAR
    // O SERIAL ID
    
    //O @ID INDICA QUE O MATRICULA É CHAVE PRIMAIRA DENTRO DO BANCO DE DADOS JPA
    @Id
    private int matricula;
    private String nome;
    private String cpf;
	private int dependentes;
	private String cargo;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf (String cpf) {
        this.cpf = cpf;
    }
	
	public int getDependentes() {
		return dependentes;
	}
	
	public void setDependentes (int dependentes) {
        this.dependentes = dependentes;
    }
	
	public int getCargo() {
		return cargo;
	}
	
	public void setCargo (String cargo) {
        this.cargo = cargo;
    }
    
}