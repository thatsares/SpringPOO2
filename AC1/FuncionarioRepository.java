package projeto.banco.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.banco.demo.entidade.Funcionario;

//Interface Repository que herda todas as carecterisitcas do JPa repository
//Setando a entidade funcionario e o tipo da chave primaria que é um inteiro
public interface FuncionarioRepository extends JpaRepository <Funcionario, Integer> {
    
}