package com.senac.Estoque.controller;


import com.senac.Estoque.model.Produto;
import com.senac.Estoque.repository.ProdutoRepository;
import com.senac.Estoque.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/estoque")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/produto")
    public String listarProdutos(Model model) {
        model.addAttribute("produtos", produtoRepository.findAll());
        return "estoque";
    }


    @GetMapping("/novo")
    public String NovoProduto(Model model) {
        model.addAttribute("produto", new Produto());
        return "formulario";
    }

    @PostMapping("/novo")
    public String salvarNovoProduto(@RequestBody Produto produto) {
        produtoRepository.save(produto);
        return "estoque";
    }

    @GetMapping("/editar/{id}")
    public String editarProdutoForm(@PathVariable Long id, Model model) {
        Produto produto = produtoRepository.findById(id).orElse(null);
        model.addAttribute("produto", produto);
        return "formularioProduto";
    }

    @PostMapping("/editar/{id}")
    public String atualizarProduto(@PathVariable Long id, @ModelAttribute Produto produto) {
        produto.setId(id);
        produtoRepository.save(produto);
        return "redirect:/estoque";
    }

    @GetMapping("/excluir/{id}")
    public String excluirProduto(@PathVariable Long id) {
        produtoRepository.deleteById(id);
        return "redirect:/estoque";
    }

}
