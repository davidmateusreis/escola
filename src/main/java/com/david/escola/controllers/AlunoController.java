package com.david.escola.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.david.escola.model.Aluno;
import com.david.escola.repositories.AlunoRepository;

@Controller
public class AlunoController {
    
    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping("/cadastrar")
    public ModelAndView InsertAlunos(Aluno aluno) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Aluno/formAluno");
        mv.addObject("aluno", new Aluno());
        return mv;
    }

    @PostMapping("cadastrarnovo")
    public ModelAndView cadastrarAluno(Aluno aluno) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/Aluno/listAlunos");
        alunoRepository.save(aluno);
        return mv;

    }
}
