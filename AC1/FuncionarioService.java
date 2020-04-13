package projeto.banco.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.banco.demo.entidade.Funcionario;
import projeto.banco.demo.repository.FuncionarioRepository;

//DECLARAR QUE É UM SERVICE
@Service
public class FuncionarioService {

    //INJEÇANDO O REPOSITÓRIO PARA UTILIZAÇÃO DOS SERVIÇOS
    @Autowired
    private FuncionarioRepository repository;

    public List<Funcionario> getFuncionarios(){
        return repository.findAll();
    }
}