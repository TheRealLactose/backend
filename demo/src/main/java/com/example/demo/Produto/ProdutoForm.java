package com.example.demo.Produto;

import com.example.demo.Fornecedor.Fornecedor;
import com.example.demo.Fornecedor.FornecedorDTO;
import com.example.demo.TipoProduto.TipoProduto;
import com.example.demo.TipoProduto.TipoProdutoDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoForm {

    private String nome;
    private Integer quantidade;
    private Double precovenda;
    private Double precocompra;

    private TipoProduto tipoProduto;

    private Fornecedor fornecedor;

}
