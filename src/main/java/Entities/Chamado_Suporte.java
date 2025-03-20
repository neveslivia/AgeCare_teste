package Entities;

import java.time.LocalDateTime;

public class Chamado_Suporte {
    private int id_chamado;
    private int id_usuario;
    private String titulo;
    private String descricao;
    private Status_Chamado status;
    private LocalDateTime Data_Solicitacao;
    private LocalDateTime Data_Conclusao;


    public Chamado_Suporte(int id_usuario, String titulo, String descricao, Status_Chamado status, LocalDateTime data_Solicitacao, LocalDateTime data_Conclusao) {
        this.id_usuario = id_usuario;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
        Data_Solicitacao = data_Solicitacao;
        Data_Conclusao = data_Conclusao;
    }



}
