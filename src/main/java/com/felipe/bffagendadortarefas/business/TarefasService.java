package com.felipe.bffagendadortarefas.business;

import com.felipe.bffagendadortarefas.business.dto.in.TarefasDTORequest;
import com.felipe.bffagendadortarefas.business.dto.out.TarefasDTOResponse;
import com.felipe.bffagendadortarefas.infrastructure.client.TarefasClient;
import com.felipe.bffagendadortarefas.infrastructure.enums.StatusNotificacaoEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TarefasService {

    private final TarefasClient tarefasClient;

    public TarefasDTOResponse gravarTarefa(String token, TarefasDTORequest dto){
        return tarefasClient.gravarTarefas(dto, token);
    }

    public List<TarefasDTOResponse> buscaTarefaAgendadasPorPeriodo(LocalDateTime dataInicial,
                                                                   LocalDateTime dataFinal,
                                                                   String token){
        return tarefasClient.buscaListaDeTarefasPorPeriodo(dataInicial, dataFinal, token);
    }

    public List<TarefasDTOResponse> buscaTarefasPorEmail(String token){
        return tarefasClient.buscaTarefasPorEmail(token);
    }

    public void deletaTarefaporId(String id, String token){
         tarefasClient.deletaTarefaPorId(id, token);
    }

    public TarefasDTOResponse alteraStatus(StatusNotificacaoEnum status, String id, String token){
        return tarefasClient.alteraStatusNotificacao(status, id, token);
    }

    public TarefasDTOResponse upDateTarefas(TarefasDTORequest dto, String id, String token){
       return  tarefasClient.updateTarefas(dto, id, token);
    }
}
