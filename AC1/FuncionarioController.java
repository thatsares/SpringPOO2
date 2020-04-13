package projeto.banco.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import projeto.banco.demo.service.FuncionarioService;

//DEFININDO ESTA CLASSE COMO CONTROLLER
@Controller
public class FuncionarioController {

    @Autowired
    private FuncionarioService servico;

    //METODO QUE DEVOLVE TODOS OS FUNCIONARIOS PARA O TEMPLATE
    //GET MAPPING MAPEANDO A URL DO CHAMADO
    @GetMapping("/funcionario")
    public ModelAndView getFuncionarios(){
        
        ModelAndView mv = new ModelAndView("funcionarios");
        //DEFININDO O MODELO PARA O MODEL AND VIEW QUE SERÁ A LISTA DE FUNCIONARIOS
        mv.addObject("funcionarios", servico.getFuncionarios());
        return mv;
    }

}